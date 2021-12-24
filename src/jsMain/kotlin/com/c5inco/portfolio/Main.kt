package com.c5inco.portfolio

import com.c5inco.portfolio.data.ProjectsRepository
import com.c5inco.portfolio.screens.HomeScreen
import com.c5inco.portfolio.screens.ProjectsScreen
import com.c5inco.portfolio.styles.AppStylesheet
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.url.URLSearchParams

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)

        val params = URLSearchParams(window.location.search)
        val project = params.get("project") ?: "/"

        if (project == "/") {
            HomeScreen()
        } else {
            ProjectsRepository[project]?.let { ProjectsScreen(data = it) }
        }
    }
}

