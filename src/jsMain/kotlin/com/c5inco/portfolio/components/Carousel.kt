package com.c5inco.portfolio.components

import androidx.compose.runtime.*
import androidx.compose.web.attributes.alt
import androidx.compose.web.attributes.disabled
import androidx.compose.web.css.*
import androidx.compose.web.css.selectors.CSSSelector
import androidx.compose.web.css.selectors.hover
import androidx.compose.web.css.selectors.plus
import androidx.compose.web.elements.Button
import androidx.compose.web.elements.Div
import androidx.compose.web.elements.Img
import com.c5inco.portfolio.data.ArticleImage
import com.c5inco.portfolio.styles.AppStylesheet
import com.c5inco.portfolio.styles.ProjectsStylesheet.imageStyle
import kotlinx.browser.window

@Composable
fun Carousel(
    images: List<ArticleImage>
) {
    var width by remember { mutableStateOf(0) }
    var columnWidth by remember { mutableStateOf(0) }
    var activeSlide by remember { mutableStateOf(0) }
    var transitioning by remember { mutableStateOf(false) }

    var breakpoint = 768

    window.onresize = {
        width = window.innerWidth
        Unit
    }

    Div(attrs = { classes(CarouselStyles.carousel) }) {
        DomSideEffect(width) {
            columnWidth = it.getClientRects()[0].width.toInt()
        }

        if (columnWidth >= breakpoint) {
            Button(
                attrs = {
                    if (activeSlide <= 0) disabled()
                    onClick {
                        activeSlide -= 1
                        transitioning = true
                    }
                    classes(CarouselStyles.carouselButton, CarouselStyles.previousButton)
                },
                style = {
                    left((-32).px)
                }
            ) {}
        }
        Div(style = {
            property("transform", value("translateZ(0)"))
            property("overflow", value("hidden"))
        }) {
            Div(
                attrs = {
                    addEventListener("transitionend") {
                        transitioning = false
                    }
                },
                style = {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Row)
                    width((images.size * columnWidth).px)
                    property("transform", value("translate3d(-${activeSlide * columnWidth}px, 0, 0)"))
                    property("transition", value(if (transitioning) "transform 500ms ease 0s" else "initial"))
                }
            ) {
                images.forEach {
                    Div(
                        style = {
                            if (columnWidth > 0) width(columnWidth.px) else width(auto)
                        },
                        attrs = { classes(
                            CarouselStyles.slide
                        )}
                    ) {
                        Img(
                            src = it.src,
                            attrs = {
                                classes(CarouselStyles.fullImage)
                                alt(it.caption)
                            }
                        )
                        Caption(it.caption)
                    }
                }
            }
        }

        if (columnWidth >= breakpoint) {
            Button(
                attrs = {
                    if (activeSlide >= images.size - 1) disabled()
                    onClick {
                        activeSlide += 1
                        transitioning = true
                    }
                    classes(CarouselStyles.carouselButton, CarouselStyles.nextButton)
                },
                style = {
                    right((-32).px)
                }
            ) {}
        }
    }
}

object CarouselStyles : StyleSheet(AppStylesheet) {
    val carousel by style {
        property("margin", value("0.5rem 0"))
        position(Position.Relative)

        media(minWidth(40.em)) {
            self style {
                property("margin-bottom", value(1.rem))
            }
        }
    }

    val carouselButton by style {
        position(Position.Absolute)
        top(50.percent)
        width(28.px)
        height(28.px)
        borderRadius(8.px)
        property("transform", value("translateY(-50%)"))
        property("background-position", value("center"))
        property("background-size", value(24.px))
        property("transition", value("background-color 150ms ease 0s"))

        self + CSSSelector.PseudoClass.disabled style {
            opacity(0.3f)
        }

        self + androidx.compose.web.css.selectors.not(CSSSelector.PseudoClass.disabled) style {
            self + hover() style {
                backgroundColor(Color.RGBA(0, 0, 0, 0.1))
            }
        }
    }

    val previousButton by style {
        property("background-image", value("url('/img/arrow_back.svg')"))
    }

    val nextButton by style {
        property("background-image", value("url('/img/arrow_forward.svg')"))
    }

    val slickDots by style {
        bottom(50.px)
    }

    val slide by style {
        position(Position.Relative)
        property("text-align", value("center"))
    }

    val fullImage by style {
        imageStyle()
        property("box-shadow", value("0 1px 2px rgba(0,0,0,0.2)"))
    }
}