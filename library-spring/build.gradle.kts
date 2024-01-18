plugins {
	java
	id("org.springframework.boot") version "3.2.1"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.launchlibrary"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation ("jakarta.validation:jakarta.validation-api:3.0.0")
	implementation ("org.hibernate.validator:hibernate-validator:7.0.2.Final")
	implementation("jakarta.persistence:jakarta.persistence-api:3.0.0")
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation ("mysql:mysql-connector-java")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
