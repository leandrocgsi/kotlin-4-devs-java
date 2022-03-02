package br.com.erudio.section05._0504

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Vruuuuuuuuuummmmmmm")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter() : Int {
        return 17
    }

    fun getDoors(): Int
}