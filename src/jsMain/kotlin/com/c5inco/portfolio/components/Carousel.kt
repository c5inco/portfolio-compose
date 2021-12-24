package com.c5inco.portfolio.components

import androidx.compose.runtime.*
import com.c5inco.portfolio.data.ArticleImage
import com.c5inco.portfolio.styles.AppStylesheet
import com.c5inco.portfolio.styles.ProjectsStylesheet.imageStyle
import org.jetbrains.compose.web.attributes.disabled
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Composable
fun Carousel(
    containerWidth: Int,
    images: List<ArticleImage>
) {
    var columnWidth by remember { mutableStateOf(0) }
    var activeSlide by remember { mutableStateOf(0) }
    var transitioning by remember { mutableStateOf(false) }

    val breakpoint = 768

    Div(attrs = { classes(CarouselStyles.carousel) }) {
        DomSideEffect(containerWidth) {
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
                    style {
                        left((-32).px)
                    }
                },
            ) {}
        }
        Div({
            style {
                property("transform", "translateZ(0)")
                overflow("hidden")
            }
        }) {
            Div(
                attrs = {
                    addEventListener("transitionend") {
                        transitioning = false
                    }
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Row)
                        width((images.size * columnWidth).px)
                        property("transform", "translate3d(-${activeSlide * columnWidth}px, 0, 0)")
                        property("transition", if (transitioning) "transform 500ms ease 0s" else "initial")
                    }
                },
            ) {
                images.forEach {
                    Div(
                        attrs = {
                            classes(CarouselStyles.slide)
                            style {
                                if (columnWidth > 0) width(columnWidth.px) else width(auto)
                            }
                        }
                    ) {
                        Img(
                            src = it.src,
                            alt = it.caption,
                            attrs = {
                                classes(CarouselStyles.fullImage)
                            }
                        )
                        AppCaption(it.caption)
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
                    style {
                        right((-32).px)
                    }
                }
            ) {}
        }
    }
}

object CarouselStyles : StyleSheet(AppStylesheet) {
    val carousel by style {
        property("margin", "0.5rem 0")
        position(Position.Relative)

        media(mediaMinWidth(40.em)) {
            self style {
                marginBottom(1.cssRem)
            }
        }
    }

    val carouselButton by style {
        position(Position.Absolute)
        top(50.percent)
        width(28.px)
        height(28.px)
        borderRadius(8.px)
        property("transform", "translateY(-50%)")
        backgroundPosition("center")
        backgroundSize("24px")
        property("transition", "background-color 150ms ease 0s")

        self + disabled style {
            opacity(0.3f)
        }

        self + not(disabled) style {
            self + hover style {
                backgroundColor(rgba(0, 0, 0, 0.1))
            }
        }
    }

    val previousButton by style {
        backgroundImage("url('/img/arrow_back.svg')")
    }

    val nextButton by style {
        backgroundImage("url('/img/arrow_forward.svg')")
    }

    val slickDots by style {
        bottom(50.px)
    }

    val slide by style {
        position(Position.Relative)
        textAlign("center")
    }

    val fullImage by style {
        imageStyle()
        property("box-shadow", "0 1px 2px rgba(0,0,0,0.2)")
    }
}