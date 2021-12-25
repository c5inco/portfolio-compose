package com.c5inco.portfolio.components

import org.jetbrains.compose.web.attributes.AttrsBuilder
import org.w3c.dom.HTMLIFrameElement

fun AttrsBuilder<HTMLIFrameElement>.src(value: String): AttrsBuilder<HTMLIFrameElement> =
    attr("src", value)

fun AttrsBuilder<HTMLIFrameElement>.frameBorder(value: Number): AttrsBuilder<HTMLIFrameElement> =
    attr("frameBorder", value.toString())

fun AttrsBuilder<HTMLIFrameElement>.allowFullscreen(value: Boolean): AttrsBuilder<HTMLIFrameElement> =
    attr("allowFullscreen", value.toString())