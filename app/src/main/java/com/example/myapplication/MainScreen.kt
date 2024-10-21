package com.example.myapplication

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen (modifier: Modifier = Modifier) {

    /*
    Create a list of NavItems object to represent each item in our nav bar.
    Wew ill use this list to programmatically to fill the nav bar
     */

    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Call", Icons.Default.Call),
        NavItem("Email", Icons.Default.Email),
        NavItem("Settings", Icons.Default.Settings)


    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed{index, navItem ->
                    NavigationBarItem(
                        selected = true,
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(
                                imageVector = navItem.icon,
                                contentDescription = null)
                        },
                        label = {
                            Text(
                                text = navItem.label
                            )
                        }
                    )
                }
            }
        }
    ) {// adding the content for what wil be in the
        //middle of our Scaffold
        innerPadding ->
        ContentScreen(modifier =  Modifier.padding(innerPadding))
    }
}
@Composable
fun ContentScreen(modifier: Modifier = Modifier){

}