package br.com.erudio.section08._0812

data class Student(val name: String, var age: Int)

fun findTheShortestStudentName(students: List<Student>): Student? {
    return students.minByOrNull { it.name.length }
}