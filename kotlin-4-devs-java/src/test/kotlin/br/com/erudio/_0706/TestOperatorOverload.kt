package br.com.erudio._0706

import br.com.erudio.section07._0707.Coordinates
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestOperatorOverload {

    /*
    operator fun plus(other: Coordinates) : Coordinates {
        TODO("not implemented")
    }

    operator fun minus (other: Coordinates) : Coordinates {
        TODO("not implemented")
    }*/

    lateinit var p1: Coordinates
    lateinit var p2: Coordinates

    @BeforeAll
    fun setup() {
        p1 = Coordinates(200, 100)
        p2 = Coordinates(1000, 2000)
    }

    @Test
    fun `Calling OperatorOverload with "(200, 100) plus (1000, 2000)" returns Coordinates(x=1200, y=2100)`(){
        val p3 = p1 + p2
        p3.toString() shouldBeEqualTo "Coordinates(x=1200, y=2100)"
    }

    @Test
    fun `Calling OperatorOverload with "(200, 100) minus (1000, 2000)" returns Coordinates(x=1200, y=2100)`(){
        val p3 = p1 - p2
        p3.toString() shouldBeEqualTo "Coordinates(x=-800, y=-1900)"
    }
}