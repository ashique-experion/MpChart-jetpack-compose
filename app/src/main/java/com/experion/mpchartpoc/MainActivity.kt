package com.experion.mpchartpoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.experion.mpchartpoc.ui.theme.MpChartPocTheme
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

//import com.patrykandpatrick.vico.compose.axis.horizontal.rememberBottomAxis
//import com.patrykandpatrick.vico.compose.axis.vertical.rememberStartAxis
//import com.patrykandpatrick.vico.compose.chart.Chart
//import com.patrykandpatrick.vico.compose.chart.line.lineChart
//import com.patrykandpatrick.vico.core.entry.entryModelOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MpChartPocTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BarChartTest()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MpChartPocTheme {
        Greeting("Android")
    }
}

@Composable
fun BarChartTest() {

    val barChart = BarChart(LocalContext.current)

    val entries = listOf(
        BarEntry(1f, 100f),
        BarEntry(2f, 200f),
        BarEntry(3f, 300f),
        BarEntry(4f, 400f),
        BarEntry(5f, 500f)
    )

    val dataSet = BarDataSet(entries, "Label")
    val data = BarData(dataSet)

    barChart.data = data

    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { barChart },

    )
}

