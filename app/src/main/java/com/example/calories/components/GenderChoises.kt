package com.example.calories.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GenderChoices(isMale: Boolean, onGenderChange: (Boolean) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = isMale,
            onClick = { onGenderChange(true) }
        )
        Text(text = "Male")
        Spacer(modifier = Modifier.width(16.dp))
        RadioButton(
            selected = !isMale,
            onClick = { onGenderChange(false) }
        )
        Text(text = "Female")
    }
}
