package com.example.booking

import CardsSection
import android.util.Log
import android.widget.MediaController
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.material3.Scaffold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import h
import kotlin.collections.emptyList

@Composable
fun HomeScreen(navController: NavHostController){
        var selected by remember { mutableIntStateOf(0) }
    Scaffold(
        topBar = {
            FirstBar()
        },
        bottomBar ={
            BottonBar(selected, onSelect= {selected=it})
        } ){ padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),

        ) {
            when(selected){
                0->{
            iconsFun()
            Spacer( modifier = Modifier.height(16.dp))
            CardsSection()

            FinanceSection()
            CurrenciesSection()
            Button(onClick = {
                navController.navigate("scnd")

            }) { Text(text="PUSH") }
            }

             1->second(navController=navController)
                }
            }

        }
    }

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() = HomeScreen(rememberNavController())