import io.gitlab.arturbosch.detekt.detekt

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
        classpath("com.jakewharton:butterknife-gradle-plugin:10.1.0")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.7.1.1")
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.17.0")
        classpath ("org.jacoco:org.jacoco.core:0.8.7")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
plugins {
    id("io.gitlab.arturbosch.detekt").version("1.17.1")
}
allprojects {
    repositories {
        google()
        jcenter()
    }

}

tasks.register<io.gitlab.arturbosch.detekt.Detekt>("myDetekt") {
    description = "Runs a custom detekt build."
    setSource(files("src/main/kotlin", "src/test/kotlin"))
    config.setFrom(files("$rootDir/config/detekt/config.yml"))
    debug = true
    reports {
        xml {
            destination = file("build/reports/mydetekt.xml")
        }
        html.destination = file("build/reports/mydetekt.html")
    }
}


tasks.withType<io.gitlab.arturbosch.detekt.Detekt>().configureEach {
    // Target version of the generated JVM bytecode. It is used for type resolution.
    jvmTarget = "1.8"
}



detekt {
    toolVersion = "1.17.1"
    buildUponDefaultConfig = true // preconfigure defaults
    allRules = false // activate all available (even unstable) rules.
    config = files("$projectDir/config/detekt/detekt.yml") // point to your custom config defining rules to run, overwriting default behavior
    baseline = file("$projectDir/config/detekt/baseline.xml") // a way of suppressing issues before introducing detekt

    reports {
        html {
            enabled = true
            destination = file("path/to/destination.html")
        }
        xml.enabled = true // checkstyle like format mainly for integrations like Jenkins
        txt.enabled = true // similar to the console output, contains issue signature to manually edit baseline files
        sarif.enabled = true // standardized SARIF format (https://sarifweb.azurewebsites.net/) to support integrations with Github Code Scanning
    }
}
tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
