import androidx.compose.web.css.*
import androidx.compose.web.css.selectors.type
import org.w3c.dom.Screen

object CommonStylesheet : StyleSheet() {
    init {
        "body" style {
            backgroundColor(Color("#f1f1ee"))
            color(Color("#444"))
            fontFamilyUtil("'Roboto Slab', serif")
        }

        "h1, h2, h3, h4, h5" style {
            fontFamilyUtil("'Josefin Sans', sans-serif")
        }

        "h2" style {
            color(Color("#2682A1"))
            fontSize(2.rem)
        }

        media(minWidth(40.em)) {
            "h2" style {
                fontSize(2.5.rem)
            }
        }
    }
}