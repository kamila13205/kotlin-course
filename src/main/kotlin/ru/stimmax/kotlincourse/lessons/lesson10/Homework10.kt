package org.example.ru.stimmax.kotlincourse.lessons.lesson10

import org.example.ru.stimmax.kotlincourse.lessons.lesson03.PI

fun main() {
    // Задачи на работу со словарём
    // 1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val a1 = mapOf<Int, Int>()

    // 2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val a2 = mapOf<Float, Double>(1.1F to 1.11, 2.2F to 2.22)

    // 3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val a3 = mutableMapOf<Int, String>()

    // 4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    a3[1] = "one"
    a3[2] = "two"
    a3[3] = "three"

    // 5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    println(a3[2])
    println(a3[5]) // null

    // 6. Удалите определенный элемент из изменяемого словаря по его ключу.
    a3.remove(3)

    // 7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
    // Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val a7 = mapOf<Double, Int> (1.1 to 2, 3.0 to 4, 0.5 to 0)
    for ((k, v) in a7) {
        if (v == 0) {
            println("infinity")
        } else {
            println(k / v)
        }
    }

    // 8. Измените значение для существующего ключа в изменяемом словаре.
    val a8 = mutableMapOf("Russia" to "Moscow", "France" to "Paris", "Germany" to "Berlin")
    a8["Germany"] = "Munich"

    // 9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val a91 = mapOf(1 to "uno", 2 to "dos", 3 to "tres")
    val a92 = mapOf(4 to "cuatro", 5 to "cinco", 6 to "seis")
    val a9 = mutableMapOf<Int, String> ()
    for ((k, v) in a91)
        a9[k] = v
    for ((k, v) in a92)
        a9[k] = v

    // 10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
    // Добавьте несколько элементов в этот словарь.
    val a10 = mapOf<String, List<Int>>("hello" to listOf(1, 2, 3), "goodbye" to listOf(3, 4, 5))

    // 11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
    // Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
    // Распечатай полученное множество.
    val a11 = mutableMapOf<Int, MutableSet<String>>()
    a11[1] = mutableSetOf("a", "aa", "aaa")
    a11[2] = mutableSetOf("b", "bb", "bbb")
    val a111 = a11[2]
    if (a111 != null) {
        a111.add("bbbb")
        for (s in a111)
            println(s)
    }

    // 12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет
    // содержать цифру 5 в качестве первого или второго значения.
    val a12 = mapOf(1 to 2, 3 to 4, 5 to 6, 7 to 8)
    for ((k, v) in a12) {
        if (k == 5 || v == 5) {
            println("$k: $v")
        }
    }

    // Задачи на подбор оптимального типа для словаря
    // 1. Словарь библиотека: Ключи - автор книги, значения - список книг
    val b1 = mutableMapOf<String, Set<String>>()
    b1["Pushkin"] = setOf("E. Onegin", "Skazka o rybke")
    b1["Gogol"] = setOf("Mertvye dushi", "Vechera na hutore")

    // 2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val b2 = mutableMapOf<String, Set<String>>()
    b2["Flowers"] = setOf("Dandelion", "Rose")
    b2["Trees"] = setOf("Oak", "Pine")

    // 3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val b3 = mutableMapOf<String, List<String>>()
    b3["Spartak"] = listOf("Zhora", "Petya", "Vasya", "Petya")

    // 4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val b4 = mutableMapOf<String, List<String>>()
    b4["11.08"] = listOf("Pill1", "Pill2", "Pill3", "Pill1")

    // 5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val b5 = mutableMapOf<String, MutableMap<String, Set<String>>>()
    b5["Russia"] = mutableMapOf("Moscow" to setOf("Red square", "Nikolskaya", "Tverskaya"))

}