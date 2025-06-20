package com.example.mywishlistapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.mywishlistapp.R

@Composable
fun AppBarView(
    paddingValues: PaddingValues,
    title: String,
    onBackNavClicked: () -> Unit = {}
) {
    val navigationIcon: (@Composable () -> Unit)? = if (title.contains("WishList")) {
        null
    } else {
        {
            IconButton(onClick = { onBackNavClicked() }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    tint = Color.White,
                    contentDescription = null
                )
            }
        }
    }

    TopAppBar(
        title = {
            Text(
                text = title,
                color = colorResource(R.color.white)
            )
        },
        backgroundColor = colorResource(R.color.my_color_app_bar),
        modifier = Modifier
            .padding(paddingValues)
            .heightIn(max = 56.dp),
        elevation = 3.dp,
        navigationIcon = navigationIcon
    )
}
