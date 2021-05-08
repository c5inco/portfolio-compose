package com.c5inco.portfolio

import androidx.compose.web.css.Style
import androidx.compose.web.renderComposable
import com.c5inco.portfolio.data.ProjectsRepository
import com.c5inco.portfolio.screens.HomeScreen
import com.c5inco.portfolio.screens.ProjectsScreen
import com.c5inco.portfolio.styles.AppStylesheet
import kotlinx.browser.window
import org.w3c.dom.url.URLSearchParams

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)

        var params = URLSearchParams(window.location.search)
        var project = params.get("project") ?: "/"

        if (project == "/") {
            HomeScreen()
        } else {
            ProjectsRepository[project]?.let { ProjectsScreen(data = it) }
        }
    }
}

