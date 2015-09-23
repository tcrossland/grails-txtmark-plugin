package grails.plugins.txtmark

import com.github.rjeschke.txtmark.DefaultDecorator

/**
 * A decorator which doesn't output newlines.
 */
class CompactDecorator extends DefaultDecorator {

    @Override
    void closeParagraph(StringBuilder out) {
        out << "</p>"
    }

    @Override
    void closeBlockquote(final StringBuilder out) {
        out << "</blockquote>"
    }

    @Override
    void closeCodeBlock(final StringBuilder out) {
        out << "</code></pre>"
    }

    @Override
    void closeHeadline(final StringBuilder out, final int level) {
        out << "</h" << level << ">"
    }

    @Override
    void openOrderedList(final StringBuilder out) {
        out << "<ol>"
    }

    @Override
    void closeOrderedList(final StringBuilder out) {
        out << "</ol>"
    }

    @Override
    void openUnorderedList(final StringBuilder out) {
        out << "<ul>"
    }

    @Override
    void closeUnorderedList(final StringBuilder out) {
        out << "</ul>"
    }

    @Override
    void closeListItem(final StringBuilder out) {
        out << "</li>"
    }

    @Override
    void horizontalRuler(final StringBuilder out) {
        out << "<hr/>"
    }
}
