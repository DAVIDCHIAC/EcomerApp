package co.edu.unab.ecomer.ecomerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcomerAppTheme {
                val mynavController = rememberNavController()
                val mystarDestination = "Login"

                NavHost(navController = mynavController,
                    startDestination = mystarDestination,
                    modifier = Modifier.fillMaxSize()){
                    composable("login") {
                        LoginScreen(mynavController)
                    }
                    composable("register") {
                        RegistreScreen(mynavController)
                    }
                    composable ("home") {
                        HomeScreen(mynavController)
                    }

                }







            }
        }
    }

}

private fun MainActivity.EcomerAppTheme(function: @Composable () -> Unit) {}


