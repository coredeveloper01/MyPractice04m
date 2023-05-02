package com.coretechm.dev.mylibrary01.myrxjava

import io.reactivex.rxjava3.subjects.PublishSubject
import java.util.Scanner

/**
 * 특정 객체의 상태를 구독하여 데이터 변경 시 이벤트 체크
 */
class MySimple02 {

    val publishSubject = PublishSubject.create<MutableList<String>>()
    var mutableList = mutableListOf<String>()

    init {
        callTest()
    }

    fun callTest() {
        publishSubject.subscribe {
            println("$it")
        }
    }

    fun addData(data: String) {
        mutableList.add(data ?: "default")

        publishSubject.onNext(mutableList)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val ins = MySimple02()
    while(true) {
        val data = scanner.nextLine()

        ins.addData(data)
    }
}