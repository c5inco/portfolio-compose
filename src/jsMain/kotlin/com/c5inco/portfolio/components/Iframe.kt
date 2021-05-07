package com.c5inco.portfolio.components

import androidx.compose.runtime.Composable
import androidx.compose.web.attributes.AttrsBuilder
import androidx.compose.web.attributes.Tag
import androidx.compose.web.css.StyleBuilder
import androidx.compose.web.elements.ElementScope
import androidx.compose.web.elements.TagElement
import org.w3c.dom.HTMLIFrameElement

open class NewTag {
    object Iframe: Tag()
}

fun AttrsBuilder<NewTag.Iframe>.src(value: String) =
    attr("src", value)

fun AttrsBuilder<NewTag.Iframe>.name(value: String) =
    attr("name", value)

fun AttrsBuilder<NewTag.Iframe>.allowFullscreen(value: Boolean) =
    attr("allowFullscreen", value.toString())

fun AttrsBuilder<NewTag.Iframe>.width(value: Int) =
    attr("width", value.toString())

fun AttrsBuilder<NewTag.Iframe>.height(value: Int) =
    attr("height", value.toString())

fun AttrsBuilder<NewTag.Iframe>.frameBorder(value: Int) =
    attr("frameBorder", value.toString())

@Composable
inline fun Iframe(
    src: String,
    crossinline attrs: (AttrsBuilder<NewTag.Iframe>.() -> Unit) = {},
    crossinline style: (StyleBuilder.() -> Unit) = {},
    content: @Composable ElementScope<HTMLIFrameElement>.() -> Unit = {}
) = TagElement<NewTag.Iframe, HTMLIFrameElement>(
    tagName = "iframe",
    applyAttrs = {
        src(src)
        attrs()
    },
    applyStyle = style,
    content = content
)