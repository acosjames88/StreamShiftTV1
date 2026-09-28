plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android {
    namespace = "com.streamshift.tv"
    compileSdk = 35
    defaultConfig { applicationId = "com.streamshift.tv"; minSdk = 23; targetSdk = 35; versionCode = 2; versionName = "2.0" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.media3:media3-exoplayer:1.5.1")
    implementation("androidx.media3:media3-ui:1.5.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
}
