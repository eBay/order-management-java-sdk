plugins {
    `java-library`
    `maven-publish`
    embeddedKotlin("jvm")
    id("com.apollographql.apollo") version "4.3.1"
    id("org.owasp.dependencycheck") version "12.1.3"
}

group = "com.ebay"
version = "1.0.0"

java {
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    // REST: Kiota runtime
    api("com.microsoft.kiota:microsoft-kiota-bundle:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-json:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-text:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-form:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-multipart:1.9.2")

    // Jakarta annotations (required by Kiota generated code)
    compileOnly("jakarta.annotation:jakarta.annotation-api:2.1.1")

    // GraphQL: Apollo Kotlin runtime
    implementation("com.apollographql.apollo:apollo-runtime:4.3.1")

    // HTTP: OkHttp (shared by Kiota adapter and Apollo)
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // JSON for DynamicGraphQLClient escape hatch
    implementation("com.fasterxml.jackson.core:jackson-databind:2.21.2")

    // Kotlin coroutines for Future integration (matches eBay Android)
    api(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.10.2"))
    api("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8")

    // SLF4J for logging
    implementation("org.slf4j:slf4j-api:2.0.17")

    testImplementation("com.squareup.okhttp3:mockwebserver:4.12.0")
}

apollo {
    service("orderManagement") {
        packageName.set("com.ebay.ordermanagement.generated.graphql")
        srcDir("src/main/graphql")
        // Apollo looks for schema.graphqls and *.graphql in srcDir
    }
}

tasks.test { useJUnitPlatform() }

// SEC-011: CVE scanning — run with: ./gradlew dependencyCheckAnalyze
dependencyCheck {
    failBuildOnCVSS = 7.0f          // Fail on High (7.0+) and Critical CVEs
    suppressionFile = "dependency-check-suppressions.xml"
    analyzers {
        assemblyEnabled = false     // Not needed for JVM-only project
        ossIndexEnabled = false     // Requires Sonatype credentials — disabled
    }
    nvd {
        apiKey = System.getenv("NVD_API_KEY") ?: ""
    }
}

// SEC-011: Prevent unexpected transitive version upgrades
// To generate lock files: ./gradlew dependencies --write-locks
dependencyLocking {
    lockAllConfigurations()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = "com.ebay"
            artifactId = "order-management-java-sdk"
            version = "1.0.0"
        }
    }
}
