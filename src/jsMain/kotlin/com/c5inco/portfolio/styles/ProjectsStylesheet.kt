package com.c5inco.portfolio.styles

import org.jetbrains.compose.web.css.*

object ProjectsStylesheet : StyleSheet() {
    fun CSSBuilder.imageStyle() {
        display(DisplayStyle.Block)
        property("margin", "0 auto")
    }

    val project by style {
        fontSize(1.cssRem)

        "h3" style {
            fontSize(1.5.cssRem)
        }

        media(mediaMinWidth(40.em)) {
            self style {
                fontSize(1.1.em)
            }
        }
    }

    val maskImage by style {
        imageStyle()
        width(100.percent)
    }

    val fullImage by style {
        imageStyle()
        property("box-shadow", "0 1px 2px rgba(0,0,0,0.2)")
    }

    val video by style {
        property("margin", "0 auto")
        display(DisplayStyle.Block)
        width(100.percent)
        maxWidth(360.px)
    }

    val projectName by style {
        property("padding", "1.1rem 0 0")

        media(mediaMinWidth(40.em)) {
            self style {
                property("padding", "2rem 0 .5rem")
                textAlign("center")
            }
        }
    }

    val gallery by style {
        marginTop(0.5.cssRem)
    }

    val projectNav by style {
        property("padding", "3rem 0")
    }

    val navLink by style {
        textAlign("center")
        fontSize(2.cssRem)
    }

    val videoWrapper by style {
        position(Position.Relative)
        paddingBottom(56.25.percent)
        height(0.px)

        desc(self, selector("iframe")) style {
            position(Position.Absolute)
            top(0.px)
            left(0.px)
            width(100.percent)
            height(100.percent)
        }
    }
}