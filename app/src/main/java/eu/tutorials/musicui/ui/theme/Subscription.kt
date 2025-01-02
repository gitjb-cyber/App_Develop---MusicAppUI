package eu.tutorials.musicui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// 구독 화면 꾸미기
@Composable
fun Subscription() {
    Column (
        modifier = Modifier.height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Mange Subscription(구독 관리)")
        Card(
            modifier = Modifier.padding(8.dp),
            elevation = 4.dp // 그림자 효과
        ) {
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Column() {
                    Text(text = "Musical")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Free Tier(무료 등급)")
                        TextButton(onClick = {}) {
                            Row {
                                Text(text = "See All Plans(모든 플랜 보기)")
                                Icon(
                                    // > 아이콘
                                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = "See All Plans(모든 플랜 보기)"
                                )
                            }
                        }
                    }
                }
                Divider(
                    thickness = 1.dp,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Row (
                    modifier = Modifier.padding(vertical = 8.dp)
                ){
                    Text(text = "Get a Plan")
                    Icon(
                        imageVector = Icons.Default.AccountBox,
                        contentDescription = "Get a Plan"
                    )
                }
            }
        }
    }
}