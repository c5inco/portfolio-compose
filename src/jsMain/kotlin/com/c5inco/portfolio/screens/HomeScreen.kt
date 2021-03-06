package com.c5inco.portfolio.screens

import androidx.compose.runtime.Composable
import com.c5inco.portfolio.data.ProjectsRepository
import com.c5inco.portfolio.styles.AnimateCssStyleSheet
import com.c5inco.portfolio.styles.FoundationStylesheet
import com.c5inco.portfolio.styles.HomeStylesheet
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.dom.*

@Composable
fun HomeScreen() {
    Style(HomeStylesheet)

    Div {
        Div {
            renderHeader()
            Section(attrs = { classes(
                HomeStylesheet.work,
                FoundationStylesheet.row,
                FoundationStylesheet.column,
                FoundationStylesheet.smallCentered,
                FoundationStylesheet.small12,
                FoundationStylesheet.medium9
            )}) {
                renderIntro()
                renderProjects()
            }
            renderFooter()
        }
    }
}

@Composable
private fun renderHeader() {
    Section(attrs = { classes(HomeStylesheet.main) }) {
        Div(attrs = {
            classes(
                HomeStylesheet.bannerText,
                AnimateCssStyleSheet.animated,
                AnimateCssStyleSheet.fadeInDown
            )
        }) {
            H1(attrs = { classes(HomeStylesheet.name) }) {
                Text("Chris Sinco")
            }
            H2(attrs = { classes(HomeStylesheet.title) }) {
                Text("Experience Designer".uppercase())
            }
        }
        Div(attrs = {
            classes(
                HomeStylesheet.mtnsContainer,
                AnimateCssStyleSheet.animated,
                AnimateCssStyleSheet.fadeInUp
            )
        }) {
            Img("img/banner-graphic.svg", attrs = { classes(HomeStylesheet.mtns) })
        }
    }
}

@Composable
private fun renderIntro() {
    Div(attrs = { classes(FoundationStylesheet.row) }) {
        Div(attrs = {
            classes(
                FoundationStylesheet.column,
                FoundationStylesheet.smallCentered,
                FoundationStylesheet.small10,
                FoundationStylesheet.large7,
                HomeStylesheet.info,
                AnimateCssStyleSheet.animated,
                AnimateCssStyleSheet.zoomIn
            )
        }) {
            Div(attrs = { classes(HomeStylesheet.avatar) }) { }
            H2({ style { fontWeight("bold") }}) {
                Text("aloha.")
            }
            P {
                Text("I'm a designer and maker based in Seattle that loves building tools to empower creatives. I believe code is just as much a design tool as Photoshop.")
            }
            P {
                Text("I'm currently at Google shaping the future for Android developer experiences.")
            }
            Br {}
            P {
                Text("Here is a portfolio of my work to-date. Mahalo.")
            }
        }
    }
}

@Composable
private fun renderProjects() {
    Div(
        attrs = {
            classes(
                FoundationStylesheet.row,
                FoundationStylesheet.smallUp1,
                FoundationStylesheet.mediumUp2,
                FoundationStylesheet.largeUp3
            )
        }
    ) {
        ProjectsRepository.forEach { (key, project) ->
            Div(attrs = { classes(FoundationStylesheet.column, HomeStylesheet.col) }) {
                A(
                    href = "?project=${key}",
                    attrs = {
                        classes(HomeStylesheet.card)
                    }
                ) {
                    Div(attrs = { classes(HomeStylesheet.preview, project.styleRef) }) { }
                    H4(attrs = { classes(HomeStylesheet.caption) }) {
                        Text(project.description)
                    }
                }
            }
        }
    }
}

@Composable
private fun renderFooter() {
    Footer(attrs = { classes(HomeStylesheet.contact) }) {
        Div(attrs = { classes(FoundationStylesheet.row, FoundationStylesheet.column) }) {
            Div(attrs = {
                classes(
                    HomeStylesheet.block,
                    HomeStylesheet.email
                )
            }) {
                A(href = "mailto:csinco.design@gmail.com") {
                    Text("email")
                }
            }
            Div(attrs = {
                classes(
                    HomeStylesheet.block,
                    HomeStylesheet.resume
                )
            }) {
                A(href = "https://dl.dropboxusercontent.com/u/167736493/csinco_resume.pdf") {
                    Text("resume")
                }
            }
            Div(attrs = {
                classes(
                    HomeStylesheet.block,
                    HomeStylesheet.linkedin
                )
            }) {
                A(href = "https://www.linkedin.com/in/chris-sinco-2363994") {
                    Text("linkedin")
                }
            }
            Div(attrs = {
                classes(
                    HomeStylesheet.block,
                    HomeStylesheet.github
                )
            }) {
                A(href = "https://github.com/c5inco") {
                    Text("github")
                }
            }
            Div(attrs = { classes(HomeStylesheet.trademark) }) {
                Text("Designed and coded by Chris Sinco")
            }
        }
    }
}