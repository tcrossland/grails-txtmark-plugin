package grails.plugins.txtmark

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * Test for {@link TxtmarkTagLib}
 */
@TestFor(TxtmarkTagLib)
class TxtmarkTagLibSpec extends Specification {

    void "Basic markdown is rendered correctly"() {
        expect:
        tagLib.markdown(text: input).toString() == expected

        where:
        input                                                      | expected
        "This is ***TXTMARK***"                                    | '<p>This is <strong><em>TXTMARK</em></strong></p>'
        '[This link](http://example.net/) has no title attribute.' | '<p><a href="http://example.net/">This link</a> has no title attribute.</p>'
    }
}
