pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "HelloWorld"
include(":app")
include(":mod2d03")
include(":mod02d04")
include(":mod3d01")
include(":mod3TP")
include(":mod4d01")
include(":mod4d02")
include(":mod4d03")
include(":mod4tp1")
include(":mod5d01")
