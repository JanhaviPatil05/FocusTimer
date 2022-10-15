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
fun IntroductionWithText() {


    Column {
        Text(
            text = "WELCOME TO FOCUS TIMER!",
            fontSize =  37.sp,
            fontWeight =FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 20.dp, top = 60.dp, end = 20.dp)
        )
        Text(
            text = "\nRules :"+"\n\n1. The Study Timer will go on for 45 minutes." +
                    "\n2. On completion of the total time , the Break Timer will go on for 15 minutes." +
                    "\n3. Do not switch between other tabs.",
            fontSize =  30.sp,
            fontWeight =FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            text = "HAPPY STUDYING!",
            fontSize =  35.sp,
            fontWeight =FontWeight.Bold,
            color=Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 20.dp, top = 40.dp, end = 20.dp)
        )

    }

}


@Composable
fun IntroductionWithImage() {
    val image = painterResource(R.drawable.background)
    Box {
        Image(
            painter = image,
            contentDescription = "IntroductionWithImage",
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        IntroductionWithText()
    }
}
@Composable
fun IntroButtonN(onNextButtonClicked: () -> Unit = {},
            modifier: Modifier = Modifier ){
    IntroductionWithImage()

    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 670.dp, start = 140.dp, end = 150.dp),
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

            Text(text = "Start",fontSize =  20.sp,color=Color.White)

        }


    }
}




