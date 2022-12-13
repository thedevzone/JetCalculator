package com.jetcalculator.app.ui.screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetcalculator.app.ui.theme.TextColor

@Composable
fun DisplayBox(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        style = TextStyle(
            color = TextColor,
            textAlign = TextAlign.Right,
            fontSize = 56.sp,
            fontWeight = FontWeight.Bold
        )
    )
}