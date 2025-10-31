// Геометрические Фигуры и Их Площадь
// Абстрактный (базовый) класс: Shape с open методом area().
// Классы наследники: Circle, Square, Triangle.
// Метод area() возвращает 0.0.
// Переопределите метод area() в каждом классе-наследнике для расчета площади соответствующей фигуры.
// Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие вычислить площадь
// (для круга это радиус, для квадрата это сторона, для треугольника это две стороны и угол между ними)
// Создай набор геометрических фигур и выведи в цикле их площадь

package org.example.ru.stimmax.kotlincourse.lessons.lesson16.homeworks16

import kotlin.math.PI
import kotlin.math.sin

abstract class Shape() {
    open fun area(): Double = 0.0
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}

class Square(val side: Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(val side1: Double, val side2: Double, val angle: Double) : Shape() {
    override fun area(): Double = side1 * side2 * sin(angle) / 2
}

fun main() {
    val shapes = listOf(Circle(1.0), Square(2.0), Triangle(3.0, 3.0, 0.5 * PI))
    shapes.forEach { println(it.area()) }
}

