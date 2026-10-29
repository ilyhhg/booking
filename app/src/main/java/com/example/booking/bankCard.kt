package com.example.booking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardsBank(
    cardName: String,
    Balance: String,
    CardNumber: String
){
    Column(
        modifier = Modifier
            .width(170.dp)
            .height(130.dp)
            .background(color= Color.Gray,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(15.dp)

    ) {
        Text(text= cardName,
            fontSize = 20.sp)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center

        ) {
            Row() {

            Text(
                text = Balance,
                fontSize = 30.sp
            )
            Text(text = "$",
                fontSize = 30.sp)
            }
        }
        Text(text= CardNumber)
    }
}

@Preview
@Composable
fun CardsBankPreview(){
    CardsBank(
        cardName = "Visa",
        Balance =  "15",
        CardNumber = "1234 5678 9012 3456"
    )
}

