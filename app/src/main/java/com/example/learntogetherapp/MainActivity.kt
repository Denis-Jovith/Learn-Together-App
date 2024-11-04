package com.example.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    LearnTogether(
                        firstXt = stringResource(R.string.firstXtx),
                        secondXt = stringResource(R.string.secondXtx),
                        thirdXt = stringResource(R.string.secondXt),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogether(firstXt: String, secondXt: String, thirdXt: String, modifier: Modifier) {
    Column() {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
        )
        Text(
            text = firstXt,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start= 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
        Text(
            text = secondXt,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = thirdXt,
            modifier = Modifier
                .padding(all = 16.dp)
        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherAppTheme {
        LearnTogether(
            firstXt = stringResource(R.string.firstXtx),
            secondXt = stringResource(R.string.secondXtx),
            thirdXt = stringResource(R.string.secondXt),
            modifier = Modifier
        )
    }
}