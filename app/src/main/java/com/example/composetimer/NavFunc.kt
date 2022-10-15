package com.example.composetimer

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlin.system.exitProcess

enum class NavFunc(){
    Start,
    Study,
    Break,
    Last
}

    @Composable
    fun TimerApp(modifier: Modifier = Modifier,
                 navController: NavController = rememberNavController(),
                 startDestination: String = NavFunc.Start.name){

            NavHost(
                modifier= modifier,
          navController = navController as NavHostController,
          startDestination = NavFunc.Start.name

            ){
                composable(route = NavFunc.Start.name){
                    val context = LocalContext.current
                    IntroButtonN(

                        onNextButtonClicked = {
                            navController.navigate(NavFunc.Study.name)
                        }
                    )

                }
                composable(route = NavFunc.Study.name){
                    val context = LocalContext.current
                    StudyTime(
                       // totalTime = 45L * 60L * 1000L,
                        handleColor = Color.Green,
                        inactiveBarColor = Color.DarkGray,
                        activeBarColor = Color(0xFF37B900),
                        onNextButtonClicked ={
                          navController.navigate(NavFunc.Break.name)
                        },
                        modifier = Modifier.size(400.dp)
                    )

                }

                composable(route = NavFunc.Break.name){
                    val context = LocalContext.current
                    BreakTime(
                        totalTime = 15L * 60L * 1000L,
                        handleColor = Color.Green,
                        inactiveBarColor = Color.DarkGray,
                        activeBarColor = Color(0xFF37B900),
                        onNextButtonClicked ={
                                    //exitProcess(0)
                            navController.navigate(NavFunc.Last.name)
                        },
                        modifier = Modifier.size(400.dp)
                    )
                }
                composable(route = NavFunc.Last.name){
                    val context = LocalContext.current
                    EndButtonN(

                        onNextButtonClicked = {
                            navController.navigate(NavFunc.Start.name)
                        },
                                ExitButton ={
                            exitProcess(0)

                        }
                    )

                }
            }


    }
