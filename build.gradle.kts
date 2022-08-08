buildscript {
    repositories {
        google()
        mavenCentral()
        maven{
            url = uri("https://jitpack.io")
        }
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.1")
    }
}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}