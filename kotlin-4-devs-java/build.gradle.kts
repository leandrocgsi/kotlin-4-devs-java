import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20-M1"
}

group = "br.com.erudio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.6.10")

    testImplementation(kotlin("test"))
    testImplementation ("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation ("org.amshove.kluent:kluent:1.68")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}