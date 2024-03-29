plugins {
    id("com.android.application") version ("7.1.2") apply false
    id("com.android.library") version ("7.1.2") apply false
    id("org.jetbrains.kotlin.android") version ("1.6.10") apply false
    id("org.jetbrains.kotlin.jvm") version ("1.6.10") apply false
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.6.10")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
