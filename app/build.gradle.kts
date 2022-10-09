/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("skeleton.spring.app.kotlin-spring-common")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}