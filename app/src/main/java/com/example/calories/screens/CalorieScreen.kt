package com.example.calories.screens

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import com.example.calories.components.*
import com.example.calories.utils.calculateCalories
import com.example.calories.R

@Composable
fun CalorieScreen() {
    var weight by remember { mutableStateOf("") }
    var isMale by remember { mutableStateOf(true) }
    var intensity by remember { mutableStateOf(1) }
    var result by remember { mutableStateOf(0.0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Heading(title = stringResource(id = R.string.calories))

        WeightField(weight = weight, onWeightChange = { weight = it })

        GenderChoices(isMale = isMale, onGenderChange = { isMale = it })

        IntensityList(intensity = intensity, onIntensityChange = { intensity = it })

        Button(
            onClick = {
                result = calculateCalories(weight.toDoubleOrNull() ?: 0.0, intensity, isMale)
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = stringResource(id = R.string.calculate))
        }

        Text(
            text = stringResource(id = R.string.calorie_result, result),
            style = MaterialTheme.typography.h6,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}
