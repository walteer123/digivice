package com.walter.digivice

import com.walter.digivice.config.implementHilt
import com.walter.digivice.config.implementJetpack
import com.walter.digivice.config.implementKtor
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class DigiviceAndroidLibrary : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            applyPlugins()
            implementKtor()
            implementHilt()
            implementJetpack()
        }
    }

    private fun Project.applyPlugins() {
        plugins.apply {
            apply("com.android.library")
            apply("org.jetbrains.kotlin.android")
            apply("kotlin-kapt")
            apply("org.jetbrains.kotlin.plugin.serialization")
        }
    }

}
