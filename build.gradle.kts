plugins {
    id(Plugins.kotlin) version PluginVersions.kotlin apply false
    id(Plugins.detekt) version PluginVersions.detekt
}

subprojects{
    apply {
        plugin("java")
        plugin(Plugins.kotlin)
        plugin(Plugins.detekt)
    }
    repositories {
        mavenCentral()
    }

    val implementation by configurations

    detekt {

    }

    dependencies {
        implementation(platform(BOMs.spring_boot_bom))
    }
    val failOnWarning = project.properties["allWarningsAsErrors"] != null && project
        .properties["allWarningsAsErrors"] == "true"

    tasks {
        withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_17.toString()
                allWarningsAsErrors = failOnWarning
                freeCompilerArgs = listOf("-Xjvm-default=all")
            }
        }
        withType<JavaCompile> {
            options.compilerArgs.add("-Xlint:all")
        }
    }
}