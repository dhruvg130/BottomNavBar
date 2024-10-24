package com.example.navBar

import androidx.compose.ui.graphics.vector.ImageVector

/*
    This class will represent each option in the nav bar.
    We will have a label and an icon.
    In this scenario, we are not providing starting values. Instead, each time we add a new NavItem
    to the NavBar, we will declare the label and icon
 */
data class NavItem(
    val label: String,
    val icon: ImageVector
)
