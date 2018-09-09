plugins {
  maven
  `java-library`
  kotlin("jvm") version "1.2.61"
}
tasks.withType<Wrapper> {
  gradleVersion = "4.10"
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<Test> {
  useJUnitPlatform()
}

repositories {
  jcenter()
}
dependencies {
  compileOnly("org.jetbrains:annotations:16.0.2")

  testImplementation(kotlin("stdlib"))
  testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.9")
}
