package com.example.booking

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun second(navController: NavHostController) {
    Column() {

    Row(
        modifier = Modifier.padding(vertical = 20.dp, horizontal = 15.dp)
            .fillMaxWidth(),
        Arrangement.SpaceEvenly
    ) {

        CardsBank(
            cardName = "VISA",
            Balance = "2500",
            CardNumber = "3982 2093 1934 8374"
        )
        CardsBank(
            cardName = "VISA",
            Balance = "1500",
            CardNumber = "1234 5678 9012 3456"
        )
    }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
            navController.navigate("home")

        }) { Text(text="PUSH") }
    }
}

@Preview
@Composable
fun secondPreview(){
    second(rememberNavController())
}