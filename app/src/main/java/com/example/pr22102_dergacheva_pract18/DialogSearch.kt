package com.example.pr22102_dergacheva_pract18

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun DialogSearch(dialogState: MutableState<Boolean>, onSearch: (String) -> Unit) {
    var cityName by remember { mutableStateOf(TextFieldValue()) }

    AlertDialog(
        onDismissRequest = {
            dialogState.value = false
        },
        title = { Text("Введите название города") },
        text = {
            Column {
                TextField(
                    value = cityName,
                    onValueChange = { cityName = it },
                    placeholder = { Text("Город") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            Button(onClick = {
                onSearch(cityName.text)
                dialogState.value = false
            }) {
                Text("Поиск")
            }
        },
        dismissButton = {
            Button(onClick = { dialogState.value = false }) {
                Text("Отмена")
            }
        }
    )
}