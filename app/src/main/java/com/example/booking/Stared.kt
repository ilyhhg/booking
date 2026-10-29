package com.example.booking

import android.R.attr.text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun FirstBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding( horizontal = 10.dp)
        .padding(top = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically)
    {
        Column() {
            Text(text="Wallet",
                fontSize = 30.sp)
            Spacer(Modifier.height(10.dp))
            Row() {
            Text(text="Total Sum: ",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold)
                Text(text="90$",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold)

            }

        }
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = "Search"
                )

    }
}