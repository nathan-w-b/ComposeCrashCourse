package com.example.composecrashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecrashcourse.ui.theme.ComposeCrashCourseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld("Nathan W B")
        }
    }
}

@Composable
fun HelloWorld(name: String){
    TextComponent(
        value = "Hello $name!".repeat(1),
        size = 24.sp,
        colorVal = Color.Magenta,
        maxLinesVal = 4
    )
}

//@Preview(showBackground = true)
@Composable
fun HelloWorldPreviewForComponent(name: String = "User"){
    HelloWorld(name = name)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloWorldPreviewInMobileScreen(name: String = "User"){
    HelloWorld(name = name)
}

@Composable
fun TextComponent(value: String,
                  size: TextUnit,
                  colorVal: Color = Color.Black,
                  fontWeightVal: FontWeight = FontWeight.Normal,
                  fontStyleVal: FontStyle = FontStyle.Normal,
                  maxLinesVal: Int? = null,
                  backgroundColor: Color = Color.White){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(backgroundColor)
            .border(width = 2.dp, color = colorVal, shape = RoundedCornerShape(20.dp))
            .padding(18.dp),
        text = value,
        fontSize = size,
        color = colorVal,
        fontWeight = fontWeightVal,
        fontStyle = fontStyleVal,
        maxLines = maxLinesVal?:Int.MAX_VALUE,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview
@Composable
fun TextComponentPreview(){
    TextComponent(
        value = "Hello *Unknown*!",
        size = 16.sp
    )
}