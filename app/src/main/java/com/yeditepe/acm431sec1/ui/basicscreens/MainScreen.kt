package com.yeditepe.acm431sec1.ui.basicscreens

import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeditepe.acm431sec1.ui.theme.ACm431Sec1Theme

@Composable
fun MyText(fontSize: Float=12f,
           isItalic: Boolean = false){
    Text(text= "Hello Kotlin",
        fontSize = fontSize.sp,
        modifier = Modifier.fillMaxWidth()
            .background(Color.Blue),
        fontFamily = FontFamily.Monospace,
        color = Color.White,
        textAlign = TextAlign.Center,
        fontStyle = if(isItalic) FontStyle.Normal else FontStyle.Italic

    )

    }
@Composable
fun MyFunnyScreen(){
    var userFontSize= remember{ mutableStateOf(12f)}
    var isChecked by remember {   mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        MyText(fontSize = userFontSize.value,
            isItalic = !isChecked)
        Slider(
            value = userFontSize.value,
            valueRange = 10f..36f,
            onValueChange = {userFontSize.value= it},
            modifier = Modifier.fillMaxWidth())
       Row(
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.spacedBy(8.dp)
       ) {
           Text(
               text ="Normal"
           )
           Switch(
               checked = isChecked,
               onCheckedChange = {isChecked=!isChecked

               }
           )
           Text(text= "Italic")
       }
    }

}



@Preview(showSystemUi = true)
@Composable
fun MyTextPreview(){
    ACm431Sec1Theme {
        Surface{
            MyFunnyScreen()

        }
    }
}