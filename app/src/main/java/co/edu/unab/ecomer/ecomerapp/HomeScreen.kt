package co.edu.unab.ecomer.ecomerapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import co.edu.unab.ecomer.ecomerapp.ui.theme.EcomerAppTheme

@Composable
fun HomeScreen(){
    Scaffold { innerPaddingg ->
        Column (modifier = Modifier.padding(innerPaddingg)){

            Text(
                "Home Screen",
                fontSize = 50.sp


            )
        }
    }

}


@Preview
@Composable
fun HomeScreenPreview(){
    EcomerAppTheme {
        HomeScreen()
    }
}