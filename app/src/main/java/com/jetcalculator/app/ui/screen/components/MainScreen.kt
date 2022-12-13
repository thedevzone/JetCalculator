package com.jetcalculator.app.ui.screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jetcalculator.app.ui.theme.BgColor
import com.jetcalculator.app.ui.viewmodel.CalculatorViewModel

@Composable
fun MainScreen(modifier: Modifier) {
    val viewModel = CalculatorViewModel()
    var textValue by remember { mutableStateOf("0") }

    val scrollState = rememberScrollState(0)

    LaunchedEffect(textValue) {
        scrollState.scrollTo(scrollState.maxValue)
    }

    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(BgColor)
                .verticalScroll(scrollState)
                .weight(1f)
                .padding(8.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            DisplayBox(value = textValue)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(BgColor)
                .padding(8.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            BottomButtons { textValue = viewModel.calculateAnswer(textValue,it) }
        }
    }
}