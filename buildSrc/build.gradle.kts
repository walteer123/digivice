import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    java
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins{
        register("digivice.android.library") {
            id = "digivice.android.library"
            implementationClass = "com.walter.digivice.DigiviceAndroidLibrary"
        }
    }
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
}