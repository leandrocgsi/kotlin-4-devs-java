package br.com.erudio.section08._0803

fun main() {
    val students = getStudents()

    val combos = students.map { a -> "${a.name} : ${a.age}"}
    println("Combos: $combos")

    println("The oldest student is: ${students.maxByOrNull { it.age }}")
    println("Student with longest name is: ${students.filter { it.name.length > 5 }}")
}