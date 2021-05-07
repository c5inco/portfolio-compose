package com.c5inco.portfolio

import androidx.compose.web.css.Style
import androidx.compose.web.renderComposable
import com.c5inco.portfolio.screens.ProjectsScreen
import com.c5inco.portfolio.styles.AppStylesheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)

        // HomeScreen()
        ProjectsScreen()
    }
}

