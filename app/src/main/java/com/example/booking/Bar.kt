package com.example.booking

import android.R.attr.contentDescription
import android.R.attr.onClick
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.ui.Modifier
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import android.R.attr.tint
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlinx.coroutines.selects.select

val  items= listOf(
    NavItem(
        title ="Home",
        icon = Icons.Rounded.Home
    ),
    NavItem(
        title ="Wallet",
        icon = Icons.Rounded.Wallet
    ),
    NavItem(
        title ="Notifications",
        icon = Icons.Rounded.Notifications
    ),
    NavItem(
        title ="Account",
        icon = Icons.Rounded.AccountCircle
    )
)

@Preview
@Composable
fun BottonBar(selected: Int, onSelect:(Int)-> (Unit)) {
    var selct by remember { mutableIntStateOf(0) }
    NavigationBar {
        Row() {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = selct== index ,
                    onClick = { selct= index },
                    icon = {
                        Icon(
                            imageVector= item.icon,
                            contentDescription = item.title
                        )
                    }
                )
            }
        }
    }
}
