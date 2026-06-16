package com.sagli.foods

import android.os.Bundle

import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier

import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp

import com.sagli.foods.core.designsystem.components.FoodsButton

import com.sagli.foods.core.designsystem.logo.FoodsLogo

import com.sagli.foods.core.designsystem.theme.FoodsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(

        savedInstanceState: Bundle?

    ) {

        super.onCreate(savedInstanceState)

        setContent {

            FoodsTheme {

                FoodsApp()

            }

        }

    }

}

@Composable

fun FoodsApp(){

    Surface(

        modifier = Modifier.fillMaxSize()

    ){

        Column(

            modifier = Modifier

                .fillMaxSize()

                .padding(32.dp),

            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center

        ){

            FoodsLogo()

            Spacer(

                modifier = Modifier.height(32.dp)

            )

            Text(

                text =

                    "Transformando desperdício\nem oportunidade",

                style =

                    MaterialTheme.typography.headlineSmall,

                textAlign = TextAlign.Center

            )

            Spacer(

                modifier = Modifier.height(48.dp)

            )

            FoodsButton(

                text = "ENTRAR"

            ){

            }

        }

    }

}