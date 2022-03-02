package br.com.erudio.section03._0307B

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "Kotlin World"
    println("Hello, $name 🙂 !!!")
}