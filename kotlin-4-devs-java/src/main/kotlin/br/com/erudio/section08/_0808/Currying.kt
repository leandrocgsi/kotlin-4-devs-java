package br.com.erudio.section08._0808

import org.funktionale.currying.curried

fun main() {

    val sum3ints = {x: Int, y: Int, z: Int -> x + y + z}

    val curried: (Int) -> (Int) -> (Int) -> Int = sum3ints.curried()
    val curriedResult = curried(2)(4)(6)

    println("curried(2)(4)(6) = $curriedResult")
}