package eu.tutorials.musicui

import androidx.annotation.DrawableRes

// 더미 데이터 설정
data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_playlist_play_24, "플레이 리스트"),
    Lib(R.drawable.baseline_support_agent_24, "아티스트"),
    Lib(R.drawable.baseline_album_24, "앨범"),
    Lib(R.drawable.baseline_music_note_24, "Songs"),
    Lib(R.drawable.baseline_contact_emergency_24, "2030세대"),

)