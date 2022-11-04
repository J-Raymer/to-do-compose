package com.example.to_docompose.data.models



import androidx.compose.ui.graphics.Color
import com.example.to_docompose.ui.theme.HighPriorityColor
import com.example.to_docompose.ui.theme.LowPriorityColor
import com.example.to_docompose.ui.theme.MedPriorityColor
import com.example.to_docompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MED(MedPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}