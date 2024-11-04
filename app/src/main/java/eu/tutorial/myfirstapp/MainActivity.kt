package eu.tutorial.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.tutorial.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {      // 액티비티는 사용자 화면
    override fun onCreate(savedInstanceState: Bundle?) {        // 실행될 때 실행
        super.onCreate(savedInstanceState)      // 먼저 실행하세요
        enableEdgeToEdge()
        setContent {
            MyFirstAppTheme {   // modifier은 composable의 외관 수정, 제어
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable     // composable은 ui요소 -> 초록색으로 표시
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)     //  에뮬하지 않고 수정 내용 확인하기 위함
@Composable
fun GreetingPreview() {
    MyFirstAppTheme {
        Greeting("Android")
    }
}