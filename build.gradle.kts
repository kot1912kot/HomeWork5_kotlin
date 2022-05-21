import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    jacoco
    kotlin("jvm") version "1.6.21"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
    testImplementation ("junit:junit:4.13.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}