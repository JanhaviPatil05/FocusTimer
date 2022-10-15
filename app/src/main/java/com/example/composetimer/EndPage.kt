package com.example.composetimer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EndWithText() {
    Column {
        Text(
            text = "Time's Up!",
            fontSize =  37.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            //color=Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 20.dp, top = 300.dp, end = 20.dp)
        )

    }

}


@Composable
fun EndWithImage() {
    val image = painterResource(R.drawable.background)
    Box {
        Image(
            painter = image,
            contentDescription = "EndWithImage",
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        EndWithText()
    }
}
@Composable
fun EndButtonN(onNextButtonClicked: () -> Unit = {},
               ExitButton: () -> Unit = {},
                 modifier: Modifier = Modifier ){
    EndWithImage()

    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 600.dp, start = 10.dp, end = 10.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ){
        Button(

            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = modifier
                .fillMaxWidth()
                .height(50.dp)
                .weight(5f)
                .padding(start = 10.dp,top=0.dp,end=10.dp),

            onClick = onNextButtonClicked

        ) {

            Text(text = "Restart",fontSize =  20.sp,color= Color.White)

        }
        Button(

            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = modifier
                .fillMaxWidth()
                .height(50.dp)
                .weight(5f)
                .padding(start = 10.dp,top=0.dp,end=10.dp),

            onClick = ExitButton

        ) {

            Text(text = "Exit",fontSize =  20.sp,color= Color.White)

        }


    }
}

