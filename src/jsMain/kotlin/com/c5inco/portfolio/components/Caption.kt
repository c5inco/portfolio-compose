package com.c5inco.portfolio.components

import androidx.compose.runtime.Composable
import com.c5inco.portfolio.styles.AppStylesheet
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun AppCaption(caption: String) {
    Div(
        attrs = { classes(AppCaptionsStyles.caption) }) {
        Text(caption)
    }
}

object AppCaptionsStyles: StyleSheet(AppStylesheet) {
    val caption by style {
        marginTop(0.5.cssRem)
        property("padding", "0.5rem 1rem")
        fontSize(0.7.cssRem)
        opacity(0.7f)
        textAlign("center")

        media(mediaMinWidth(40.em)) {
            self style {
                fontSize(0.9.cssRem)
                maxWidth(80.percent)
                property("margin", "0.5rem auto 0")
            }
        }
    }
}