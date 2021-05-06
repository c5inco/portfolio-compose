package com.c5inco.portfolio.data

import com.c5inco.portfolio.style.HomeStylesheet

data class ProjectData(
    val name: String,
    val description: String,
    val styleRef: String,
    val articleData: List<Any> = listOf()
)

val ProjectsRepository = listOf(
    ProjectData(
        "vscode",
        "Visual Studio Code",
        HomeStylesheet.vscode
    ),
    ProjectData(
        "cortana",
        "Cortana Actions",
        HomeStylesheet.cortana
    ),
    ProjectData(
        "slackbots",
        "Slack Bots",
        HomeStylesheet.slackbots
    ),
    ProjectData(
        "devcanvas",
        "Developer Canvas",
        HomeStylesheet.devcanvas
    ),
    ProjectData(
        "touchdev",
        "Touch-First Dev Tools",
        HomeStylesheet.touchdev
    ),
    ProjectData(
        name = "magicalmusic",
        description = "Magical Music",
        articleData = listOf(
            ArticleParagraph(
                content = "<strong>Magical Music</strong> is a fun app for learning how to play your favorite songs on the piano or keyboard. The concept is similar to Guitar Hero, with notes falling from the top as the song progresses, giving you an overall grade on how well you hit the right notes."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/magicalmusic/mm1.png",
                        caption = "The player picks the song to learn at the landing page"
                    )
                )
            ),
            ArticleParagraph(
                content = "The difference is that you learn the actual notes of the song, and can choose to play either on the virtual keyboard or with an accompanying real keyboard or piano."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/magicalmusic/mm2.png",
                        caption = "As the notes fall, the player hits the corresponding key"
                    )
                )
            ),
            ArticleParagraph(
                content = "The app was built to showcase the ease at which developers could build beautiful, yet powerful Windows 8 applications quickly and easily by combining native C++ with Windows 8 XAML. It was released as a sample at the //build 2011 conference."
            ),
            ArticleParagraph(
                content = "I designed and implemented the overall app experience in collaboration with other developers. It was a short project but a great learning experience overall because it was my first design project for Microsoft, my first time shipping and I got to learn a little bit of C++ (we used it to process the incoming sound from the real keyboard!)."
            )
        ),
        styleRef = HomeStylesheet.magicalMusic
    ),
    ProjectData(
        name = "hololens",
        description = "Microsoft Hololens",
        articleData = listOf(
            ArticleParagraph(
                content = "<strong>Microsoft HoloLens</strong> is the first fully self-contained, holographic computer, enabling you to interact with high‑definition holograms in your world. I'm currently a designer on the product, shaping the future of mixed reality experiences on the Windows Holographic platform.",
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/hololens/holostudio.png",
                        caption = "HoloStudio is one of the many apps that allows you to build 3D models in your physical space"
                    )
                )
            ),
            ArticleParagraph(
                content = "And that's all I can say about that ;)",
            ),
        ),
        styleRef = HomeStylesheet.hololens
    ),
    ProjectData(
        "islandwood",
        "Windows Bridge for iOS",
        HomeStylesheet.islandwood
    ),
    ProjectData(
        "funsies",
        "For Funsies",
        HomeStylesheet.funsies
    ),
)

data class ArticleParagraph(
    val content: String,
)

data class ArticleImages(
    val images: List<ArticleImage>,
)

data class ArticleImage(
    val src: String,
    val caption: String,
    val multiplier: Int = 1
)

enum class ChunkType {
    Text,
    Image
}
