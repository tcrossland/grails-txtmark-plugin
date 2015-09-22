class TxtmarkGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.3 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grails Txtmark Plugin"
    def author = "Tom Crossland"
    def authorEmail = "tom.crossland@bluetab.net"
    def description = '''\
Markdown rendering support using the Txtmark processor.
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/tcrossland/grails-txtmark-plugin"

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"
}
