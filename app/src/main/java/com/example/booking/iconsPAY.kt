package com.example.booking

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AdUnits
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ArrowRightAlt
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material.icons.rounded.Waves
import androidx.compose.runtime.Composable
import androidx.compose.material3.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun iconsFun(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        Arrangement.SpaceEvenly
    ) {
        Icon(
            imageVector = Icons.Rounded.Add,
            contentDescription = "Add",
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .background(color = Color.Gray)
                .clickable(onClick = {})
                .size(50.dp)
        )
        Icon(
            imageVector = Icons.Rounded.AdUnits,
            contentDescription = "kk",
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .background(color = Color.Gray)
                .clickable(onClick = {})
                .size(50.dp)
        )
        Icon(
            imageVector = Icons.Rounded.Wallet,
            contentDescription = "kk",
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .background(color = Color.Gray)
                .clickable(onClick = {})
                .size(50.dp)
        )
        Icon(
            imageVector = Icons.Rounded.ArrowRightAlt,
            contentDescription = "kk",
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .background(color = Color.Gray)
                .clickable(onClick = {})
                .size(50.dp)
        )
    }
}