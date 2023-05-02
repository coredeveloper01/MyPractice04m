package com.coretechm.dev.mylibrary01.mycoroutine

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MySimple01 {

}

fun main() {
    runBlocking {
        launch {
            for(i in 1..100) {
                println(i)
            }
        }
    }
}