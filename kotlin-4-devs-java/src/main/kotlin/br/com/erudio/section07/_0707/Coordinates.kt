package br.com.erudio.section07._0707

data class Coordinates(var x: Int, var y: Int) {

    operator fun plus(other: Coordinates) : Coordinates = Coordinates(x + other.x, y + other.y)

    operator fun minus(other: Coordinates) : Coordinates = Coordinates(x - other.x, y - other.y)
}
