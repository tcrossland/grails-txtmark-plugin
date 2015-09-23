grails.project.work.dir = 'target'

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile 'com.github.rjeschke:txtmark:0.13'
    }

    plugins {
        build(":release:3.1.1",
              ":rest-client-builder:2.1.1") {
            export = false
        }
    }
}
