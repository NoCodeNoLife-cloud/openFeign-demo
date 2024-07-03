plugins {
    id("java")
}

group = "org.code"
version = "1.0-SNAPSHOT"


allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")

        // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter
        implementation("org.springframework.cloud:spring-cloud-starter:4.1.2")
        // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign
        implementation("org.springframework.cloud:spring-cloud-starter-openfeign:4.1.1")

        // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-hystrix
        implementation("org.springframework.cloud:spring-cloud-starter-netflix-hystrix:2.2.10.RELEASE")

        // https://mvnrepository.com/artifact/org.projectlombok/lombok
        compileOnly("org.projectlombok:lombok:1.18.32")
        annotationProcessor("org.projectlombok:lombok:1.18.32")
        // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
        implementation("org.slf4j:slf4j-api:2.0.13")
        // https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
        implementation("ch.qos.logback:logback-classic:1.5.6")
        // https://mvnrepository.com/artifact/ch.qos.logback/logback-core
        implementation("ch.qos.logback:logback-core:1.5.6")
    }

    tasks.test {
        useJUnitPlatform()
    }
}