package com.c5inco.portfolio.data

import com.c5inco.portfolio.styles.HomeStylesheet

data class ProjectData(
    val description: String,
    val styleRef: String,
    val articleData: List<Any> = listOf()
)

val ProjectsRepository = hashMapOf(
    "vscode" to ProjectData(
        description = "Visual Studio Code",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Visual Studio Code"),
                    ArticleSpan(" is a lightweight, cross-platform code editor for writing modern web and cloud applications that will run on OS X, Linux and Windows. The product was announced at the //build 2015 conference. After only a year, it had been installed over 2 million times, had over 500K monthly active users and became open-source. It\\'s one of the first native Microsoft developer apps to be released for OS X and Linux, and is the most popular Microsoft project on "),
                    ArticleLink(url = "https://github.com/Microsoft/vscode", content = "GitHub"),
                    ArticleSpan(".")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/vscode-site.png",
                        caption = "Landing page comp for product launch",
                        multiplier = 2
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The product was unique in that it combined the simplicity of a text editor with the superpowers of an full-blown integrated development environment (IDE). The result was a focused tool that we believe gives developers a streamlined workflow, that can be a core part of the tool set for building any kind of application."),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/vscode0.png",
                        caption = "Simple and clean debugging support"
                    ),
                    ArticleImage(
                        src = "/img/vscode/vscode5.png",
                        caption = "Core Git support for quick diffs and commits"
                    ),
                    ArticleImage(
                        src = "/img/vscode/vscode2.png",
                        caption = "Viewing relationships between code and files"
                    ),
                    ArticleImage(
                        src = "/img/vscode/vscode1.png",
                        caption = "Refactoring included"
                    ),
                    ArticleImage(
                        src = "/img/vscode/vscode3.png",
                        caption = "Intelligent code completion"
                    )
                ),
                showAsCarousel = true
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("What I find the most interesting about the results is not our success but the journey we took to get there to truly understand what problems we were trying to solve."),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("In the beginning, the problem statement we had was that Microsoft developers didn't have the ability to reliably work from anywhere. There were several solutions out there to help developers move their work across machines, but many times it required them to reinstall and reconfigure their favorite tools each time. Our solution was to provide code authoring experiences in the browser, removing the need to reinstall and reestablish context - as long as you had access to a browser, your tools, code and context followed with you."),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The first experience we released was a simple web control, the "),
                    ArticleLink(url = "https://github.com/Microsoft/monaco-editor", content = "Monaco Editor"),
                    ArticleSpan(". It was embedded in various Microsoft products as a way to work with code in a productive and consistent manner across the web."),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/f12.png",
                        caption = "The editor was used in the Internet Explorer Developer Tools, OneDrive, Windows Azure and more"
                    ),
                    ArticleImage(
                        src = "/img/vscode/onedrive.png",
                        caption = "Editing code in OneDrive with Monaco Editor"
                    ),
                    ArticleImage(
                        src = "/img/vscode/zumo.png",
                        caption = "Editing Windows Azure scripts with Monaco Editor"
                    ),
                    ArticleImage(
                        src = "/img/vscode/tfs.png",
                        caption = "Editing source code in Visual Studio Team Services with Monaco Editor"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("We then evolved the experience into a lightweight, browser-based development environment called Visual Studio Online \"Monaco\" - not the best name, but our first big step to realizing our vision."),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/vsmonaco.png",
                        caption = "\"Monaco\", a lightweight, browser-based development environment"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The "),
                    ArticleLink(url = "https://techcrunch.com/2015/04/29/microsoft-shocks-the-world-with-visual-studio-code-a-free-code-editor-for-os-x-linux-and-windows/", content = "preview release"),
                    ArticleSpan(" of \"Monaco\" in 2013 went well at first. However, over the next year we found that while the idea of coding from anywhere was exciting, the reality we observed was that most developers used it sparingly, only to make small tweaks here and there, and only during times of crises and being away from a work machine."),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Through research, observation and feedback, our key takeaways were:"),
                    ArticleUnorderedList(
                        items = listOf(
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Most complementary tools used in the developers' workflows were not available in the browser.")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Most developers ultimately didn't trust the performance and reliability of the browser - too slow, easy to lose changes, difficult to troubleshoot.")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Many modern development tools were becoming easier to reinstall and reconfigure across machines.")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Most developers (Microsoft and non-Microsoft) loved that we created a lightweight version of Visual Studio that was cross-platform and more powerful out-of-the-box than their current other tools.")
                                )
                            ),
                        )
                    )
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/research1.png",
                        caption = "Research notes from on-site interviews with non-Microsoft developers"
                    ),
                    ArticleImage(
                        src = "/img/vscode/research2.png",
                        caption = "Preferred Eclipse layout from on-site interview notes"
                    ),
                    ArticleImage(
                        src = "/img/vscode/research3.png",
                        caption = "Preferred Vim layout from on-site interview notes"
                    ),
                ),
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/blade-sketch1.png",
                        caption = "Brainstorming \"Monaco\" as a full-blown IDE in the browser"
                    ),
                    ArticleImage(
                        src = "/img/vscode/blade-sketch3.png",
                        caption = "Workspaces concepting"
                    ),
                    ArticleImage(
                        src = "/img/vscode/sketch1.png",
                        caption = "Thinking about tab models"
                    ),
                    ArticleImage(
                        src = "/img/vscode/blade-sketch2.png",
                        caption = "Showing content panes as composable parts"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("This lead us to pivot our efforts towards solving a different problem: that while many developers used lightweight tools, they had to spend additional time installing features that they felt were fundamental and should just come for free. Hence, we evolved the product into "),
                    ArticleLink(url = "http://code.visualstudio.com", content = "Visual Studio Code"),
                    ArticleSpan(", a new kind of cross-platform development tool, one that focuses on core developer productivity."),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I was the Lead Designer throughout this amazing journey, delivering design artifacts from storyboards to detailed visual/interaction specs to working prototypes to front-end production code."),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/installer-c.png",
                        caption = "Installer loading animation"
                    ),
                    ArticleImage(
                        src = "/img/vscode/installer-final.gif",
                        caption = "Animated final version"
                    ),
                ),
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/nav0.png",
                        caption = "Nav explorations with horizontal Tabs"
                    ),
                    ArticleImage(
                        src = "/img/vscode/nav1.png",
                        caption = "Vertical tabs"
                    ),
                    ArticleImage(
                        src = "/img/vscode/nav2.png",
                        caption = "Icon + text + badges"
                    ),
                    ArticleImage(
                        src = "/img/vscode/nav3.png",
                        caption = "Icon + badges"
                    ),
                    ArticleImage(
                        src = "/img/vscode/nav4.png",
                        caption = "Icon + badges (emphasis with darker color)"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/distractionfree1.png",
                        caption = "Distraction-free mode exploration"
                    ),
                    ArticleImage(
                        src = "/img/vscode/distractionfree2.png",
                        caption = "Popup views while in distraction-free mode"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/quickhelp-all.png",
                        caption = "First-launch help explorations"
                    ),
                ),
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/quickhelp1.png",
                        caption = "Illustration explorations"
                    ),
                    ArticleImage(
                        src = "/img/vscode/quickhelp2.png",
                        caption = "Quick open visual"
                    ),
                    ArticleImage(
                        src = "/img/vscode/quickhelp3.png",
                        caption = "Auto-save visual"
                    ),
                ),
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/quickhelp-artboard.png",
                        caption = "Illustrations exploration with branding color palette"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I also became a key contributor to the research and telemetry efforts, conducting various usability studies, cognitive walkthroughs and in-person interviews with users to help to collect and synthesize valuable insights and feedback from them, ensuring we had the most reliable data possible to help drive product decisions. Even though my primary role was design, I was eager to grow into a research role as I felt I could make even more impact by interfacing more directly with our users."),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/focus-group2.png",
                        caption = "Affinity diagrams from a focus group of non-Microsoft developers"
                    ),
                    ArticleImage(
                        src = "/img/vscode/focus-group4.png",
                        caption = "More affinity diagrams"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Our product team was small and globally distributed, with the engineers in Zurich, Switzerland and research in Edinburgh, Scotland. I would be lying if I said collaboration wasn't a challenge. However I felt it was my strongest and best collaboration at Microsoft. We had daily standups in both Zurich and Redmond, using OneNote to keep our work in-sync and as a standing wiki. We used designated meeting intervals (7-10am in Redmond) to ensure we could meet in a timely and purposeful manner. And for everything else, we made video recordings of conversations, design ideas and prototypes to help communicate as much context as possible. We would also fly back-and-forth throughout the year to ensure we did deep in-person collaborations and constantly improve team bonding and dynamics."),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/recording.png",
                        caption = "Recording a high-contrast theme demo for the remote folks"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Along the product's journey, we also partnered with other Microsoft teams that wanted to expand the product capabilities. The challenge here was ensuring that their feature requests benefited all users and not just optimized for certain ones. Our working model became that if the feature was too verticallly specific, it should be packaged up in an extension, giving the user full control over whether they needed the additional functionality. For everything else, we would incorporate it into the product and measure its success over time through user testing and telemetry."),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/vscode/extensions-marketplace.png",
                        caption = "Users can find hundreds of extensions to meet their needs"
                    ),
                ),
            ),
        ),
        styleRef = HomeStylesheet.vscode
    ),
    "cortana" to ProjectData(
        description = "Cortana Actions",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Cortana Actions"),
                    ArticleSpan(" are extensible, contextual deep-links that appear as part of the Cortana experience on Windows 10 devices. App developers can register these actions through the online developer portal, to surface based on registered keywords, phrases and contextual cues that are extracted during a user's Cortana request.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/cards.png",
                        caption = "Examples of Cortana cards with actions"
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("For example, if a user asks Cortana to \"get a taxi\", services such as Uber can provide deep-links to their app to help complete the request. Similarly, if Cortana notices an approaching appointment, it can suggest to \"get a taxi\" at the appropriate time - at that point, the same registered Uber deep-link would appear.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The developer preview was released at the //build 2016 conference, highlighted in the opening keynote.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/cortana-keynote.png",
                        caption = "Keynote breakdown of Microsoft's new Conversation-as-a-Platform thinking"
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("From the consumer's perspective, they shouldn't even need be aware of Cortana Actions as a concept - they just speak to Cortana naturally, and she attempts to fulfill the request. On the flip side, the developers that register these deep-links need to understand how Cortana breaks down queries and based on that knowledge how to reliably surface their apps/services at the best time.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("As a design team, creating a portal experience was pretty familiar and straightforward. The real challenge we faced was how to help users reliably understand and develop for the emerging domain of natural language processing and artificial intelligence.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/luis-breakdown.png",
                        caption = "Sketches of the concept and mental models"
                    ),
                    ArticleImage(
                        src = "/img/cortana/order-pizza1.png",
                        caption = "Concepts of a speech project template"
                    ),
                    ArticleImage(
                        src = "/img/cortana/order-pizza2.png",
                        caption = "Further concepts of a speech project template"
                    ),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Up until this point, the inner workings of Cortana and many other digital assistants (Siri, Google, etc), were very much a black box of processing magic. This sort of hand-waving wouldn't be acceptable for developers, since surfacing deep-links in Cortana was akin to digital advertising in that companies needed to have strict control over when and where they were exposed.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/contoso-cafe-1pa.png",
                        caption = "Flow chart of Cortana Action data being passed to an app"
                    ),
                    ArticleImage(
                        src = "/img/cortana/contoso-cafe-3pa.png",
                        caption = "Flow chart of custom Cortana action data being passed to an app"
                    ),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("We ourselves were new to the domain, so we had to spend about a couple weeks in the beginning getting ramped up before we could even brainstorm or sketch. Note: the learning never really ended because the processing technology itself is a moving target, continually advancing, and depending on who you talk to will differ from expert to expert.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("On my end, the key part of my design process was \"learning-by-making\" - I decided that the best way to learn was to build a natural language solution myself. The easiest thing I found to start with were custom Alexa Skills for the Amazon Echo. I was fortunate that our team had an Echo on-hand and that the development process was pretty straightforward and free to get started.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/alexa-capture.png",
                        caption = "Walking through building an Alexa Skill"
                    ),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I ended up creating several Alexa Skills, from one that was able to tell me what college my colleagues attended, to one that knew whether or not my manager was in a meeting. It was very helpful to see and understand how other platforms communicated the domain concepts, the overall taxonomy and how to expose them to the developer. These hands-on experiences greatly accelerated our ramp up and ultimately made our designs more informed and approachable. I also communicated my learnings to the engineering organization to help them understand how our competitors were conceptualizing the complex domain and how we measured up.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I was one of four designers on the Cortana Developer Experiences product team. My primary responsibilities were providing the design and front-end implementation for the web-based developer portal, in collaboration with designers, content authors and developers across Windows, Bing and Microsoft Research.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("My initial contributions were towards the landing page of the portal. On this page, developers would be introduced to the Cortana developer platform, concepts, taxonomy and where to get started.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/cortana-prod-header.png",
                        caption = "Landing page for //build 2016 launch"
                    ),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("There were several sections on the landing pages that went through many iterations. The order of them also went through just as much discussion since it was very important that users knew what to do next and where to find more information. I decided to use a card sorting exercise with the team to quickly and efficiently decide how things should be sorted. I printed each section and its variations on card stock, cut them out and then let folks sort them in the order they liked. It was a fun exercise and helped us move forward much faster.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/cortana-hero1.png",
                        caption = "Hero exploration A"
                    ),
                    ArticleImage(
                        src = "/img/cortana/cortana-hero2.png",
                        caption = "Hero exploration B"
                    ),
                    ArticleImage(
                        src = "/img/cortana/cortana-hero3.png",
                        caption = "Hero exploration C"
                    ),
                    ArticleImage(
                        src = "/img/cortana/cortana-hero4.png",
                        caption = "Hero exploration D"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/how-section1.png",
                        caption = "How explanation A"
                    ),
                    ArticleImage(
                        src = "/img/cortana/how-section2.png",
                        caption = "How explanation B"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Afterwards, the rest of my contributions were towards designing and implementing the portal workflows to get users onboarded and registering Actions. This took the most time because we were continuously changing the taxonomy of the inner workings of Cortana language processing. On top of that, other Microsoft teams had their own natural language solutions that conceptually conflicted with ours. This required additional negotiation and alignment with folks cross-company to ensure we communicated a unified model and taxonomy to all Microsoft users.")
                )
            ),
            ArticleVideo(
                src = "https://www.youtube.com/embed/UzbpjZiBmCA",
                caption = "Walkthrough of Cortana Actions configuration portal"
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("We ended up with two ways to create an Action: predefined or custom. A predefined Action would allow the developer to hook into existing language models, like \"Book a taxi\" or \"Order food\", and just handle the request if their app/service was clicked on in the Cortana canvas. Using the example from before, Uber would register with \"Book a taxi\", allowing them to show up as one of the options when the user asked Cortana that request.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/actions1.png",
                        caption = "Sign up exploration"
                    ),
                    ArticleImage(
                        src = "/img/cortana/actions2.png",
                        caption = "Welcome exploration"
                    ),
                    ArticleImage(
                        src = "/img/cortana/actions3.png",
                        caption = "Create flow exploration"
                    ),
                    ArticleImage(
                        src = "/img/cortana/actions5.png",
                        caption = "Configuration page exploration - part 1"
                    ),
                    ArticleImage(
                        src = "/img/cortana/actions6.png",
                        caption = "Configuration page exploration - part 2"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/order-sandwich.png",
                        caption = "Experience flow for a predefined action of ordering food"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("While the portal ended up being a straightforward forms experience, I had also played around with the idea of writing code to register the action, something that we thought may be more natural for our developers rather than the usual GUI. I built a simple prototype that allowed you write the code in the browser, as a configuration file with rich code-completion, giving the user in-situ help and validation tips as they typed.")
                )
            ),
            ArticleVideo(
                src = "https://www.youtube.com/embed/OwFA5YbbJ5w",
                caption = "Building a Cortana extension purely with code"
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("We also sketched out ideas for additional Cortana development tools to help developers learn more about the platform, from web-based simulators to email/website schema testers, without needing to install anything.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/simulator.png",
                        caption = "Mobile web simulator for testing Cortana in-context"
                    ),
                ),
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/cortana/schema1.png",
                        caption = "Schema test tool for emails"
                    ),
                    ArticleImage(
                        src = "/img/cortana/schema2.png",
                        caption = "Schema test tool for websites"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Overall, all this work was done to help our developers understand natural language processing all-up, and develop custom Cortana experiences quickly and with confidence.")
                )
            ),
        ),
        styleRef = HomeStylesheet.cortana
    ),
    "slackbots" to ProjectData(
        description = "Slack Bots",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The culture of email has always been a challenge for me. With the ever-growing list of different collaboration channels, across roles, services and tools, all being funneled into a singluar system, I strongly believe email as the one tool to-rule-them-all doesn't work for the demands of a modern product development organization.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("For a brief moment, my design team decided to evaluate Slack as a meaningful alternative. In only just a week, it was truly amazing to see how much fun we were having already, whether it was the rampant use of Giphy and/or emojis, or the fact that we could continuously joke with each other at all times of the day, on any device (contrasted with the belief that most people don't enjoy really writing email on mobile).")
                )
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
                content = listOf(
                    ArticleSpan("At the heart of all this, we felt that it was the "),
                    ArticleBold("Slack Bots"),
                    ArticleSpan(" that were the stars of the show. Besides the built-in Giphy and slackbot, we found other ones to keep things interesting, such as a Foursquare bot to tell us where the closest donut shop was or a Poll bot that helped us decide where to eat lunch.")
                )
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
                content = listOf(
                    ArticleSpan("The more we used the bots, the more interested I became in writing my own. Coincidentally, our team was also just starting to think about natural language experiences for Windows, which further piqued my interest in understanding the Slack bots inner workings.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("\"Learning-by-making\" is an essential part of my design process, so I decided to dive right in and write my own Slack bots to help answer these questions:"),
                    ArticleUnorderedList(
                        listOf(
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("How did it all work and what was possible?")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("How smart could it be?")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("What expectations do consumers have?")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("How should developers think about meeting these expectations?")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("What was the developer workflow?")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Where did this fit in relative to digital assistants like Siri and Alexa?")
                                )
                            )
                        )
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I felt these were important to answer not only for my own curiosity, but also to help our design team ramp up on the experiential and technical nuances of bots, assistants and AI in general.")
                )
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
                content = listOf(
                    ArticleSpan("I quickly stumbled upon "),
                    ArticleLink(content = "Botkit", url = "https://howdy.ai/botkit/"),
                    ArticleSpan(", an open-source toolkit for creating bots. At the time, it was the most popular way to build bots for Slack, despite not being from Slack (although strongly endorsed). I then used it to create two bots:"),
                    ArticleUnorderedList(
                        listOf(
                            ArticleParagraph(
                                content = listOf(
                                    ArticleBold("Gossip Bot"),
                                    ArticleSpan(" - bot that loved to hear gossip but only would tell you random tidbits ("),
                                    ArticleLink(content = "code on GitHub", url = "https://github.com/c5inco/GossipBot"),
                                    ArticleSpan(")")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleBold("Meeting Bot"),
                                    ArticleSpan(" - bot that told me if my colleagues were in a meeting"),
                                )
                            ),
                        )
                    )
                )
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
                content = listOf(
                    ArticleSpan("The insights I gained in understanding Botkit's approach to building bots was invaluable for my future work on natural language experiences:"),
                    ArticleUnorderedList(
                        listOf(
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Intents, slots and dialogs are the lego blocks to building natural speech apps.")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("The magic behind bots and digital assistants are technically not all that different.")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Building a bot Slack means you can build a bot for any other platform.")
                                )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Bots are usually single-purpose, with suspended disbelief on what it tasks it can complete. Digital assistants on the other hand are unrealistically expected to work with human intelligence, which usually leaves us disappointed.")
                                )
                            )
                        )
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("But I couldn't just keep these things to myself. So I decided to share my insights with our design team through a Bot Workshop.")
                )
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
                content = listOf(
                    ArticleSpan("The workshop was a huge success - by the end, each participant built their and modified their own Slack bot, understood the developer workflow and were aware of the experience ramificiations ahead.")
                )
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
                content = listOf(
                    ArticleSpan("I finished things up by sharing my "),
                    ArticleLink(content = "development experience on Medium", url = "https://chatbotsmagazine.com/botkit-visual-studio-code-3252800048ba#.cvzxepnzm"),
                    ArticleSpan(", as a way to give back to the community and give big kudos to Botkit.")
                )
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
    "devcanvas" to ProjectData(
        description = "Developer Canvas",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Developer Canvas"),
                    ArticleSpan(" is a web-based prototype that demonstrates the power of visualizing and organizing artifacts in the software development lifecycle, on a zoomable, pannable canvas surface. The main design concept was leveraging spatial memory and semantic zoom in the workspace, to more efficiently comprehend, navigate and recall an individual's content.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/devcanvas/devcanvas0.png",
                        caption = "Workstreams \"clotheslines\" of contextual, manageable artifacts"
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("From the business standpoint, the prototype was used to better understand the product opportunity for tools that brought multiple team roles together in a single dashboard experience (developers, designers, product managers, operations, sales/marketing, etc), as well as address the urgent need to modernize our current product experiences to be more modular and fit-to-purpose and opposed to monolithic.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The workspace was divided into multiple canvas stacked on each other, allowing the developer to go down and up the stack depending on the task at hand. Potential tasks included:"),
                    ArticleUnorderedList(
                        items = listOf(
                            ArticleParagraph(
                               content = listOf(
                                   ArticleSpan("Reviewing the overall health of the product in-development against triage, backlogs and social media")
                               )
                            ),
                            ArticleParagraph(
                               content = listOf(
                                   ArticleSpan("Creating and managing working sets of files that represented high-level work such as fixing a bug or implementing a feature")
                               )
                            ),
                            ArticleParagraph(
                                content = listOf(
                                    ArticleSpan("Authoring and deploying code straight from the browser")
                                )
                            ),
                        )
                    )
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/devcanvas/devcanvas1.png",
                        caption = "The developer will see their social workspace at the beginning of the day"
                    ),
                    ArticleImage(
                        src = "/img/devcanvas/devcanvas2.png",
                        caption = "Writing code is more distraction free but is still easily accessed with mini-maps"
                    ),
                    ArticleImage(
                        src = "/img/devcanvas/devcanvas3.png",
                        caption = "Project files are easily accessed and hidden away to remove clutter"
                    ),
                    ArticleImage(
                        src = "/img/devcanvas/devcanvas4.png",
                        caption = "Every file shows contribution history, keeping everyone up-to-date and in-sync"
                    )
                ),
                showAsCarousel = true
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("We also played around with universal search across all lifecyle artifacts, along with deep integration with communication tools like Skype. The intent here was to allow the developer to see the relationships between documents across multiple services at-a-glance and also be able to quickly jump into conversations with context.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/devcanvas/search.png",
                        caption = "Universal search across all your artifacts - even with voice"
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I collaborated with a few other designers and researchers to create the prototype, building upon a large amount of envisioning work done in prior years. The code was written in HTML and CSS, along with jQuery and the "),
                    ArticleLink(content = "Monaco Editor", url = "https://github.com/Microsoft/monaco-editor")
                )
            ),
            ArticleVideo(
                src = "https://www.youtube.com/embed/XoAKShNlois",
                caption = "Walkthrough of Developer Canvas"
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The prototype was well-received by folks across the organization. While its current form never became a full-blown product, many of the concepts influenced the design direction of future products, such as "),
                    ArticleLink(content = "Visual Studio Code", url = "/projects/vscode"),
                    ArticleSpan(" and Visual Studio Team Services.")
                )
            ),
        ),
        styleRef = HomeStylesheet.devcanvas
    ),
    "touchdev" to ProjectData(
        description = "Touch-First Dev Tools",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("One of my first gigs on the Visual Studio design team was creating interactive prototypes to help "),
                    ArticleBold("envision and demonstrate the potential for touch-first developer tools"),
                    ArticleSpan(".")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/touchdev/vstouch1.png",
                        caption = "Wireframe concepts - Start by opening a recent project"
                    ),
                    ArticleImage(
                        src = "/img/touchdev/vstouch2.png",
                        caption = "Now you can select a recent file from the workstreams"
                    ),
                    ArticleImage(
                        src = "/img/touchdev/vstouch3.png",
                        caption = "You can quickly switch between files during reading"
                    ),
                    ArticleImage(
                        src = "/img/touchdev/vstouch4.png",
                        caption = "Touch affords an easy way to navigate quickly"
                    ),
                    ArticleImage(
                        src = "/img/touchdev/vstouch5.png",
                        caption = "Conversations can easily be started, in situ and in-context"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleBold("VS Reader"),
                    ArticleSpan(" - code review app that displayed code to look and feel more like a magazine")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/touchdev/vsreader-capture.png",
                        caption = "The developer would start with recent projects"
                    ),
                    ArticleImage(
                        src = "/img/touchdev/vsreader1.png",
                        caption = "We experiemented with code in a magazine layout and style, to enhance code comprehension"
                    ),
                    ArticleImage(
                        src = "/img/touchdev/vsreader2.png",
                        caption = "Peers could also comment as well with text and speech"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Gesture Library"),
                    ArticleSpan(" - Visual Studio extension that allowed developers to execute commands by drawing gestures on the screen")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/touchdev/gestures-capture.png",
                        caption = "The developer could use touch gestures to execute common commands"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Command Center"),
                    ArticleSpan(" - app that offloaded 80% of the commands in Visual Studio, to be used on a slate as a companion to Visual Studio on the desktop")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/touchdev/cc1.png",
                        caption = "Sketch of the companion Command Center app open with Visual Studio"
                    ),
                ),
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/touchdev/cc2.png",
                        caption = "Commands were laid out in a touch-optimized grid on a companion tablet"
                    ),
                ),
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The prototypes were created as Windows 8 apps, using XAML and C#. The other major design goal was to push the status quo towards the direction of providing a \"constellation\" of fit-to-purpose tools instead of a single, monolithic product.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Overall they were well-received and sparked a lot of conversation within the organization. Much of insights were carried over into the planning efforts for Visual Studio 2012 and beyond.")
                )
            ),
        ),
        styleRef = HomeStylesheet.touchdev
    ),
    "magicalmusic" to ProjectData(
        description = "Magical Music",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Magical Music"),
                    ArticleSpan(" is a fun app for learning how to play your favorite songs on the piano or keyboard. The concept is similar to Guitar Hero, with notes falling from the top as the song progresses, giving you an overall grade on how well you hit the right notes.")
                )
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
                content = listOf(
                    ArticleSpan("The difference is that you learn the actual notes of the song, and can choose to play either on the virtual keyboard or with an accompanying real keyboard or piano.")
                )
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
                content = listOf(
                    ArticleSpan("The app was built to showcase the ease at which developers could build beautiful, yet powerful Windows 8 applications quickly and easily by combining native C++ with Windows 8 XAML. It was released as a sample at the //build 2011 conference.")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I designed and implemented the overall app experience in collaboration with other developers. It was a short project but a great learning experience overall because it was my first design project for Microsoft, my first time shipping and I got to learn a little bit of C++ (we used it to process the incoming sound from the real keyboard!).")
                )
            )
        ),
        styleRef = HomeStylesheet.magicalMusic
    ),
    "hololens" to ProjectData(
        description = "Microsoft Hololens",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Microsoft HoloLens"),
                    ArticleSpan(" is the first fully self-contained, holographic computer, enabling you to interact with high‑definition holograms in your world. I'm currently a designer on the product, shaping the future of mixed reality experiences on the Windows Holographic platform.")
                )
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
                content = listOf(
                    ArticleSpan("And that's all I can say about that ;)")
                ),
            ),
        ),
        styleRef = HomeStylesheet.hololens
    ),
    "islandwood" to ProjectData(
        description = "Windows Bridge for iOS",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("The "),
                    ArticleBold("Windows Bridge for iOS"),
                    ArticleSpan(" is a Microsoft open-source project that allows developers to take their existing iOS apps and bridge it over to the Universal Windows Platform, in order to quickly get started building apps for Windows 10 devices.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/islandwood/islandwood-prod-header.png",
                        caption = "Landing page on the Windows Dev Center"
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("Part of the initial process of bridging over your app is understanding how much of your iOS code is supported and how much of it you will have to rewrite or create workarounds. Potential developers can quickly get a report of how much work is entailed through the App Analysis tool.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/islandwood/analysis-prod.png",
                        caption = "App Analysis tool on the Windows Dev Center"
                    )
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("I was responsible for the design and workflow of the tool, as well as for the documentation pages that enumerated the level of support for existing iOS APIs.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/islandwood/results1.png",
                        caption = "Results visualization exploration A"
                    ),
                    ArticleImage(
                        src = "/img/islandwood/results2.png",
                        caption = "Results visualization exploration B"
                    ),
                    ArticleImage(
                        src = "/img/islandwood/results3.png",
                        caption = "Results visualization exploration C"
                    ),
                    ArticleImage(
                        src = "/img/islandwood/results4.png",
                        caption = "Results visualization exploration D"
                    ),
                    ArticleImage(
                        src = "/img/islandwood/results5.png",
                        caption = "Results visualization exploration E"
                    ),
                ),
                showAsCarousel = true
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/islandwood/docs.png",
                        caption = "Design exploration on API documentation pages"
                    )
                )
            ),
        ),
        styleRef = HomeStylesheet.islandwood
    ),
    "funsies" to ProjectData(
        description = "For Funsies",
        articleData = listOf(
            ArticleParagraph(
                content = listOf(
                    ArticleSpan("This is a collection of some things I've done on the side, either for fun, to learn, to grow or really all of the above. I always felt that it's mentally healthy to create things outside of the day-to-day work, just for the sake of curiosity and learning - I just wish I practiced what I preached more. ;)")
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Eat.Drink.SEA"),
                    ArticleSpan(" - a fun, little website my friend and I created to quickly give newcomers and veterans of Seattle on-the-go top 10 lists of places to visit for things like coffee and local flavor.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/funsies/eatdrinksea-iphone.png",
                        caption = "eatdrinkSEA on phone",
                        multiplier = 2
                    ),
                    ArticleImage(
                        src = "/img/funsies/eatdrinksea-ipad.png",
                        caption = "eatdrinkSEA on tablet",
                        multiplier = 2
                    ),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/funsies/eatdrinksea-illustrations.png",
                        caption = "Explorations on illustration style",
                        multiplier = 2
                    ),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Flannel Elephant"),
                    ArticleSpan(" - an idea my friend and I had for a small side business of creating hand-crafted, well-designed websites. I created our brand out of love for the typical Pacific Northwest flannel combining with a friendly elephant. Unfortunately, we didn't pursue the business further but it was fun nonetheless to dream a bit.")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/funsies/flannelelephant-website.png",
                        caption = "Home page explorations",
                        multiplier = 2
                    ),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/funsies/flannelelephant-illustrations.png",
                        caption = "Brand explorations",
                        multiplier = 2
                    ),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Pokeball 3D Model"),
                    ArticleSpan(" - I've always wanted to learn how to model 3D objects. I decided to start with something fun and small that I knew from memory - a Pokeball! I used Cinema 4D to build the model as I found it was easier to ramp up on than other 3D CAD programs.")
                )
            ),
            ArticleIframe(
                src = "https://sketchfab.com/models/54234da9bb094dfa93b76d640ec73878/embed",
                height = 480
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/funsies/pokeball-c4d.png",
                        caption = "Working the Pokeball in Cinema 4D",
                        multiplier = 2
                    ),
                )
            ),
            ArticleParagraph(
                content = listOf(
                    ArticleBold("Multi-color Icon Font"),
                    ArticleSpan(" - icon fonts are becoming commonplace on the web with the pervasiveness of high density displays. However, they are limited to a single color due to browser standards. For a hackathon, I decided to experiment with creating a multi-color icon font using the raw SVG files for each icon. The technique was inspired by the folks on "),
                    ArticleLink(url = "http://stackicons.com/", content = "Stackicons"),
                    ArticleSpan(". The code is available on "),
                    ArticleLink(url = "https://github.com/csinco/multicolor-icon-font", content = "GitHub"),
                    ArticleSpan(".")
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/funsies/multicolor-icon-breakdown.png",
                        caption = "Breakdown of different layers of each SVG icon",
                        multiplier = 2
                    ),
                )
            ),
            ArticleImages(
                images = listOf(
                    ArticleImage(
                        src = "/img/funsies/multicolor-icon-grid.png",
                        caption = "Collection of icons as a multicolor icon font",
                        multiplier = 2
                    ),
                )
            ),
        ),
        styleRef = HomeStylesheet.funsies
    ),
)

data class ArticleParagraph(
    val content: List<Any>,
)

data class ArticleSpan(
    val content: String,
)

data class ArticleBold(
    val content: String,
)

data class ArticleLink(
    val content: String,
    val url: String,
)

data class ArticleUnorderedList(
    val items: List<ArticleParagraph>,
)

data class ArticleImages(
    val images: List<ArticleImage>,
    val showAsCarousel: Boolean = false
)

data class ArticleImage(
    val src: String,
    val caption: String,
    val multiplier: Int = 1
)

data class ArticleVideo(
    val src: String,
    val caption: String
)

data class ArticleIframe(
    val src: String,
    val height: Int
)