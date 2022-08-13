package com.walter.digivice.config

import com.walter.digivice.utils.implementation
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

fun Project.implementCoil() {
    implementCoilDependencies()
}

private fun Project.implementCoilDependencies() {
    dependencies {
        implementation ("io.coil-kt:coil:2.1.0")
        implementation("io.coil-kt:coil-compose:2.1.0")
    }
}
