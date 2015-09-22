package grails.plugins.txtmark

import com.github.rjeschke.txtmark.Configuration
import com.github.rjeschke.txtmark.Processor

class TxtmarkTagLib {
    CompactDecorator decorator = new CompactDecorator()
    Configuration configuration = Configuration.builder().setDecorator(decorator).build()

    Closure markdown = { attrs, body ->
        def text = attrs.text ?: body() ?: ""
        out << Processor.process(text.toString(), configuration)
    }
}
