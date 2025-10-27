package org.example.ru.stimmax.kotlincourse.lessons.lesson15.homeworks

import kotlin.math.PI
import kotlin.math.sqrt

// Геометрические Фигуры
// Базовый класс: Геометрическая Фигура
// Производные классы: Многоугольник, Круг
// Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

abstract class Figure (
    val type: String,
    val area: Int
) {

}

open class Polygon (
    type: String,
    area: Int,
    val numberOfSides: Int
): Figure(type, area) {
    fun sumOfAngles(): Int {
        return 180 * (numberOfSides - 2)
    }
}

class Triangle (
    val side1: Int,
    val side2: Int,
    val side3: Int,
    area: Int
): Polygon("Triangle", area, 3) {
    fun verifyArea(): Boolean {
        val s: Int = (side1 + side2 + side3) / 2
        val area = sqrt((s * (s - side1) * (s - side2) * (s - side3)).toDouble()).toInt()
        return (area == this.area)
    }
}

class quadrAngle(
    val side1: Int,
    val side2: Int,
    val side3: Int,
    val side4: Int,
    area: Int
) : Polygon("Quadrangle", area, 4) {
    fun calculatePerimeter(): Int {
        return side1 + side2 + side3 + side4
    }
}


class Circle (
    area: Int,
    val radius: Int
): Figure("Circle", area) {
    fun verifyArea() : Boolean {
        return (area == (PI * radius * radius).toInt())
    }
}