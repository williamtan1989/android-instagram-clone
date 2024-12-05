package com.williamtan1989.androidinstagramclone

import com.android.build.api.dsl.CommonExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidLibraryPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            pluginManager.apply(AndroidCommonLibraryPlugin::class)

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
            }
        }
    }

    private fun Project.configureKotlinAndroid(
        commonExtension: CommonExtension<*, *, *, *, *, *>
    ) {
        dependencies {
            add("implementation", project(":common-ui"))
        }
    }
}