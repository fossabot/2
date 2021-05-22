buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
        classpath("com.jakewharton:butterknife-gradle-plugin:10.1.0")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.3.2.0")
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.17.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
apply(plugin = "io.gitlab.arturbosch.detekt")
allprojects {
    repositories {
        google()
        jcenter()
    }
}
tasks.register<io.gitlab.arturbosch.detekt.Detekt>("myDetekt") {
    description = "Runs a custom detekt build."
    setSource(files("src/main/kotlin", "src/test/kotlin"))
    config.setFrom(files("$rootDir/config.yml"))
    debug = true
    reports {
        xml {
            destination = file("build/reports/mydetekt.xml")
        }
        html.destination = file("build/reports/mydetekt.html")
    }
    include("**/*.kt")
    include("**/*.kts")
    exclude("resources/")
    exclude("build/")
}
tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
