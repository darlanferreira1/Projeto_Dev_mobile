plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    //maps
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
    //firebase
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.projeto_mobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.projeto_mobile"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures{
        viewBinding = true
    }

}



dependencies {
    val nav_version = "2.5.3"

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("androidx.navigation:navigation-fragment-ktx:2.7.4")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.4")


    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    // material design (navbar)
    implementation ("com.google.android.material:material:<version>")

    // condinator layout
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    // mapas
    implementation("com.google.android.gms:play-services-maps:18.2.0")

    // firebase BOM
    implementation(platform("com.google.firebase:firebase-bom:32.6.0"))

    //sensor de digitais
    implementation("androidx.biometric:biometric:1.1.0")

    // minha localização
    implementation("com.google.android.gms:play-services-location:21.0.1")


}