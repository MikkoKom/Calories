package com.example.calories.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp

@Composable
fun IntensityList(intensity: Int, onIntensityChange: (Int) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    val intensities = listOf("Low", "Medium", "High")

    Box {
        OutlinedTextField(
            value = intensities[intensity],
            onValueChange = {},
            readOnly = true,
            label = { Text(text = "Activity Level") },
            trailingIcon = {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = if (expanded) Icons.Filled.ArrowDropUp else Icons.Filled.ArrowDropDown,
                        contentDescription = null
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            intensities.forEachIndexed { index, label ->
                DropdownMenuItem(onClick = {
                    onIntensityChange(index)
                    expanded = false
                }) {
                    Text(text = label)
                }
            }
        }
    }
}
