package com.coretechm.dev.mylibrary01

class MySimple01 {

}

var tempData: Int = 100
fun myFunTest(data: Int, funTest: (Int) -> Unit) {

    funTest(tempData + 100)

    println(tempData)

}

fun main() {
    myFunTest(100, funTest = { println(it)})
}