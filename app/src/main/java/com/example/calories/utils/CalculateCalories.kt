package com.example.calories.utils

fun calculateCalories(weight: Double, intensity: Int, isMale: Boolean): Double {
    val baseRate = if (isMale) 10 else 8
    val intensityMultiplier = when (intensity) {
        0 -> 1.2
        1 -> 1.5
        2 -> 1.8
        else -> 1.0
    }
    return weight * baseRate * intensityMultiplier
}
