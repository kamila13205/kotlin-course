package org.example.ru.stimmax.kotlincourse.lessons.lesson07.homeworks

fun main() {
    // 1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            print(' ')
        }
        println()
    }

    sums(11)
}

// 2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun sum(arg: Int) {
    var sum: Int = 0
    for (i in 1..arg)
        sum += i
    println(sum)
}

// 3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun factorial(arg: Int) {
    var fact: Int = 1
    var counter = 0
    while (counter++ < arg)
        fact *= counter
    print(fact)
}

// 4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun sum_even(arg: Int) {
    var sum: Int = 0
    var counter: Int = 1
    while (counter++ < arg)
        if (counter % 2 == 0)
            sum += counter
    println(sum)
}

// 5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
fun rectangle() {
    var counter1 = 0
    var counter2 = 0
    while (counter1++ < 5) {
        while (counter2++ < 3) {
            print('*')
        }
        counter2 = 0
        println()
    }
}

// 6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun sums(arg: Int) {
    var sum_even: Int = 0
    var sum_odd: Int = 0
    for (i in 1..arg)
        if (i % 2 == 0)
            sum_even += i
        else
            sum_odd += i
    println(sum_even)
    println(sum_odd)
}