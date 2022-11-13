plugins {
    id("skeleton.spring.app.kotlin-spring-common")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    runtimeOnly("org.postgresql:postgresql")
}