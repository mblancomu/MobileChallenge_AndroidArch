plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.library.compose")
    id("mobilechallenge.android.hilt")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.core.testing"
}

dependencies {

    api(libs.androidx.compose.ui.test)
    api(libs.androidx.test.core)
    api(libs.androidx.test.espresso.core)
    api(libs.androidx.test.rules)
    api(libs.androidx.test.runner)
    api(libs.hilt.android.testing)
    api(libs.junit4)
    api(libs.kotlinx.coroutines.test)
    api(libs.turbine)

    debugApi(libs.androidx.compose.ui.testManifest)

//    implementation(project(":core:common"))
//    implementation(project(":core:data"))
//    implementation(project(":core:domain"))
//    implementation(project(":core:model"))
//    implementation(project(":core:notifications"))
    implementation(libs.kotlinx.datetime)
}