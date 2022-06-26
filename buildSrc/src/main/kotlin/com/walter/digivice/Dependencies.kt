package com.walter.digivice

object Dependencies {


    private const val ktorVersion = "2.0.1"
    private const val hiltVersion = "2.42"
    private const val hiltNavVersion = "1.0.0"
    private const val composeVersion = "1.1.1"

    const val ktorClientCore = "io.ktor:ktor-client-core:$ktorVersion"
    const val ktorClientAndroid = "io.ktor:ktor-client-android:$ktorVersion"
    const val ktorClientContentNegotiation =
        "io.ktor:ktor-client-content-negotiation:$ktorVersion"
    const val ktorSerialization = "io.ktor:ktor-serialization-kotlinx-json:$ktorVersion"

    const val hiltCore = "com.google.dagger:hilt-core:$hiltVersion"
    const val hiltAndroid = "com.google.dagger:hilt-android:$hiltVersion"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:$hiltNavVersion"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"

    const val composeUi = "androidx.compose.ui:ui:$composeVersion"
    const val composeMaterial = "androidx.compose.material:material:$composeVersion"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"

    const val coreKtx = "androidx.core:core-ktx:1.8.0"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"
    const val activityCompose = "androidx.activity:activity-compose:1.4.0"

}
