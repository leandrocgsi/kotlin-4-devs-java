package br.com.erudio._0811

import br.com.erudio.section08._0812.Student
import br.com.erudio.section08._0812.findTheShortestStudentName
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/*
fun findTheShortestStudentName(students: List<Student>): Student? {
    TODO("not implemented")
}
*/

class Test {

    @Test
    fun `Find shortest student name should be equal 'Ada'`() {

        val students = listOf(
            Student("Ada", 19),
            Student("Manoel", 23),
            Student("Maria", 20),
            Student("João", 39),
            Student("José", 16)
        )
        findTheShortestStudentName(students)?.name shouldBeEqualTo "Ada"
    }
}