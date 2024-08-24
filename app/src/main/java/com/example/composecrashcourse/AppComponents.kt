package com.example.composecrashcourse

import android.graphics.Paint.Align
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloWorldPreviewInMobileScreen(name: String = "User"){
    HelloWorld(name = name)
}

@Composable
fun TextComponent(value: String,
                  size: TextUnit = 18.sp,
                  colorVal: Color = Color.Magenta,
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
//            .border(width = 2.dp, color = colorVal, shape = RoundedCornerShape(20.dp))
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

@Composable
fun SimpleButton(){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(68.dp),
        onClick = {
            Log.d("SimpleButton", "Button clicked!")
                  },
        shape = RoundedCornerShape(12.dp)
        ) {
        NormalText(value = "Click here")
    }
}

@Preview
@Composable
fun SimpleButtonPreview(){
    SimpleButton()
}

@Composable
fun NormalText(value: String, alignment: TextAlign = TextAlign.Center){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        text = value,
        textAlign = alignment,
        fontSize = 16.sp
    )
}

@Composable
fun TextFieldComponent(){
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = { newText ->
        text = newText
        },
        textStyle = TextStyle (
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        ),
        label = {
            NormalText(value = "Your Name", TextAlign.Start)
        },
        placeholder = {
            NormalText(value = "Please Enter Your Name.", TextAlign.Start)
        },
        //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Preview
@Composable
fun TextFieldComponentPreview(){
    TextFieldComponent()
}

@Composable
fun ImageComponent(){
    Image(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Black),
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Basic Icon BG",
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ImageComponentSnapshot(){
    Image(
        modifier = Modifier
            .size(308.dp)
            .clip(CircleShape),
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Icon BG",
        contentScale = ContentScale.Crop
    )
}

@Preview()
@Composable
fun ImageComponentPreview(){
    ImageComponent()
}

@Preview(showSystemUi = true)
@Composable
fun ImageComponentSnapshotPreview(){
    ImageComponentSnapshot()
}