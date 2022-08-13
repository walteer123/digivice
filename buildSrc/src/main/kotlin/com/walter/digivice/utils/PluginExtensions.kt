package com.walter.digivice.utils

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

//fun Project.androidExtension(lambda: BaseExtension.() -> Unit){
//    with(extensions.getByName("android")){
//
//    }
//}