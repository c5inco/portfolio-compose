import androidx.compose.web.css.CSSBuilder
import androidx.compose.web.css.StyleSheet

data class ProjectData(
    val name: String,
    val description: String,
    val styleRef: String,
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
        "magicalmusic",
        "Magical Music",
        HomeStylesheet.magicalMusic
    ),
    ProjectData(
        "hololens",
        "Hololens",
        HomeStylesheet.hololens
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