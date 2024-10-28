package com.yeditepe.acm431sec1.ui.basicscreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.yeditepe.acm431sec1.ui.theme.ACm431Sec1Theme


@Composable
fun Signup(){
      var username by remember { mutableStateOf("") }
      var email by remember { mutableStateOf("abc@yeditepe.com") }
      var password by remember { mutableStateOf("") }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       TextField(
           value= username,
           onValueChange = {username = it},
           label ={ Text(text="Username")},
           leadingIcon = {Icon(Icons.Default.Face,
              contentDescription = "" )
           }
       )

        OutlinedTextField(
            value =email,
            onValueChange = {email = it },
            label ={ Text( text ="email")},
            leadingIcon ={ Icon(Icons.Default.Email, contentDescription = "") }
        )

        OutlinedTextField(
            value = password,
            onValueChange = {password = it },
            label ={ Text( text ="password")},
            leadingIcon ={ Icon(Icons.Default.Done,
                contentDescription = "") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password)
        )
            Button(onClick = {}) {
                Row {
                    Icon(Icons.Default.Add,
                        contentDescription = "")
                    Text(
                        text ="Sig Up"
                    )
                }
            }
    }
}


@Preview(showSystemUi = true)
@Composable
fun SigupPreview(){

    ACm431Sec1Theme {
        Surface{
            Signup()
        }
    }
}