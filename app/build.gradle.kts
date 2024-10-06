plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {

    namespace = "com.example.calories"

    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.calories"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    implementation("androidx.compose.material3:material3:1.1.0")
    implementation("androidx.activity:activity-compose:1.5.1")
    implementation("androidx.compose.ui:ui:1.4.0")
    implementation("androidx.compose.material:material:1.4.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.compose.runtime:runtime-livedata:1.4.0")
    implementation("androidx.compose.material:material-icons-core:1.4.0")
    implementation("androidx.compose.material:material-icons-extended:1.4.0")

    // Preview tooling
    debugImplementation("androidx.compose.ui:ui-tooling:1.4.0")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.4.0")

    // Testing
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.4.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation("junit:junit:4.13.2")
}
