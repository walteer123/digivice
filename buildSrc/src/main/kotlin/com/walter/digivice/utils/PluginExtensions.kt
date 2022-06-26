package com.walter.digivice.utils

import org.gradle.api.Project
import org.gradle.api.plugins.BasePluginExtension
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.implementation(library: String){
    add("implementation", library)
}

fun DependencyHandlerScope.testImplementation(library: String){
    add("testImplementation", library)
}

fun DependencyHandlerScope.debugImplementation(library: String){
    add("debugImplementation", library)
}

fun DependencyHandlerScope.kapt(library: String) {
    add("kapt" ,library)
}

fun Project.androidExtension(lambda: BasePluginExtension.() -> Unit){
    with(extensions.getByName("android")){
        
    }
}