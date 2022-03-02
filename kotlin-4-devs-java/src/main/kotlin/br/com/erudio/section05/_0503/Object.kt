package br.com.erudio.section05._0503

fun main() {

    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    val location = object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }
    location.printIt()

    location.xCoordinate = 3000
    location.yCoordinate = 6000

    location.printIt()

    val temperature = MySingleton.getLastTemperature();
    println("Last temperature measured = $temperature degress!")
}

object MySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}