package com.walter.digivice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.walter.digimon_details.presentation.DigimonDetailsScreen
import com.walter.digivice.digimons.presentation.DigimonsListScreen
import com.walter.digivice.navigation.Destinations
import com.walter.digivice.ui.theme.DigiviceTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Destinations.home) {
                composable(Destinations.home) { Home(navController) }
                composable(Destinations.digimonDetails) { DigimonDetailsScreen() }
            }
        }
    }
}

@Composable
fun Home(navController: NavController) {
    DigiviceTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            DigimonsListScreen(navController = navController)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DigiviceTheme {
        Greeting("Android")
    }
}