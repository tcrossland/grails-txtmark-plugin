# Grails Txtmark Plugin
Copyright (C) 2015 Tom Crossland  
See LICENSE for licensing information.
***

Another Grails plugin to provide support for rendering markdown, using the [Txtmark][] markdown processor. 

See [Daring Fireball][] for markdown syntax.

### Why another Markdown plugin

There are a couple of Grails plugins that already allow markdown to be rendered as HTML. My reasons for creating
yet another one are as follows: 
 
 * The [Grails Markdown Plugin][] uses [pegdown][] and a [parboiled][] parser. Later versions of parboiled
  use a version of [ASM] which is not compatible with Grails 2.x.
 * The [Grails Markdown Decorator Plugin][] uses [markdownj]. However, the decorator plugin trims strings before
  processing which may cause rendering side-effects (for example, strings that start with a bullet list `" * bullet"`
   will be outdented).
 

### Acknowledgements

 * [Markdown] is Copyright (C) 2004 by John Gruber
 * [Txtmark] is Copyright (C) 2011-2015 René Jeschke
 * [Grails Markdown Plugin] is Copyright (C) 2009-2015 Ted Naleid
 * [Grails Markdown Decorator Plugin] is Copyright (C) 2013-2014 Goran Ehrsson

***

[Txtmark]: https://github.com/rjeschke/txtmark
[Daring Fireball]: http://daringfireball.net/projects/markdown/basics
[Markdown]: http://daringfireball.net/projects/markdown/
[parboiled]: https://github.com/sirthias/parboiled/wiki
[pegdown]: http://pegdown.org
[Markdownj]: https://github.com/myabc/markdownj
[Grails Markdown Plugin]: https://grails.org/plugin/markdown
[Grails Markdown Decorator Plugin]: https://grails.org/plugin/decorator-markdown
[ASM]: http://asm.ow2.org/
