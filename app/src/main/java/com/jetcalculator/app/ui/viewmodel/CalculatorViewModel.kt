package com.jetcalculator.app.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.jetcalculator.app.utils.Equation
import kotlin.math.ceil
import kotlin.math.floor

class CalculatorViewModel : ViewModel() {

    fun calculateAnswer(previousValue: String, input: String): String {
        var answer = previousValue
        when (input) {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "00", ".", "+", "-", "/", "X" -> {
                if (input == "0")
                    answer = if (input == "00") "0" else input
                else
                    if (previousValue == "0") answer = input else answer += input
            }
            "+/-" -> {
                answer = if (input.startsWith("-"))
                    previousValue.removePrefix("-")
                else
                    "-".plus(input)
            }
            "C" -> {
                if (previousValue != "0") {
                    answer = if (previousValue.length == 1)
                        "0"
                    else
                        previousValue.dropLast(1)
                }
            }
            "AC" -> answer = "0"
            "=" -> {
                try {
                    val equationAnswer = Equation.eval(previousValue)
                    Log.e("TAG", "answer: $equationAnswer")
                    answer = if (ceil(equationAnswer) == floor(equationAnswer))
                        equationAnswer.toInt().toString()
                    else
                        String.format("%.4f", equationAnswer)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else -> {}
        }

        return answer
    }
}