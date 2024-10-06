package com.example.calories.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth

@Composable
fun Heading(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.h4,
        color = MaterialTheme.colors.primary,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}
