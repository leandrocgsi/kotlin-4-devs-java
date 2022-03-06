package br.com.erudio.section08._0804

fun closureMaker(): () -> Unit {
    var num = 0
    return { println(num++) }
}

fun main() {
    val myCounter1 = closureMaker()
    val myCounter2 = closureMaker()

    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()
    myCounter1()
}