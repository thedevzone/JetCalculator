package com.jetcalculator.app.ui.screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(
    text: String,
    color: Color,
    textColor: Color,
    isBold: Boolean = true,
    onClick: (String) -> Unit,
) {
    Box(
        modifier = Modifier
            .background(color, shape = CircleShape)
            .width(76.dp)
            .height(76.dp)
            .clickable { onClick.invoke(text) }, contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = TextStyle(
                color = textColor,
                fontSize = 35.sp,
                fontWeight = if (isBold) FontWeight.Bold else FontWeight.Normal
            )
        )
    }
}