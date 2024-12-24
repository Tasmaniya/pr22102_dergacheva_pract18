plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.pr22102_dergacheva_pract18"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pr22102_dergacheva_pract18"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Volley
    implementation("com.android.volley:volley:1.2.1")

    // Accompanist Pager
    implementation("com.google.accompanist:accompanist-pager:0.19.0")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.19.0")

    // Core and Compose libraries
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.compose.ui:ui:1.0.5")
    implementation("androidx.compose.material:material:1.0.5")
    implementation("androidx.compose.ui:ui-tooling-preview:1.0.5")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")

    // Coil for image loading
    implementation("io.coil-kt:coil-compose:2.0.0-rc01")

    // Material 3 (if required)
    implementation("androidx.compose.material3:material3:1.0.0-alpha12")

    // Testing libraries
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.0.5")

    // Debugging
    debugImplementation("androidx.compose.ui:ui-tooling:1.0.5")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.0.5")
}
