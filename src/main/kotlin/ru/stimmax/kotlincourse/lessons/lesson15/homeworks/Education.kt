package org.example.ru.stimmax.kotlincourse.lessons.lesson15.homeworks

// Учебные Заведения
// Базовый класс: Учебное Заведение
// Производные классы: Школа, …
// Дополнительное разветвление для …: …

abstract class Education(
    val level: String,
    val capacity: Int
) {
    fun info() {
        println("Educational center for $capacity students of $level level")
    }
}

class Institute(
    val type: String = "Techincal"
) : Education("adult", 1000) {
    fun getType() {
        println("type is $type")
    }
}

open class School(
    capacity: Int,
    val ageRange: IntRange
) : Education("children", capacity) {

    fun getMinAge(): Int {
        val minAge = ageRange.first
        println("Children can enroll from $minAge years old")
        return minAge
    }
}

class MiddleSchool(
    val subjects: List<String>
) : School(200, 11..16) {
    fun printSubjects() {
        subjects.forEach { println(it) }
    }
}

class HighSchool(
    val subjectsEGE: Map<String, Boolean>
) : School(300, 17..18) {
    fun subjectsEGEExam() {
        subjectsEGE.forEach { println("Subject ${it.key} has EGE exam: ${it.value}") }
    }
}