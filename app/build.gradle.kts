plugins {
    id(Plugins.spring_boot) version PluginVersions.spring_boot
    id(Plugins.spring_dependency_management) version PluginVersions.spring_dependency_management
    id(Plugins.spring_kotlin) version PluginVersions.spring_kotlin
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(project(":db"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.liquibase:liquibase-core")
    testRuntimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

}

tasks.withType<Test> {
    useJUnitPlatform()
}