object LibVersions {
    const val spring_boot = "3.0.6"
}

object Libs{
    
}

object BOMs {
    const val spring_boot_bom = "org.springframework.boot:spring-boot-dependencies:${LibVersions.spring_boot}"
}

object PluginVersions {
    const val kotlin = Global.kotlin_version
    const val detekt = "1.22.0"
    
    const val detekt_formatting = detekt
    const val spring_boot = LibVersions.spring_boot
    const val spring_dependency_management = "1.1.0"
    const val spring_kotlin = Global.kotlin_version
}

object Plugins{
    const val kotlin = "org.jetbrains.kotlin.jvm"
    const val spring_boot = "org.springframework.boot"
    const val spring_dependency_management = "io.spring.dependency-management"
    const val spring_kotlin = "org.jetbrains.kotlin.plugin.spring"
    
    const val detekt = "io.gitlab.arturbosch.detekt"
    const val detekt_formatting = "io.gitlab.arturbosch.detekt:detekt-formatting"
}