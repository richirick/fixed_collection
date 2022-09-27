package com.example.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val someList = listOf(
    "a",
    "b",
    "c",
)
var list = mutableListOf<String>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (s in someList){
            list.add(s)
        }
        println(list)
    }
}
