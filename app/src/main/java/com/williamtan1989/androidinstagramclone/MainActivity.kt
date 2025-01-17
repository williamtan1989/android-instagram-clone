package com.williamtan1989.androidinstagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.williamtan1989.androidinstagramclone.home.AuthorizationHomeScreen
import com.williamtan1989.androidinstagramclone.home.login.LoginScreen
import com.williamtan1989.androidinstagramclone.theme.SnapventTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController()

            SnapventTheme {
                NavHost(
                    navController = navController,
                    startDestination = Screen.AuthorizationHome
                ) {
                    composable<Screen.AuthorizationHome> {
                        AuthorizationHomeScreen(
                            onNavigateToLogin = {
                                navController.navigate(Screen.Login)
                            },
                        )
                    }

                    composable<Screen.Login> {
                        LoginScreen(
                            onNavigateBack = {
                                navController.popBackStack()
                            },
                        )
                    }
                }
            }
        }
    }
}

sealed class Screen {
    @Serializable
    data object AuthorizationHome : Screen()

    @Serializable
    data object Login : Screen()
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SnapventTheme {
        Greeting("Android")
    }
}