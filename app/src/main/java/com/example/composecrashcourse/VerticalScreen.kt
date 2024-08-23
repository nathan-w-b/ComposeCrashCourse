package com.example.composecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VerticalScreen(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(18.dp)
    ){
        TextComponent(value = "Text 1")
        TextComponent(value = "Text 2")
        TextComponent(value = "Text 3")
        TextComponent(value = "Text 4")
        SimpleButton()
    }
}

@Preview
@Composable
fun VerticalScreenPreview(){
    VerticalScreen()
}