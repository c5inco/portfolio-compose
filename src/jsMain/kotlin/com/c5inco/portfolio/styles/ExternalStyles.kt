package com.c5inco.portfolio.styles

import androidx.compose.web.css.StyleSheet

object FoundationStylesheet : StyleSheet(AppStylesheet) {
    val row = "row"
    val column = "column"

    val smallCentered = "small-centered"
    val small10 = "small-10"
    val small11 = "small-11"
    val small12 = "small-12"
    val smallUp1 = "small-up-1"

    val medium8 = "medium-8"
    val medium9 = "medium-9"
    val medium10 = "medium-10"
    val medium11 = "medium-11"
    val mediumUp2 = "medium-up-2"
    val mediumUp3 = "medium-up-3"

    val large7 = "large-7"
    val large8 = "large-8"
    val largeUp3 = "large-up-3"
}

object AnimateCssStyleSheet : StyleSheet(AppStylesheet) {
    val animated = "animated"
    val fadeInUp = "fadeInUp"
    val fadeInDown = "fadeInDown"
    val zoomIn = "zoomIn"
}