// Принтер
// Создай абстрактный принтер, который имеет абстрактный метод печати, принимающий в качестве аргумента строку.
// Создай классы наследники: лазерный и струйный
// Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно чёрными буквами на
// белом фоне (хорошо работает на тёмной теме)
// Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными буквами на
// цветном фоне. Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона и проходить циклически
// по этому списку при выводе текста. Проверить работу на длинном тексте

package org.example.ru.stimmax.kotlincourse.lessons.lesson16.homeworks16

object Colors1 {
    const val RESET = "\u001B[0m"

    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"

    const val BG_BLACK = "\u001B[40m"
    const val BG_RED = "\u001B[41m"
    const val BG_GREEN = "\u001B[42m"
    const val BG_YELLOW = "\u001B[43m"
    const val BG_BLUE = "\u001B[44m"
    const val BG_PURPLE = "\u001B[45m"
    const val BG_CYAN = "\u001B[46m"
    const val BG_WHITE = "\u001B[47m"
}


fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text ${Colors1.RESET}")
}


abstract class Printer {
    open fun print(text: String) {
        println(text)
    }
}

class LaserPrint : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        words.forEach { printColored(it, Colors1.BLACK, Colors1.BG_WHITE) }
    }
}

class InkjetPrinter : Printer() {
    private val colors = listOf<Pair<String, String>>(
        Pair(Colors1.RED, Colors1.BG_BLACK),
        Pair(Colors1.YELLOW, Colors1.BG_GREEN),
        Pair(Colors1.BLUE, Colors1.BG_CYAN),
        Pair(Colors1.PURPLE, Colors1.BG_GREEN),
        Pair(Colors1.WHITE, Colors1.BG_BLACK),
    )

    override fun print(text: String) {
        val words = text.split(" ")
        for (i in words.indices) {
            val (color, bgcolor) = colors[i % 5]
            printColored(words[i], color, bgcolor)
        }
    }
}

fun main() {
    val lp = LaserPrint()
    lp.print("All work and no play makes Jack a dull boy")

    val ijp = InkjetPrinter()
    ijp.print("All work and no play makes Jack a dull boy")
}