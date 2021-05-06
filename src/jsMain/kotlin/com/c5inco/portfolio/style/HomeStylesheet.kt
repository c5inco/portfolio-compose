package com.c5inco.portfolio.style

import androidx.compose.web.css.*
import androidx.compose.web.css.selectors.hover
import androidx.compose.web.css.selectors.plus

object HomeStylesheet : StyleSheet() {
    val main by style {
        backgroundColor(Color("#c6dfe7"))
        position(Position.Relative)
        property("overflow", value("hidden"))
        height(225.px)

        "img" style {
            display(DisplayStyle.Block)
            property("margin", value("auto"))
        }

        media(minWidth(40.em)) {
            self style {
                height(360.px)
            }
        }
    }

    val bannerText by style {
        top(20.percent)
        property("margin", value("0 auto"))
        width(45.percent)
        property("min-width", value(12.rem))
        position(Position.Relative)
        property("z-index", value(1))
        property("text-align", value("center"))

        property("animation-duration", value("1.2s"))
    }

    val name by style {
        fontSize(2.5.rem)
        property("line-height", value("normal"))
        color(Color("#2682a1"))
        property("margin-bottom", value(0))

        media(minWidth(40.em)) {
            self style {
                fontSize(3.5.rem)
            }
        }
    }

    val title by style {
        fontSize(1.rem)
        color(Color("#6a95a0"))

        media(minWidth(40.em)) {
            self style {
                fontSize(1.2.rem)
            }
        }
    }

    val mtns by style {
        width(70.percent)
        property("min-width", value(20.rem))
        property("max-width", value(42.rem))
    }

    val mtnsContainer by style {
        width(100.percent)
        position(Position.Absolute)
        bottom(0.px)
    }

    val info by style {
        position(Position.Relative)
        property("text-align", value("center"))
        property("padding-top", value(2.rem))
        property("margin-bottom", value(2.rem))

        property("animation-duration", value(".5s"))

        "p" style {
            fontSize(1.rem)
        }
    }

    val avatar by style {
        property("background", value("url('img/avatar-filter.png') -25px -5px no-repeat"))
        property("background-size", value(150.percent))
        height(150.px)
        width(150.px)
        borderRadius(100.percent)
        property("margin", value("0 auto 1rem"))
        property("box-shadow", value("0 1px 2px rgba(0,0,0,0.2)"))

        media(minWidth(40.em)) {
            self style {
                height(175.px)
                width(175.px)
            }
        }
    }

    val work by style {
        property("padding-bottom", value(5.rem))
    }

    val col by style {
        padding(0.5.rem)
    }

    val card by style {
        property("box-shadow", value("0 1px 2px rgba(0,0,0,0.2)"))
        backgroundColor(Color("#fff"))
        color(Color("#444"))
        display(DisplayStyle.Block)
    }

    val hololens by style {
        property("background-image", value("url('img/holotour.jpg')"))
        property("background-position", value("center"))
    }

    val cortana by style {
        property("background-image", value("url('img/cortana.png')"))
        property("background-position", value("center top"))
    }

    val islandwood by style {
        property("background-image", value("url('img/islandwood.jpg')"))
        property("background-position", value("center"))
    }

    val vscode by style {
        property("background-image", value("url('img/MacWinLinux2.png')"))
        property("background-position", value("center"))
    }

    val vsmonaco by style {
        property("background-image", value("url('img/vsmonaco.jpg')"))
        property("background-position", value("left top"))
    }

    val monaco by style {
        property("background-image", value("url('img/OneDriveWebEditing.png')"))
        property("background-position", value("left top"))
        property("background-size", value(250.percent))
    }

    val devcanvas by style {
        property("background-image", value("url('img/devcanvas.png')"))
        property("background-position", value("left top"))
        property("background-size", value("initial"))
    }

    val touchdev by style {
        property("background-image", value("url('img/touchdev.png')"))
        property("background-position", value("center"))
        property("background-size", value("initial"))
    }

    val slackbots by style {
        property("background-image", value("url('img/slackbots.png')"))
        property("background-position", value("top center"))
    }

    val magicalMusic by style {
        property("background-image", value("url('img/magicalmusic.png')"))
        property("background-position", value("center"))
    }

    val funsies by style {
        property("background", value("#0093b0 no-repeat center top"))
        property("background-image", value("url('img/funsies.png')"))
        property("background-size", value(80.percent))
    }

    val preview by style {
        property("background-size", value("cover"))
        property("overflow", value("hidden"))
        height(300.px)
        width(100.percent)

        media(minWidth(40.em)) {
            self style {
                height(250.px)
            }
        }
    }

    val caption by style {
        fontSize(1.1.rem)
        property("font-weight", value(600))
        property("text-align", value("center"))
        property("border-top", value("1px solid rgba(0,0,0,.1)"))
        padding(0.6.rem)
        property("margin-bottom", value(0))
    }

    val contact by style {
        backgroundColor(Color("#444"))
        color(Color("#fff"))
        fontSize(1.5.rem)
        property("padding", value("3rem 0"))
        property("text-align", value("center"))

        "a" style {
            color(Color("#fff"))

            self + hover() style {
                color(Color("#ccc"))
            }
        }
    }

    val email by style { property("background", value("url('img/email.svg') left center no-repeat")) }
    val resume by style { property("background", value("url('img/file-logo.svg') left center no-repeat")) }
    val linkedin by style { property("background", value("url('img/linkedin-logo.svg') left center no-repeat")) }
    val github by style { property("background", value("url('img/github-logo.svg') left center no-repeat")) }

    val block by style {
        display(DisplayStyle.InlineBlock)
        property("margin-right", value(1.rem))
        property("margin-bottom", value(2.rem))
        property("background-size", value("4rem"))
        property("padding-left", value(3.5.rem))
    }

    val trademark by style {
        opacity(0.6f)
        fontFamilyUtil("'Roboto Slab', serif")
        fontSize(1.rem)
    }
}