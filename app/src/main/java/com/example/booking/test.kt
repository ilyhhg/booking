package com.example.booking

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.SemanticsModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.serialization.Serializable
import org.w3c.dom.Text


@Serializable
object HomeRoute
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun test(){
    Text(text= "Hi",
        modifier = Modifier.padding(50.dp))
}
