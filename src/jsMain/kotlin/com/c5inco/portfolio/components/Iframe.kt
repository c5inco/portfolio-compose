package com.c5inco.portfolio.components

import androidx.compose.runtime.Composable
import kotlinx.browser.document
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.ElementBuilder
import org.jetbrains.compose.web.dom.TagElement
import org.w3c.dom.Element
import org.w3c.dom.HTMLIFrameElement

private open class ElementBuilderImplementation<TElement : Element>(private val tagName: String) : ElementBuilder<TElement> {
    private val el: Element by lazy { document.createElement(tagName) }
    override fun create(): TElement = el.cloneNode() as TElement
}
private val Iframe: ElementBuilder<HTMLIFrameElement> = ElementBuilderImplementation("iframe")

@Composable
fun AppIframe(
    src: String,
    frameBorder: Number,
    allowFullscreen: Boolean = false,
    attrs: AttrBuilderContext<HTMLIFrameElement>? = null,
    content: ContentBuilder<HTMLIFrameElement>? = null
) {
    TagElement(
        elementBuilder = Iframe,
        applyAttrs = {
            attr(attr = "src", value = src)
            attr(attr = "frameBorder", value = frameBorder.toString())
            if (allowFullscreen) attr(attr = "allow", value = "fullscreen")
            if (attrs != null) {
                attrs()
            }
        },
        content = content
    )
}