package com.example.recipeapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipeapp.R

@Composable
@Preview
private fun PreviewPostCard(){
    PostCard()
}

@Composable
fun PostCard(){
    Card(modifier = Modifier
        .height(410.dp)
        .width(310.dp)
        .padding(5.dp)
        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(10.dp))
    ) {
            Column(modifier = Modifier) {
                Image(
                    painter = painterResource(
                        R.drawable.ic_main_image
                    ), contentDescription = "",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(308.dp)
                )
                LowerCard()
        }
    }
}
@Composable
private fun LowerCard() {
    Row(modifier = Modifier
        .background(Color.White)
        .fillMaxSize(), verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.SpaceEvenly) {
        Icon(iconResId = R.drawable.ic_empty_like)
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Name Recipe",fontSize = 17.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                IconWithText(iconResId = R.drawable.like, text = "143")
                Spacer(modifier = Modifier.width(15.dp))
                IconWithText(iconResId = R.drawable.ic_timer, text = "15 min")
            }
        }
    }
}

@Composable
private fun IconWithText(iconResId:Int, text:String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = iconResId), contentDescription = null)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = text, fontSize = 13.sp, fontWeight = FontWeight.W300)
    }
}
@Composable
private fun Icon(iconResId: Int
) {
    Box(modifier = Modifier

        .size(60.dp)
        .clip(CircleShape)
        .clickable {
        }
        .border(width = 1.dp, color = Color.LightGray, shape = CircleShape)
        , contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(id = iconResId), contentDescription = null
            , modifier = Modifier.size(30.dp))
    }

}

