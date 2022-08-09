import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    java
    `kotlin-dsl`
    `java-gradle-plugin`
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    implementation("com.android.tools.build:gradle:7.1.3")
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