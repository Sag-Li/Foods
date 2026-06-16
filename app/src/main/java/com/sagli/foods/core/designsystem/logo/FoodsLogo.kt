package com.sagli.foods.core.designsystem.logo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FoodsLogo(

    modifier: Modifier = Modifier,

    textSize: TextUnit = 42.sp,

    appleSize: Dp = 38.dp

) {

    Row(

        modifier = modifier,

        verticalAlignment = Alignment.CenterVertically

    ) {

        Text(

            text = "F",

            color = Color.White,

            fontSize = textSize,

            fontWeight = FontWeight.Black

        )

        AppleIcon(

            size = appleSize

        )

        Text(

            text = "ODS",

            color = Color.White,

            fontSize = textSize,

            fontWeight = FontWeight.Black

        )

    }

}

@Composable
private fun AppleIcon(

    size: Dp

) {

    Canvas(

        modifier = Modifier.size(size)

    ) {

        val w = this.size.width

        val h = this.size.height

        // Corpo esquerdo

        drawOval(

            color = Color.White,

            topLeft = Offset(

                w * 0.10f,

                h * 0.28f

            ),

            size = Size(

                w * 0.42f,

                h * 0.52f

            )

        )

        // Corpo direito

        drawOval(

            color = Color.White,

            topLeft = Offset(

                w * 0.45f,

                h * 0.28f

            ),

            size = Size(

                w * 0.42f,

                h * 0.52f

            )

        )

        // Base

        drawOval(

            color = Color.White,

            topLeft = Offset(

                w * 0.22f,

                h * 0.45f

            ),

            size = Size(

                w * 0.45f,

                h * 0.35f

            )

        )

        // Cabinho

        drawRect(

            color = Color.White,

            topLeft = Offset(

                w * 0.47f,

                h * 0.08f

            ),

            size = Size(

                w * 0.04f,

                h * 0.18f

            )

        )

        // Folha

        rotate(

            degrees = -35f,

            pivot = Offset(

                w * 0.60f,

                h * 0.12f

            )

        ) {

            drawOval(

                color = Color(

                    0xFF7BFF9B

                ),

                topLeft = Offset(

                    w * 0.55f,

                    h * 0.05f

                ),

                size = Size(

                    w * 0.18f,

                    h * 0.10f
                )
            )
        }

    }
}