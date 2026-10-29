package com.example.booking

import androidx.compose.ui.graphics.vector.ImageVector

data class  NavItem(
    var title: String,
    var icon: ImageVector
)


data class CardsExample(
    val name: String,
    val cardNumber: String,
    val crdName:String,
    val balance: String
)


data class Finance(
    val icon: ImageVector,
    val name: String
)