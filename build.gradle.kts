import net.ltgt.gradle.errorprone.errorprone

plugins {
    `java-library`
    `maven-publish`
    embeddedKotlin("jvm")
    id("com.apollographql.apollo") version "4.3.1"
    id("org.owasp.dependencycheck") version "12.1.3"
    id("net.ltgt.errorprone") version "4.3.0"
}

group = "com.ebay"
version = "0.2.0"

java {
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    // REST: Kiota runtime
    api("com.microsoft.kiota:microsoft-kiota-bundle:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-json:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-text:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-form:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-multipart:1.9.3")

    // Jakarta annotations (required by Kiota generated code)
    compileOnly("jakarta.annotation:jakarta.annotation-api:2.1.1")

    // GraphQL: Apollo Kotlin runtime
    implementation("com.apollographql.apollo:apollo-runtime:4.3.1")

    // HTTP: OkHttp (shared by Kiota adapter and Apollo)
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // JSON for DynamicGraphQLClient escape hatch
    implementation("com.fasterxml.jackson.core:jackson-databind:2.21.5")

    // Kotlin coroutines for Future integration (matches eBay Android)
    api(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.10.2"))
    api("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8")

    // SLF4J for logging
    implementation("org.slf4j:slf4j-api:2.0.17")

    errorprone("com.google.errorprone:error_prone_core:2.42.0")
    errorprone("com.uber.nullaway:nullaway:0.12.10")

}

apollo {
    service("orderManagement") {
        packageName.set("com.ebay.ordermanagement.generated.graphql")
        srcDir("src/main/graphql")
        // Apollo looks for schema.graphqls and *.graphql in srcDir
    }
}

// SEC-011: CVE scanning — run with: ./gradlew dependencyCheckAnalyze
dependencyCheck {
    failBuildOnCVSS = 7.0f
    suppressionFile = "dependency-check-suppressions.xml"
    analyzers {
        assemblyEnabled = false
        ossIndexEnabled = false
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
            version = "0.2.0"
        }
    }
}


val lintRequested = gradle.startParameter.taskNames.any { it == "lint" || it.endsWith(":lint") }

tasks.withType<JavaCompile>().configureEach {
    inputs.property("lintRequested", lintRequested)
    options.errorprone {
        isEnabled.set(lintRequested)
        disableWarningsInGeneratedCode.set(true)
        excludedPaths.set(".*/generated/.*")
        error("NullAway")
        option("NullAway:AnnotatedPackages", "com.ebay.ordermanagement")
        option("NullAway:UnannotatedSubPackages", "com.ebay.ordermanagement.generated")
    }
}

tasks.register("lint") {
    group = "verification"
    description = "Static analysis of handwritten sources (Kiota output excluded)."
    dependsOn("classes")
}
