plugins {
    id(Plugins.spring_dependency_management) version PluginVersions.spring_dependency_management
    id(Plugins.spring_kotlin) version PluginVersions.spring_kotlin
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    runtimeOnly("org.postgresql:postgresql")
}