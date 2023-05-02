package com.coretechm.dev.mylibrary01.myrxjava

import android.annotation.SuppressLint
import androidx.annotation.MainThread
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.kotlin.Observables
import java.util.Scanner
import java.util.concurrent.TimeUnit

class MySimple01 {

    private var observableTestList: MutableList<Any> = mutableListOf("initialed")
    private lateinit var test: Observable<MutableList<Any>>

    init {
        observableStreamTest()
    }

    fun callTestMethod(data: String) {
        data?.let {
            when(data) {
                "1" -> {
                    concatTest()
                }
                "2" -> {
                    observableTestList?.add(TimeUnit.SECONDS)
                }
                else -> "no matching function"
            }
        }
    }

    private fun observableStreamTest() {
        if(!::test.isInitialized) { //지연 초기화에 따른 초기화 상태 확인
            test = Observable.just(observableTestList)
        }

        test.subscribe {
            println(it)

            for(item in observableTestList) {
                println("observableTestList item : $item")
            }
        }
    }

    @SuppressLint("CheckResult")
    private fun concatTest() {
        val test2 = Observable.just("samsung", "apple", "xaomi")
        val test = Observable.just("1", "2", "3").delay(2, TimeUnit.SECONDS)
        val test3 = Observable.just(2, TimeUnit.SECONDS)

        val test4 = Observable.interval(5, TimeUnit.SECONDS)

        val test5 = Observable.interval(5, TimeUnit.SECONDS)

//        Observable.concat(test, test2).subscribe {
//            println("$it")
//        }

//        Observable.merge(test3, test, test2).subscribe(){
//            println("$it")
//        }

        test4.subscribe {
            println("observable : $it")
        }

        test5.subscribe {
            println("observable 2222 : $it")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val mySimple01 = MySimple01()

    while(true) {
        var readData = scanner.nextLine()

        mySimple01.callTestMethod(readData)
    }
}