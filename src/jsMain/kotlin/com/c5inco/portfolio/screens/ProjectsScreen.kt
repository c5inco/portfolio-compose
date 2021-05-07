package com.c5inco.portfolio.screens

import androidx.compose.runtime.Composable
import androidx.compose.web.css.Style
import androidx.compose.web.elements.*
import com.c5inco.portfolio.components.Caption
import com.c5inco.portfolio.components.Carousel
import com.c5inco.portfolio.data.*
import com.c5inco.portfolio.style.FoundationStylesheet
import com.c5inco.portfolio.style.ProjectsStylesheet

val blockRowStyles = listOf(
    FoundationStylesheet.row,
    FoundationStylesheet.column,
    FoundationStylesheet.smallCentered,
    FoundationStylesheet.small11,
    FoundationStylesheet.medium10,
    FoundationStylesheet.large8
)

@Composable
fun ProjectsScreen(
    data: ProjectData = ProjectsRepository["islandwood"]!!
) {
    Style(ProjectsStylesheet)

    val (name, description, _, articleData) = data

    Div {
        Div(attrs = { classes(ProjectsStylesheet.project)} ) {
            Div(attrs = { classes(
                *blockRowStyles.toTypedArray()
            )}) {
                H2(attrs = { classes(ProjectsStylesheet.projectName)} ) {
                    Text("$description")
                }
            }
            if (articleData.isNotEmpty()) {
                articleData.forEach {
                    if (it is ArticleParagraph) {
                        if (it.content.isNotEmpty()) renderParagraph(it.content)
                    }
                    if (it is ArticleImages) {
                        if (it.images.isNotEmpty()) {
                            if (it.showAsCarousel) {
                                renderCarousel(it.images)
                            } else {
                                renderImages(it.images)
                            }
                        }
                    }
                }
            }
        }
        Footer {
            Div {
                A(href = "/") {
                    H3 { Text("back to home") }
                }
            }
        }
    }
}

@Composable
private fun renderParagraph(content: List<Any>) {
    Div(attrs = { classes(*blockRowStyles.toTypedArray()) }) {
        P {
            content.forEach {
                when (it) {
                    is ArticleBold -> {
                        B { Text(it.content) }
                    }
                    is ArticleLink -> {
                        A(href = it.url) { Text(it.content) }
                    }
                    is ArticleUnorderedList -> {
                        Ul {
                            it.items.forEach {
                                Li {
                                    renderListItem(it.content)
                                }
                            }
                        }
                    }
                    else -> {
                        val span = it as ArticleSpan
                        Text(it.content)
                    }
                }
            }
        }
    }
}

@Composable
private fun renderListItem(content: List<Any>) {
    content.forEach {
        when (it) {
            is ArticleBold -> {
                B { Text(it.content) }
            }
            is ArticleLink -> {
                A(href = it.url) { Text(it.content) }
            }
            else -> {
                val span = it as ArticleSpan
                Text(it.content)
            }
        }
    }
}

@Composable
private fun renderImages(images: List<ArticleImage>) {
    val rowStyles = mutableListOf(
        FoundationStylesheet.row,
        FoundationStylesheet.column,
        FoundationStylesheet.smallCentered,
        FoundationStylesheet.small12,
        ProjectsStylesheet.gallery
    )

    val colStyles = mutableListOf(
        FoundationStylesheet.row,
        FoundationStylesheet.column,
        FoundationStylesheet.smallUp1
    )

    if (images.size > 1) {
        if (images.size % 3 == 0) {
            rowStyles.add(FoundationStylesheet.medium11)
            colStyles.add(FoundationStylesheet.mediumUp3)
        } else if (images.size % 2 == 0) {
            rowStyles.add(FoundationStylesheet.medium8)
            colStyles.add(FoundationStylesheet.mediumUp2)
        }

        Div(attrs = { classes(
            *rowStyles.toTypedArray()
        )}) {
            Div(attrs = { classes(
                *colStyles.toTypedArray()
            )}) {
                images.forEach {
                    Div(attrs = { classes(FoundationStylesheet.column) }) {
                        renderImageElement(it)
                        Caption(it.caption)
                    }
                }
            }
        }
    } else {
        val image = images[0]

        Div(attrs = { classes(
            FoundationStylesheet.row,
            FoundationStylesheet.column,
            FoundationStylesheet.smallCentered,
            FoundationStylesheet.small12,
            FoundationStylesheet.medium11
        )}) {
            renderImageElement(image)
            Caption(image.caption)
        }
    }
}

@Composable
private fun renderImageElement(image: ArticleImage) {
    val (src, _, multiplier) = image

    if (multiplier == 2) {
        val tmp = src.split(".")

        Img(
            src = src,
            attrs = {
                classes(ProjectsStylesheet.maskImage)
                attr("srcSet", "${tmp[0]}@2x.${tmp[1]} 2x")
            },
        )
    } else {
        Img(
            src = src,
            attrs = { classes(ProjectsStylesheet.fullImage) },
        )
    }
}

@Composable
private fun renderCarousel(images: List<ArticleImage>) {
    Div(attrs = { classes(
        FoundationStylesheet.row,
        FoundationStylesheet.column,
        FoundationStylesheet.smallCentered,
        FoundationStylesheet.small12,
        FoundationStylesheet.medium11,
    )}) {
        Carousel(images)
    }
}