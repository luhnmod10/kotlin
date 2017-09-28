plugins {
    kotlin("jvm", "1.1.4-3") 
}

repositories {
    jcenter() 
}

dependencies {
    implementation(kotlin("stdlib", "1.1.4-3")) 
    testImplementation("junit:junit:4.12")
}

(tasks.getByName("test") as Test).testLogging?.showStandardStreams = true
(tasks.getByName("test") as Test).outputs.upToDateWhen { false }
