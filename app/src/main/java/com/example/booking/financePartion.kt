package com.example.booking

import android.R.attr.contentDescription
import android.util.Log.i
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val financeList= listOf(
    Finance(
        icon =Icons.Rounded.StarHalf,
        name= "My Buisness"
    ),
       Finance(
        icon =Icons.Rounded.Wallet,
        name= "My Wallet"
    ),
       Finance(
        icon =Icons.Rounded.StarHalf,
        name= "Finance"
    ),
       Finance(
        icon =Icons.Rounded.MonetizationOn,
        name= "Transactions"
    ),

)


@Preview(showBackground = true)
@Composable
fun FinanceSection(){
    Column() {
        Text(
            text = "Finance",
            fontSize = 26.sp,
            modifier = Modifier.padding(16.dp)
        )

        LazyRow() {
            items(financeList.size){
                financeItem(it)
            }
        }
    }
}

@Composable
fun financeItem(index: Int){
    val finance=financeList[index]
    var lastPaddingEnd=0.dp
    if(index== financeList.size-1){
        lastPaddingEnd=16.dp
    }
    Box(
        modifier = Modifier.padding(start = 16.dp, end = lastPaddingEnd)
    )
    {
    Column(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Gray)
        .padding(13.dp)
        .size(130.dp)
        .clickable{},
        verticalArrangement = Arrangement.SpaceBetween
    )
    {
        Image(imageVector = finance.icon,
            contentDescription = finance.name
        )
        Text(text = finance.name,
            fontSize = 15.sp,
            modifier = Modifier.padding(vertical = 15.dp)
        )
    }
}
}