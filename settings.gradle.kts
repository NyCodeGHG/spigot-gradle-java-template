rootProject.name = "spigot-gradle-java-template"

pluginManagement {
    val spigradle_version: String by settings
    val shadow_version: String by settings

    plugins {
        java
        id("kr.entree.spigradle") version spigradle_version
        id("com.github.johnrengelman.shadow") version shadow_version
    }
}