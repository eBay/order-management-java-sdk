pluginManagement {
    repositories {
        maven {
            url = uri("https://artifactory.corp.ebay.com/artifactory/android/")
        }
        gradlePluginPortal()  // Fallback
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://artifactory.corp.ebay.com/artifactory/android/")
        }
        mavenCentral()  // Fallback
    }
}

rootProject.name = "order-management-java-sdk"
