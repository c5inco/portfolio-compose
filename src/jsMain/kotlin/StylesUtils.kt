import androidx.compose.web.css.CSSBuilder
import androidx.compose.web.css.CSSStyleRuleBuilder
import androidx.compose.web.css.value

fun CSSBuilder.fontFamilyUtil(value: String) {
    property("font-family", value(value))
}

fun CSSStyleRuleBuilder.fontFamilyUtil(value: String) {
    property("font-family", value(value))
}