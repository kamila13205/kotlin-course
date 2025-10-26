package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

// Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию.
// У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(),
// который выводит описание эмоции в зависимости от её типа и интенсивности.

class Emotion (val type: String, val intensity: Int) {

    fun express() {
        var result = ""

        if (intensity < 10) {
            result = "Mild "
        } else {
            result = "Very itnense "
        }

        if (type in listOf("sad", "frustrated", "angry")) {
            result += "negative emotion"
        } else if (type in listOf("excited", "cheerful", "inspired")) {
            result += "positive emotion"
        } else {
            result += "unknown emotion"
        }

        println(result)

    }

}