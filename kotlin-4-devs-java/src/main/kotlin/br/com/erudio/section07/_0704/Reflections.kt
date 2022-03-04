package br.com.erudio.section07._0704

fun main() {

    val person = Person("Stan", "Lee")

    val kClass = person::class

    //println("Simple name = $kClass")
    println("Simple name = ${kClass.simpleName}")

    //for (fields in kClass.members){
    for (fields in kClass.java.declaredFields){
        //println("Property name = $fields")
        println("Property name = ${fields.name}")
    }

    for (constructor in kClass.constructors){
        println("Constructor = $constructor")
        println("Constructor Return = ${constructor.returnType}")
        println("Constructor Parameters = ${constructor.parameters}")
    }
}