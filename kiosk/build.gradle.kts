description = "kiosk module"

dependencies {
    api(project(":payment"))
    implementation(project(mapOf("path" to ":payment")))
}
