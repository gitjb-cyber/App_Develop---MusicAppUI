package eu.tutorials.musicui

import androidx.annotation.DrawableRes

// 아무도 상속 못하게 sealed
sealed class Screen(val title: String, val route: String) {

    // 하단 바에서 받는 제목, 루트, 아이콘
    sealed class BottomScreen(
        val bTitle: String, val bRoute: String, @DrawableRes val icon: Int
    ):Screen(bTitle, bRoute){ // Screen 상속하여 Title / Route 를 매개변수로 받음
        object Home : BottomScreen(
            "홈",
            "home",
            R.drawable.baseline_home_24
        )

        object Library : BottomScreen(
            "라이브러리",
            "library",
            R.drawable.baseline_library_music_24
        )

        object Browse : BottomScreen(
            "검색",
            "browse",
            R.drawable.baseline_apps_24
        )

    }

    // Draw Title / Route
    sealed class DrawerScreen(
        val dTitle: String, val dRoute: String, @DrawableRes val icon: Int
    ): Screen(dTitle, dRoute){
        object Account: DrawerScreen(
            "계정",
            "account",
            R.drawable.ic_account
        )
        object Subscription: DrawerScreen(
            "구독",
            "subscribe",
            R.drawable.ic_subscribe
        )
        object AddAccount: DrawerScreen(
            "계정 추가",
            "add_account",
            R.drawable.baseline_person_add_alt_1_24
        )
    }
}

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)