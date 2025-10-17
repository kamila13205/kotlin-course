package org.example.ru.stimmax.kotlincourse.lessons.lesson11

fun main() {
    println(f4(listOf(1, 2, 1, 2)))
}

// 1. Не принимает аргументов и не возвращает значения.
fun f1() {

}

// 2. Принимает два целых числа и возвращает их сумму.
fun f2(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает.
fun f3 (s: String) {

}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun f4(l: List<Int>): Double {
    var sum: Double = 0.0
    for (number in l) {
        sum += number
    }
    return sum / l.count()
}

// 5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun f5(s: String?): Int? {
    if (s.isNullOrBlank())
        return null
    else
        return s.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число.
fun f6(): Double? {
    val x: Double? = null
    return x
}

// 7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun f7(l: List<Int>?) {

}

// 8. Принимает целое число и возвращает nullable строку.
fun f8(x: Int): String? {
    val a = if (x < 0) null else "AAA"
    return a
}

// 9. Не принимает аргументов и возвращает список nullable строк.
fun f9(): List<String?> {
    val a = listOf(null, "AAA", null, "BB")
    return a
}

// 10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun f10(s: String?, i: Int?): Boolean? {
    if (s.isNullOrEmpty() || i == null)
        return null
    else
        return true
}

// 11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(x: Int): Int = x * 2

// 12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное,
// и false в противном случае.
fun isEven(x: Int): Boolean {
    if (x % 2 == 0) {
        return true
    }
    else {
        return false
    }
}

// 13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

// 14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое
// отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(l: List<Int>): Int? {
    for (number in l) {
        if (number < 0) {
            return number
        }
    }
    return null
}

// 15. Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(l: List<String?>){
    for (str in l) {
        if (str == null) {
            return
        }
        println(str)
    }
}
