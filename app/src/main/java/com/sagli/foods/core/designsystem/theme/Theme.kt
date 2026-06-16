package com.sagli.foods.core.designsystem.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val DarkColors = darkColorScheme(

    primary = GreenPrimary,

    background = GreenDark,

    surface = CardColor,

    onPrimary = White,

    onBackground = White,

    onSurface = White

)

@Composable

fun FoodsTheme(

    content: @Composable () -> Unit

) {

    MaterialTheme(

        colorScheme = DarkColors,

        typography = FoodsTypography,

        shapes = FoodsShapes,

        content = content

    )

}