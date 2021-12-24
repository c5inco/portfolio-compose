package com.c5inco.portfolio.styles

import org.jetbrains.compose.web.css.*

object AppStylesheet : StyleSheet() {
    init {
        "body" style {
            backgroundColor(Color("#f1f1ee"))
            color(Color("#444"))
            fontFamily("Roboto Slab", "serif")
        }

        "h1, h2, h3, h4, h5" style {
            fontFamily("Josefin Sans", "sans-serif")
        }

        "h2" style {
            color(Color("#2682A1"))
            fontSize(2.cssRem)
        }

        media(mediaMinWidth(40.em)) {
            "h2" style {
                fontSize(2.5.cssRem)
            }
        }
    }
}