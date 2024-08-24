package com.example.composecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalListExample(){

    val someValues = listOf(
        "Tiny Bear", "Sweet Kitty", "Mini Puppies", "Bunny Plush", "Cupcake Pillow",
        "Sunflower Plush", "Heart Balloon", "Cloud Pillow", "Panda Keychain", "Duckling Toy",
        "Tiny Bear", "Sweet Kitty", "Mini Puppies", "Bunny Plush", "Cupcake Pillow",
        "Sunflower Plush", "Heart Balloon", "Cloud Pillow", "Panda Keychain", "Duckling Toy",
        "Tiny Bear", "Sweet Kitty", "Mini Puppies", "Bunny Plush", "Cupcake Pillow",
        "Sunflower Plush", "Heart Balloon", "Cloud Pillow", "Panda Keychain", "Duckling Toy"
    )
    LazyRow{
        items(someValues) {
            Row(
                modifier = Modifier.height(60.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                TextComponent(value = it)
                Spacer(modifier = Modifier
                    .width(1.dp)
                    .height(40.dp)
                    .background(Color.Blue))
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HorizontalListExamplePreview(){
    HorizontalListExample()
}