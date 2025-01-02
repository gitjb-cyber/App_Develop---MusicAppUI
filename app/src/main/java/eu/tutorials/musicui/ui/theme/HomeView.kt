package eu.tutorials.musicui.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import eu.tutorials.musicui.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home() {
    val categories = listOf("히트", "밝은 음악", "운동", "러닝", "클럽", "요가")
    val grouped = listOf<String>("신곡", "즐겨찾기", "TOP 100").groupBy { it[0] }
    LazyColumn{
        grouped.forEach{
            stickyHeader { // 화면을 내려도 고정되는 헤더
                Text(text = it.value[0], modifier = Modifier.padding(16.dp))
                LazyRow{// 무한 옆으로 넘기기
                    items(categories){
                        cat ->
                        BrowserItem(cat = cat, drawable = R.drawable.baseline_music_note_24)
                    }
                }
            }
        }
    }
}

// 여러개의 음악 카드 설정
@Composable
fun BrowserItem(cat: String, drawable: Int){
    Card(
        modifier = Modifier
            .padding(16.dp)
            .size(200.dp),
        border = BorderStroke(3.dp, color = Color.DarkGray)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = cat)
            Image(painter = painterResource(id = drawable), contentDescription = cat)

        }
    }
}