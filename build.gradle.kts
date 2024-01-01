plugins {
    // id("java")
    id("biz.aQute.bnd.builder") version "7.0.0"
    id("application")
    // java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.osgi:org.osgi.framework:1.10.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}

application {
    mainClass.set("org.example.Main")
}

tasks.register<JavaExec>("runMe") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass = "org.example.Main"
}

task<JavaExec>("runMe2") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass = "org.example.Main"
}

//tasks.jar {
//    manifest {
//        attributes(mapOf("-exportcontents": "com.acme.api.*",
//        "-sources": "true",
//        "-include": "other.bnd"))
//    }
//}

//tasks.wrapper {
//    gradleVersion = "8.2"
//    distributionType = Wrapper.DistributionType.ALL
//}