package com.walter.digivice.config

import com.walter.digivice.Dependencies
import com.walter.digivice.utils.debugImplementation
import com.walter.digivice.utils.implementation
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

fun Project.implementJetpack() {
    implementCompose()
}

private fun Project.implementCompose() {

    dependencies {
        implementation(Dependencies.composeUi)
        implementation(Dependencies.composeMaterial)
        implementation(Dependencies.composeUiToolingPreview)
        implementation(Dependencies.activityCompose)
        debugImplementation(Dependencies.composeUiTooling)
    }
}

