package com.sagli.foods.core.designsystem.components

import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.height

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

@Composable

fun FoodsButton(

    text: String,

    onClick: () -> Unit

){

    Button(

        onClick = onClick,

        modifier = Modifier

            .fillMaxWidth()

            .height(56.dp)

    ){

        Text(

            text = text

        )

    }

}