package com.c5inco.portfolio

import androidx.compose.web.css.Style
import androidx.compose.web.renderComposable
import com.c5inco.portfolio.screens.ProjectsScreen
import com.c5inco.portfolio.style.AnimateCssStyleSheet
import com.c5inco.portfolio.style.CommonStylesheet
import com.c5inco.portfolio.style.FoundationStylesheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(FoundationStylesheet)
        Style(AnimateCssStyleSheet)
        Style(CommonStylesheet)

        //HomeScreen()
        ProjectsScreen()
    }
}

