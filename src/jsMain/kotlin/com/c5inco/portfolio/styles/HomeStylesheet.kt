package com.c5inco.portfolio.styles

import org.jetbrains.compose.web.css.*

object HomeStylesheet : StyleSheet() {
    val main by style {
        backgroundColor(Color("#c6dfe7"))
        position(Position.Relative)
        overflow("hidden")
        height(225.px)

        desc(self, selector("img")) style {
            display(DisplayStyle.Block)
            property("margin", "auto")
        }

        media(mediaMinWidth(40.em)) {
            self style {
                height(360.px)
            }
        }
    }

    val bannerText by style {
        top(20.percent)
        property("margin", "0 auto")
        width(45.percent)
        minWidth(12.cssRem)
        position(Position.Relative)
        property("z-index", 1)
        textAlign("center")

        property("animation-duration", "1.2s")
    }

    val name by style {
        fontSize(2.5.cssRem)
        property("line-height", "normal")
        color(Color("#2682a1"))
        marginBottom(0.px)

        media(mediaMinWidth(40.em)) {
            self style {
                fontSize(3.5.cssRem)
            }
        }
    }

    val title by style {
        fontSize(1.cssRem)
        color(Color("#6a95a0"))

        media(mediaMinWidth(40.em)) {
            self style {
                fontSize(1.2.cssRem)
            }
        }
    }

    val mtns by style {
        width(70.percent)
        minWidth(20.cssRem)
        maxWidth(42.cssRem)
    }

    val mtnsContainer by style {
        width(100.percent)
        position(Position.Absolute)
        bottom(0.px)
    }

    val info by style {
        position(Position.Relative)
        textAlign("center")
        paddingTop(2.cssRem)
        marginBottom(2.cssRem)

        property("animation-duration", "0.5s")

        desc(self, selector("p")) style {
            fontSize(1.cssRem)
        }
    }

    val avatar by style {
        background("url('img/avatar-filter.png') -25px -5px no-repeat")
        backgroundSize("150%")
        height(150.px)
        width(150.px)
        borderRadius(100.percent)
        property("margin", "0 auto 1rem")
        property("box-shadow", "0 1px 2px rgba(0,0,0,0.2)")

        media(mediaMinWidth(40.em)) {
            self style {
                height(175.px)
                width(175.px)
            }
        }
    }

    val work by style {
        paddingBottom(5.cssRem)
    }

    val col by style {
        padding(0.5.cssRem)
    }

    val card by style {
        property("box-shadow", "0 1px 2px rgba(0,0,0,0.2)")
        backgroundColor(Color("#fff"))
        color(Color("#444"))
        display(DisplayStyle.Block)
    }

    val hololens by style {
        backgroundImage("url('img/holotour.jpg')")
        backgroundPosition("center")
    }

    val cortana by style {
        backgroundImage("url('img/cortana.png')")
        backgroundPosition("center top")
    }

    val islandwood by style {
        backgroundImage("url('img/islandwood.jpg')")
        backgroundPosition("center")
    }

    val vscode by style {
        backgroundImage("url('img/MacWinLinux2.png')")
        backgroundPosition("center")
    }

    val vsmonaco by style {
        backgroundImage("url('img/vsmonaco.jpg')")
        backgroundPosition("left top")
    }

    val monaco by style {
        backgroundImage("url('img/OneDriveWebEditing.png')")
        backgroundPosition("left top")
        backgroundSize("250%")
    }

    val devcanvas by style {
        backgroundImage("url('img/devcanvas.png')")
        backgroundPosition("left top")
        backgroundSize("initial")
    }

    val touchdev by style {
        backgroundImage("url('img/touchdev.png')")
        backgroundPosition("center")
        backgroundSize("initial")
    }

    val slackbots by style {
        backgroundImage("url('img/slackbots.png')")
        backgroundPosition("top center")
    }

    val magicalMusic by style {
        backgroundImage("url('img/magicalmusic.png')")
        backgroundPosition("center")
    }

    val funsies by style {
        background("#0093b0 no-repeat center top")
        backgroundImage("url('img/funsies.png')")
        backgroundSize("80%")
    }

    val preview by style {
        backgroundSize("cover")
        overflow("hidden")
        height(300.px)
        width(100.percent)

        media(mediaMinWidth(40.em)) {
            self style {
                height(250.px)
            }
        }
    }

    val caption by style {
        fontSize(1.1.cssRem)
        fontWeight(600)
        textAlign("center")
        property("border-top", "1px solid rgba(0,0,0,.1)")
        padding(0.6.cssRem)
        marginBottom(0.px)
    }

    val contact by style {
        backgroundColor(Color("#444"))
        color(Color("#fff"))
        fontSize(1.5.cssRem)
        property("padding", "3rem 0")
        textAlign("center")

        desc(self, selector("a")) style {
            color(Color("#fff"))

            self + hover style {
                color(Color("#ccc"))
            }
        }
    }

    val email by style { background("url('img/email.svg') left center no-repeat") }
    val resume by style { background("url('img/file-logo.svg') left center no-repeat") }
    val linkedin by style { background("url('img/linkedin-logo.svg') left center no-repeat") }
    val github by style { background("url('img/github-logo.svg') left center no-repeat") }

    val block by style {
        display(DisplayStyle.InlineBlock)
        marginRight(1.cssRem)
        marginBottom(2.cssRem)
        backgroundSize("4rem")
        paddingLeft(3.5.cssRem)
    }

    val trademark by style {
        opacity(0.6f)
        fontFamily("Roboto Slab", "serif")
        fontSize(1.cssRem)
    }
}