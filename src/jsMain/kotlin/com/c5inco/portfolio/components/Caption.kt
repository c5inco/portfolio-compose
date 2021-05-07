package com.c5inco.portfolio.components

import androidx.compose.runtime.Composable
import androidx.compose.web.css.*
import androidx.compose.web.elements.Div
import androidx.compose.web.elements.Text
import com.c5inco.portfolio.styles.AppStylesheet

@Composable
fun Caption(caption: String) {
    Div(
        attrs = { classes(CaptionsStyles.caption) }) {
        Text("$caption")
    }
}

object CaptionsStyles: StyleSheet(AppStylesheet) {
    val caption by style {
        marginTop(0.5.rem)
        property("padding", value("0.5rem 1rem"))
        fontSize(0.7.rem)
        opacity(0.7f)
        property("text-align", value("center"))

        media(minWidth(40.em)) {
            self style {
                fontSize(0.9.rem)
                property("max-width", value(80.percent))
                property("margin", value("0.5rem auto 0"))
            }
        }
    }
}