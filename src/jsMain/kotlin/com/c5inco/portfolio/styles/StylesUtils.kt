package com.c5inco.portfolio.styles

import androidx.compose.web.css.*

fun CSSBuilder.fontFamilyUtil(value: String) {
    property("font-family", value(value))
}

fun CSSStyleRuleBuilder.fontFamilyUtil(value: String) {
    property("font-family", value(value))
}

enum class TextAlign(val value: String) {
    Left("left"),
    Right("right"),
    Center("center"),
    Justify("justify"),
    Initial("initial"),
    Inherit("inherit"),
}

fun StyleBuilder.textAlignUtil(textAlign: TextAlign) {
    property("text-align", StylePropertyValue(textAlign.value))
}

enum class OverflowStyle(val value: String) {
    Visible("visible"),
    Hidden("hidden"),
    Scroll("scroll"),
    Auto("auto"),
    Initial("initial"),
    Inherit("inherit"),
}

fun StyleBuilder.overflowUtil(overflowStyle: OverflowStyle) {
    property("overflow", StylePropertyValue(overflowStyle.value))
}

fun StyleBuilder.marginBottomUtil(value: CSSSizeValue) {
    property("margin-bottom", value(value.toString()))
}

fun StyleBuilder.marginRightUtil(value: CSSSizeValue) {
    property("margin-right", value(value.toString()))
}

fun StyleBuilder.paddingTopUtil(value: CSSSizeValue) {
    property("padding-top", value(value.toString()))
}

fun StyleBuilder.paddingBottomUtil(value: CSSSizeValue) {
    property("padding-bottom", value(value.toString()))
}

fun StyleBuilder.paddingLeftUtil(value: CSSSizeValue) {
    property("padding-left", value(value.toString()))
}

fun StyleBuilder.animationDurationUtil(value: CSSTimeValue) {
    property("animation-duration", value(value.toString()))
}