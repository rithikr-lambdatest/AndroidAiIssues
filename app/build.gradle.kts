plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.androidaiissues"
    compileSdk = 36

    // Output AndroidAiIssues.apk so the build is recognizable at a glance.
    applicationVariants.all {
        outputs.all {
            (this as com.android.build.gradle.internal.api.BaseVariantOutputImpl).outputFileName =
                "AndroidAiIssues.apk"
        }
    }

    defaultConfig {
        applicationId = "com.example.androidaiissues"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

// Zero dependencies — classic Views only, same shape as ScreenReaderXmlApp.
dependencies {}
