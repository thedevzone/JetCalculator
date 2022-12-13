package com.jetcalculator.app.ui.screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jetcalculator.app.ui.theme.*

@Composable
fun BottomButtons(onButtonClick: (String) -> Unit) {
    Column {
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CustomButton(
                text = "AC",
                color = GreyColor,
                textColor = TextColor2,
                false,
                onButtonClick
            )
            CustomButton(
                text = "+/-",
                color = GreyColor,
                textColor = TextColor2,
                false,
                onButtonClick
            )
            CustomButton(
                text = "C",
                color = GreyColor,
                textColor = TextColor2,
                false,
                onButtonClick
            )
            CustomButton(
                text = "/",
                color = YellowColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CustomButton(
                text = "7",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "8",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "9",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "X",
                color = YellowColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CustomButton(
                text = "4",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "5",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "6",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "-",
                color = YellowColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CustomButton(
                text = "1",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "2",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "3",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "+",
                color = YellowColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CustomButton(
                text = "00",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "0",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = ".",
                color = BrownColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
            CustomButton(
                text = "=",
                color = YellowColor,
                textColor = TextColor,
                onClick = onButtonClick
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}