// Животные и Их Звуки
// Базовый класс: Animal с методом makeSound().
// Классы наследники: Dog, Cat, Bird.
// Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
// Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet".
// Обогати вывод звуков цветом.
// Создайте список животных List<Animal> и вызовите в цикле метод makeSound()


package org.example.ru.stimmax.kotlincourse.lessons.lesson16.homeworks16

object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
}

abstract class Animal {
    abstract fun makeSound()
}

class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.RED}Bark${Colors.RESET}")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("${Colors.BLUE}Meow${Colors.RESET}")
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("${Colors.YELLOW}Tweet${Colors.RESET}")
    }
}

fun main() {
    val l1: List<Animal> = listOf(Dog(), Cat(), Bird())
    l1.forEach { it.makeSound() }
}