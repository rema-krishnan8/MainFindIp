
buildscript {
    /*  ext {
          compose_ui_version = '1.2.0'
      }*/
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
       // classpath("org.mockito:mockito-gradle-plugin:3.12.4")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}