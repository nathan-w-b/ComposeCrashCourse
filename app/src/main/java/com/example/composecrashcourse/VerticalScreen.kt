package com.example.composecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VerticalScreen(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(18.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextComponent(
            value = "Hello there!",
            colorVal = Color.Black,
            size = 24.sp,
            fontWeightVal = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent()
        Spacer(modifier = Modifier.height(40.dp))
        SimpleButton()
        Spacer(modifier = Modifier.height(40.dp))
        ImageComponentSnapshot()
    }
}

@Preview(showSystemUi = true)
@Composable
fun VerticalScreenPreview(){
    VerticalScreen()
}