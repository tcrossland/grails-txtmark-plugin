package grails.plugins.txtmark

import com.github.rjeschke.txtmark.Configuration
import com.github.rjeschke.txtmark.Processor

class TxtmarkTagLib {
    CompactDecorator decorator = new CompactDecorator()
    Configuration configuration = Configuration.builder().setDecorator(decorator).build()

    def markdown = { attrs, body ->
        String text = attrs.text ?: body() ?: ""
        out << Processor.process(text, configuration)
    }
}
