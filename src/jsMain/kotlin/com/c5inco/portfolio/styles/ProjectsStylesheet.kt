package com.c5inco.portfolio.styles

import androidx.compose.web.css.*
import androidx.compose.web.css.selectors.descendant
import androidx.compose.web.css.selectors.selector

object ProjectsStylesheet : StyleSheet() {
    fun CSSBuilder.imageStyle() {
        display(DisplayStyle.Block)
        property("margin", value("0 auto"))
    }

    val project by style {
        fontSize(1.rem)

        "h3" style {
            fontSize(1.5.rem)
        }

        media(minWidth(40.em)) {
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
        property("box-shadow", value("0 1px 2px rgba(0,0,0,0.2)"))
    }

    val video by style {
        property("margin", value("0 auto"))
        display(DisplayStyle.Block)
        width(100.percent)
        property("max-width", value(360.px))
    }

    val projectName by style {
        property("padding", value("1.1rem 0 0"))

        media(minWidth(40.em)) {
            self style {
                property("padding", value("2rem 0 .5rem"))
                property("text-align", value("center"))
            }
        }
    }

    val gallery by style {
        marginTop(0.5.rem)
    }

    val projectNav by style {
        property("padding", value("3rem 0"))
    }

    val navLink by style {
        property("text-align", value("center"))
        fontSize(2.rem)
    }

    val videoWrapper by style {
        position(Position.Relative)
        property("padding-bottom", value(56.25.percent))
        height(0.px)

        descendant(self, selector("iframe")) style {
            position(Position.Absolute)
            top(0.px)
            left(0.px)
            width(100.percent)
            height(100.percent)
        }
    }
}