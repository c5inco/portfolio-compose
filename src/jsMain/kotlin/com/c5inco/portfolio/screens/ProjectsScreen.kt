package com.c5inco.portfolio.screens

import androidx.compose.runtime.*
import com.c5inco.portfolio.components.*
import com.c5inco.portfolio.data.*
import com.c5inco.portfolio.styles.FoundationStylesheet
import com.c5inco.portfolio.styles.ProjectsStylesheet
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

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
    data: ProjectData = ProjectsRepository["cortana"]!!
) {
    Style(ProjectsStylesheet)

    val (description, _, articleData) = data
    var windowWidth by remember { mutableStateOf(0) }

    window.onresize = {
        windowWidth = window.innerWidth
        windowWidth
    }

    document.title = "c5inco // Projects / $description"

    Div {
        Div(attrs = { classes(ProjectsStylesheet.project)} ) {
            Div(attrs = { classes(
                *blockRowStyles.toTypedArray()
            )}) {
                H2(attrs = { classes(ProjectsStylesheet.projectName)} ) {
                    Text(description)
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
                                renderCarousel(windowWidth, it.images)
                            } else {
                                renderImages(it.images)
                            }
                        }
                    }
                    if (it is ArticleVideo) {
                        renderVideo(it)
                    }
                    if (it is ArticleIframe) {
                        renderIframe(it)
                    }
                }
            }
        }
        Footer(attrs = { classes(ProjectsStylesheet.projectNav)} ) {
            Div(attrs = { classes(ProjectsStylesheet.navLink)} ) {
                A(href = "/") {
                    H3 { Text("back to home") }
                }
            }
        }
    }
}

@Composable
fun renderIframe(it: ArticleIframe) {
    Div(attrs = { classes(*blockRowStyles.toTypedArray()) }) {
        Iframe(
            attrs = {
                src(it.src)
                frameBorder(0)
                style {
                    width(100.percent)
                    height((it.height).px)
                }
            },
        )
    }
}

@Composable
private fun renderParagraph(content: List<Any>) {
    Div(attrs = {
        classes(*blockRowStyles.toTypedArray())
    }) {
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
                        Text((it as ArticleSpan).content)
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
                Text((it as ArticleSpan).content)
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
                        renderImageElement(it, ProjectsStylesheet.maskImage)
                        AppCaption(it.caption)
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
            AppCaption(image.caption)
        }
    }
}

@Composable
private fun renderImageElement(
    image: ArticleImage,
    imageClass: String = ProjectsStylesheet.fullImage
) {
    val (src, _, multiplier) = image

    if (multiplier == 2) {
        val tmp = src.split(".")

        Img(
            src = src,
            attrs = {
                classes(imageClass)
                attr("srcSet", "${tmp[0]}@2x.${tmp[1]} 2x")
            },
        )
    } else {
        Img(
            src = src,
            attrs = { classes(imageClass) },
        )
    }
}

@Composable
private fun renderCarousel(containerWidth: Int, images: List<ArticleImage>) {
    Div(attrs = { classes(
        FoundationStylesheet.row,
        FoundationStylesheet.column,
        FoundationStylesheet.smallCentered,
        FoundationStylesheet.small12,
        FoundationStylesheet.medium11,
    )}) {
        Carousel(containerWidth, images)
    }
}

@Composable
private fun renderVideo(video: ArticleVideo) {
    Div(attrs = { classes(
        FoundationStylesheet.row,
        FoundationStylesheet.column,
        FoundationStylesheet.smallCentered,
        FoundationStylesheet.small12,
        FoundationStylesheet.medium8,
    )}) {
        Div(attrs = { classes(ProjectsStylesheet.videoWrapper) }) {
            Iframe(
                {
                    src("${video.src}?rel=0&hd=1")
                    frameBorder(0)
                    allowFullscreen(true)
                }
            )
        }
        AppCaption(video.caption)
    }
}
