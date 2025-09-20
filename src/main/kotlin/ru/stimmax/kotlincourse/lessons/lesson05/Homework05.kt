package org.example.ru.stimmax.kotlincourse.lessons.lesson05

fun main() {
    // 1. Интенсивность звука
    val initialSound: Int = 100
    val coefficient: Double? = null
    val totalSound: Double = initialSound * (coefficient ?: 0.5)

    // 2. Стоимость доставки
    val itemPrice: Int? = null
    val insuranceCoefficient: Double = 0.05
    val deliveryPrice = 20

    val insurancePrice = insuranceCoefficient * (itemPrice ?: 50)
    val totalPrice = insurancePrice + deliveryPrice

    // 3. Давление
    val pressure: Int? = 370
    println(pressure ?: "no pressure")
}