package grails.plugins.txtmark

import com.github.rjeschke.txtmark.DefaultDecorator

/**
 * A decorator which doesn't output newlines.
 */
class CompactDecorator extends DefaultDecorator {

    @Override
    void closeParagraph(StringBuilder out) {
        out.append("</p>")
    }

    @Override
    public void closeBlockquote(final StringBuilder out) {
        out.append("</blockquote>")
    }

    @Override
    public void closeCodeBlock(final StringBuilder out) {
        out.append("</code></pre>")
    }

    @Override
    public void closeHeadline(final StringBuilder out, final int level) {
        out.append("</h")
        out.append(level)
        out.append(">")
    }

    @Override
    public void openOrderedList(final StringBuilder out) {
        out.append("<ol>")
    }

    @Override
    public void closeOrderedList(final StringBuilder out) {
        out.append("</ol>")
    }

    @Override
    public void openUnorderedList(final StringBuilder out) {
        out.append("<ul>")
    }

    @Override
    public void closeUnorderedList(final StringBuilder out) {
        out.append("</ul>")
    }

    @Override
    public void closeListItem(final StringBuilder out) {
        out.append("</li>")
    }

    @Override
    public void horizontalRuler(final StringBuilder out) {
        out.append("<hr/>")
    }

}
