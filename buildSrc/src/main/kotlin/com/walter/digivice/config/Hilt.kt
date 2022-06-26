package com.walter.digivice.config

import com.walter.digivice.Dependencies
import com.walter.digivice.utils.implementation
import com.walter.digivice.utils.kapt
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

fun Project.implementHilt() {
    implementHiltDependencies()
}

private fun Project.implementHiltDependencies() {
    plugins.apply("dagger.hilt.android.plugin")

    dependencies {
        implementation(Dependencies.hiltCore)
        implementation(Dependencies.hiltAndroid)
        implementation(Dependencies.hiltNavigationCompose)
        kapt(Dependencies.hiltAndroidCompiler)
    }
}
