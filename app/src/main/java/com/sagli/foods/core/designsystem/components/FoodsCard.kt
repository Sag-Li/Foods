package com.sagli.foods.core.designsystem.components

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

import com.sagli.foods.core.designsystem.theme.CardColor

@Composable

fun FoodsCard(

    modifier: Modifier = Modifier,

    content: @Composable () -> Unit

){

    Card(

        modifier = modifier,

        colors = CardDefaults.cardColors(

            containerColor = CardColor

        ),

        elevation = CardDefaults.cardElevation(

            defaultElevation = 8.dp

        )

    ){

        content()

    }

}