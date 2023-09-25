buildscript {

    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.6.0")

    }
}
plugins {
    id("com.android.application") version "8.1.1" apply false
    id ("com.android.library") version "8.0.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.8.21" apply false
}
allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.google.com") }
    }}