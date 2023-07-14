package br.com.kumabe.helloworld

fun main(){
    val valueInt: Int = 10
    val valueDouble: Double = 10.0
    val valueByte: Byte = 1
    val valueShort: Short = 2

    printNumber(valueInt)
    println(String.format("valueInt: %d", valueInt))

    printNumber(valueDouble)
    println(String.format("valueDouble: %f", valueDouble))

    printNumber(valueByte)
    println(String.format("valueByte: %d", valueByte))

    printNumber(valueShort)
    println(String.format("valueShort: %d", valueShort))
}

fun printNumber(value: Number) {
    println("Value is " + value)
}