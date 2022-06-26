package com.walter.digivice.config

import com.walter.digivice.Dependencies
import com.walter.digivice.utils.implementation
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

fun Project.implementKtor() {
    implementKtorDependencies()
}

private fun Project.implementKtorDependencies() {

    dependencies {
        implementation(Dependencies.ktorClientCore)
        implementation(Dependencies.ktorClientAndroid)
        implementation(Dependencies.ktorClientContentNegotiation)
        implementation(Dependencies.ktorSerialization)
    }
}
