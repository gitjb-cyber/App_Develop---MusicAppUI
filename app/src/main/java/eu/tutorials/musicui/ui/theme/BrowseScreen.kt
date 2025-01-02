package eu.tutorials.musicui.ui.theme

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.GridCells
import eu.tutorials.musicui.R

// Browse 화면 루트 설정
@Composable
fun Browse() {
    val categories = listOf("히트", "밝은 음악", "운동", "러닝", "클럽", "요가")
    LazyVerticalGrid(columns = GridCells.Fixed(2)){
        items(categories) {
            cat ->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_music_note_24)
        }
    }
}
