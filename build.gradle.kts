// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false


    //ksp 플러그인 추가를 위한 작업

//    id("com.google.devtools.ksp") version "1.8.22-1.0.9" apply false
    id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false
}