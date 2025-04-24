package co.edu.unab.ecomer.ecomerapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.ecomer.ecomerapp.ui.theme.EcomerAppTheme
import coil3.compose.rememberAsyncImagePainter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold (
        topBar = {
            val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        "Bienvenido",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.ExitToApp,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
    ) { innerPaddingg ->
        Column (modifier = Modifier.padding(innerPaddingg)){
            Text("promociones", modifier = Modifier.padding(
                top = 16.dp,
                start = 16.dp,
                bottom = 8.dp

            ))
            val listUrl= listOf(
                "https://img.freepik.com/vector-premium/promocion-banner-super-venta_131000-345.jpg",
                "https://static.vecteezy.com/system/resources/previews/004/672/772/non_2x/flash-sale-banner-design-template-offer-shopping-on-dark-blue-background-free-vector.jpg",
                "https://static.vecteezy.com/system/resources/previews/002/038/670/non_2x/super-sale-discount-banner-template-promotion-vector.jpg",
                "https://static.vecteezy.com/system/resources/previews/005/513/456/non_2x/big-sale-banner-promotion-abstract-background-yellow-blue-color-design-vector.jpg",
                "https://static.vecteezy.com/system/resources/previews/002/453/533/non_2x/big-sale-discount-banner-template-promotion-illustration-free-vector.jpg",
            )

            LazyRow (horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp),

            ){
                for ( url in listUrl){
                    item { cardPromo(url) }
                }





            }


        }
    }

}

@Composable
fun cardPromo(url:String){
    Card(
        modifier = Modifier.height(180.dp).width(300.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(url),
            contentDescription = "promociones",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }

}


@Preview
@Composable
fun HomeScreenPreview(){
    EcomerAppTheme {
        HomeScreen()
    }
}