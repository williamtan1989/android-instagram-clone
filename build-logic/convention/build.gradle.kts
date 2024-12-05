import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.williamtan1989.androidinstagramclone.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// libs.versions.tomlに追記
dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.compose.gradlePlugin)
////    compileOnly(libs.firebase.crashlytics.gradlePlugin)
////    compileOnly(libs.firebase.performance.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
////    compileOnly(libs.room.gradlePlugin)
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("androidCommonLibrary") {
            id = "com.williamtan1989.androidinstagramclone.androidcommonlibrary"
            implementationClass = "com.williamtan1989.androidinstagramclone.AndroidCommonLibraryPlugin"
        }
        
        register("androidLibrary") {
            id = "com.williamtan1989.androidinstagramclone.androidlibrary"
            implementationClass = "com.williamtan1989.androidinstagramclone.AndroidLibraryPlugin"
        }
    }
}