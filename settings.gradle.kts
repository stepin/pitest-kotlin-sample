rootProject.name = "pitest-kotlin-sample"

pluginManagement {
    val pitestVersion: String by settings
    plugins {
        id("info.solidsoft.pitest") version "$pitestVersion"
    }

    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/stepin/pitest-kotlin")
        }
    }
}
