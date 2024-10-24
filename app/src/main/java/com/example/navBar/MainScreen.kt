package com.example.navBar

import android.provider.ContactsContract.Profile
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navBar.ui.screens.CallScreen
import com.example.navBar.ui.screens.EmailScreen
import com.example.navBar.ui.screens.HomeScreen
import com.example.navBar.ui.screens.SettingScreen

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

    var selectedIndex by remember { mutableStateOf(0)}

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed{index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
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
        ContentScreen(selectedIndex, modifier =  Modifier.padding(innerPadding))
    }
}

@Composable
fun ContentScreen(selectedIndex: Int,modifier: Modifier = Modifier){
    when(selectedIndex){
        0-> HomeScreen()
        1-> CallScreen()
        2-> EmailScreen()
        3-> SettingScreen()
    }
}