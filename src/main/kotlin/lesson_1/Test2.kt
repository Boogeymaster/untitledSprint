package org.example.lesson_1

class Test2 {
    val itemCount: Short = 75
    val thanksForBuy: String = "Thank you for purchase"
    var personalCount: Short = 2000
    fun main(){
        println(itemCount)
        println(thanksForBuy)
//        println(personalCount)
        personalCount = 1999
        println(personalCount)
    }

}