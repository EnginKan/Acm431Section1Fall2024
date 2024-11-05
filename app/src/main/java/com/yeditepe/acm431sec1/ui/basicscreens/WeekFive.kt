package com.yeditepe.acm431sec1.ui.basicscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yeditepe.acm431sec1.R
import com.yeditepe.acm431sec1.ui.theme.ACm431Sec1Theme
var list = mutableListOf(
    1,2,3,4,5,6
)

    @OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyMainScreen(){

    Scaffold(
        topBar = {
            TopAppBar(
                title ={ Text(text ="Top App Bar")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(Icons.Default.Menu,
                            contentDescription = ""
                            )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary)
                ,
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Search,
                            contentDescription = "Search Friends")
                                            }
                    IconButton(onClick ={}){
                        Icon(Icons.Default.MoreVert,
                            contentDescription = "Options")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar (
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Home, contentDescription = "Home Page")
                                            }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Favorite, contentDescription = "Facourites")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Face, contentDescription = "Profile")
                    }
                 }

            )
        },
        content = {
            paddingValues ->

            LazyColumn(modifier = Modifier.padding(paddingValues)
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                    items(list){item->
                    AppPost(modifier = Modifier.fillMaxWidth())

                          }

                }
        }
    )

}



@Composable
fun AppPost(modifier: Modifier){

    Card (
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier.size(width = 200.dp, height = 300.dp)

    ){
        Row (modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(R.drawable.ata),
                contentDescription = "",
                modifier = Modifier.size(15.dp)
                    .clip(CircleShape))
            Text(text = "user")
        }
        Image(
            painter = painterResource(R.drawable.ata),
                modifier = Modifier.size(width = 100.dp, height = 120.dp),
            contentDescription = "Description of Figure"
        )
        Row {
            IconButton(onClick = {}) {
                Icon(painter = painterResource(R.drawable.outline_favorite_border_24),
                    contentDescription = "")
            }
            IconButton(onClick = {}) {
                Icon(painter = painterResource(R.drawable.outline_mode_comment_24),
                    contentDescription = "")
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MyMainScreenPreview(){
    ACm431Sec1Theme {
        Surface {
            MyMainScreen()
        }
    }
}




