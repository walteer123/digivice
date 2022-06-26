import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins.register("digivice.android.library") {
        id = "digivice.android.library"
        implementationClass = "com.walter.digivice.DigiviceAndroidLibrary"
    }
}


repositories {
    mavenCentral()
}