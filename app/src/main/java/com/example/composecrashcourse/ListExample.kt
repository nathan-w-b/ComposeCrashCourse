package com.example.composecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListExample(){

    val someValues = listOf(
        "Tiny Bear", "Sweet Kitty", "Mini Puppies", "Bunny Plush", "Cupcake Pillow", "Sunflower Plush", "Heart Balloon", "Cloud Pillow", "Panda Keychain", "Duckling Toy",
        "Tiny Bear", "Sweet Kitty", "Mini Puppies", "Bunny Plush", "Cupcake Pillow", "Sunflower Plush", "Heart Balloon", "Cloud Pillow", "Panda Keychain", "Duckling Toy",
        "Tiny Bear", "Sweet Kitty", "Mini Puppies", "Bunny Plush", "Cupcake Pillow", "Sunflower Plush", "Heart Balloon", "Cloud Pillow", "Panda Keychain", "Duckling Toy"
    )
    LazyColumn{
        items(someValues) { item: String ->
            TextComponent(value = item)
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.Black))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ListExamplePreview(){
    ListExample()
}