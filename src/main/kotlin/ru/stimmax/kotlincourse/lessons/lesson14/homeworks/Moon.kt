package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

// Природное явление: луна. Создайте объект Moon, который будет представлять Луну.
// Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String),
// чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
// Добавьте метод showPhase(), который выводит текущую фазу Луны.


object Moon {

    val isVisible = true
    val phase = "New Moon"

    fun showPhase() {
        if (isVisible) {
            println("Moon is visible, phase is $phase")
        } else {
            println("Moon is not visible, but phase is $phase")
        }
    }
}

