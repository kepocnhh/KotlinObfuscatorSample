import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories.mavenCentral()

plugins {
    id("application")
    id("org.jetbrains.kotlin.jvm")
}

version = "0.0.1"

application {
    mainClass.set("test.obfuscator.kotlin.AppKt")
}

tasks.getByName<JavaCompile>("compileJava") {
    targetCompatibility = Version.jvmTarget
}

tasks.getByName<KotlinCompile>("compileKotlin") {
    kotlinOptions.jvmTarget = Version.jvmTarget
}
