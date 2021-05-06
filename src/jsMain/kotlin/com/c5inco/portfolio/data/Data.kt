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
        name = "slackbots",
        description = "Slack Bots",
        articleData = listOf(
            ArticleParagraph(
              "The culture of email has always been a challenge for me. With the ever-growing list of different collaboration channels, across roles, services and tools, all being funneled into a singluar system, I strongly believe email as the one tool to-rule-them-all doesn't work for the demands of a modern product development organization."
            ),
            ArticleParagraph(
                "For a brief moment, my design team decided to evaluate Slack as a meaningful alternative. In only just a week, it was truly amazing to see how much fun we were having already, whether it was the rampant use of Giphy and/or emojis, or the fact that we could continuously joke with each other at all times of the day, on any device (contrasted with the belief that most people don't enjoy really writing email on mobile)."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/random-slack.png",
                        caption = "Casual banter in our \"random\" channel"
                    )
                )
            ),
            ArticleParagraph(
                "At the heart of all this, we felt that it was the <strong>Slack Bots</strong> that were the stars of the show. Besides the built-in Giphy and slackbot, we found other ones to keep things interesting, such as a Foursquare bot to tell us where the closest donut shop was or a Poll bot that helped us decide where to eat lunch."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/poll-donuts.png",
                        caption = "Casual banter in our \"random\" channel"
                    )
                )
            ),
            ArticleParagraph(
                "The more we used the bots, the more interested I became in writing my own. Coincidentally, our team was also just starting to think about natural language experiences for Windows, which further piqued my interest in understanding the Slack bots inner workings."
            ),
            ArticleParagraph(
                "\"Learning-by-making\" is an essential part of my design process, so I decided to dive right in and write my own Slack bots to help answer these questions:<ul><li>How did it all work and what was possible?</li><li>How smart could it be?</li><li>What expectations do consumers have?</li><li>How should developers think about meeting these expectations?</li><li>What was the developer workflow?</li><li>Where did this fit in relative to digital assistants like Siri and Alexa?</li></ul>"
            ),
            ArticleParagraph(
                "I felt these were important to answer not only for my own curiosity, but also to help our design team ramp up on the experiential and technical nuances of bots, assistants and AI in general."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/botkit-homepage.png",
                        caption = "Botkit homepage"
                    )
                )
            ),
            ArticleParagraph(
                "I quickly stumbled upon <a href=\"https://howdy.ai/botkit/\">Botkit</a>, an open-source toolkit for creating bots. At the time, it was the most popular way to build bots for Slack, despite not being from Slack (although strongly endorsed). I then used it to create two bots:<ol><li><strong>Gossip Bot</strong> - bot that loved to hear gossip but only would tell you random tidbits (<a href=\"https://github.com/c5inco/GossipBot\">code on GitHub</a>)</li><li><strong>Meeting Bot</strong> - bot that told me if my colleagues were in a meeting</li>"
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/gossip-testing.png",
                        caption = "Fun conversations during testing"
                    ),
                    ArticleImage(
                        src = "/img/slackbots/meetings-testing.png",
                        caption = "Can't seem to figure out where Mark is..."
                    )
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/bot-coding.gif",
                        caption = "Building the bots with Visual Studio Code"
                    ),
                )
            ),
            ArticleParagraph(
                "The insights I gained in understanding Botkit's approach to building bots was invaluable for my future work on natural language experiences:<ul><li>Intents, slots and dialogs are the lego blocks to building natural speech apps.</li><li>The magic behind bots and digital assistants are technically not all that different.</li><li>Building a bot Slack means you can build a bot for any other platform.</li><li>Bots are usually single-purpose, with suspended disbelief on what it tasks it can complete. Digital assistants on the other hand are unrealistically expected to work with human intelligence, which usually leaves us disappointed.</li></ul>"
            ),
            ArticleParagraph(
                "But I couldn't just keep these things to myself. So I decided to share my insights with our design team through a Bot Workshop."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/bots-workshop.png",
                        caption = "Agenda for Bots Workshop"
                    ),
                )
            ),
            ArticleParagraph(
                "The workshop was a huge success - by the end, each participant built their and modified their own Slack bot, understood the developer workflow and were aware of the experience ramificiations ahead."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/workshop-channel.png",
                        caption = "Workshop musings with everyone's created bots"
                    ),
                )
            ),
            ArticleParagraph(
                "I finished things up by sharing my <a href=\"https://chatbotsmagazine.com/botkit-visual-studio-code-3252800048ba#.cvzxepnzm\">development experience on Medium</a>, as a way to give back to the community and give big kudos to Botkit."
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/slackbots/medium-post.png",
                        caption = "Medium post featured in Chatbots Magazine!"
                    ),
                )
            ),
        ),
        styleRef = HomeStylesheet.slackbots
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
