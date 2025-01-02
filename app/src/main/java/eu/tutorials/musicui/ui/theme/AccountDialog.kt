package eu.tutorials.musicui.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.primarySurface
import androidx.compose.material.AlertDialog
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

// Dialog(대화 창)를 open
// 계정 추가 창
@Composable
fun AccountDialog(dialogOpen: MutableState<Boolean>){
    if (dialogOpen.value) {
        AlertDialog(
            onDismissRequest = {dialogOpen.value = false},
            confirmButton = { TextButton(onClick = {dialogOpen.value = false})
            {
                Text("Confirm(확인)")
            }},
            dismissButton = { TextButton(onClick = {dialogOpen.value = false})
            {
                Text("Dismiss(닫기)")
            }},
            title = { Text("Add Account(계정 추가)")},
            // 추가하는 계정의 e메일, 패스워드 적는 텍스트 칸
            text = {
                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .padding(top = 16.dp),
                    verticalArrangement = Arrangement.Center
                    ) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.padding(top = 16.dp),
                        label = { Text(text = "Email") }
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.padding(top = 8.dp),
                        label = { Text(text = "Password") }
                    )
                }
            },
            // primarySurface -> 밝기 모드에 따라 밝기가 변함
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.primarySurface)
                .padding(8.dp),
            shape = RoundedCornerShape(5.dp),
            backgroundColor = Color.White,
            properties = DialogProperties( // 대화창 속성
                // 뒤로 가기 버튼이나 창 밖을 클릭하면 대화창 닫힘
                dismissOnBackPress = true,
                dismissOnClickOutside = true
            )
        )
    }
}