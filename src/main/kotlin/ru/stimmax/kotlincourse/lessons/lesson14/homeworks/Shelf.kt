package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

// Задание 6
// Класс Shelf (Полка Стеллажа)

// Характеристики:
// Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
// Список предметов (items): хранит названия предметов на полке.

class Shelf(var capacity: Int) {

    private var items = mutableListOf<String> ()

    // Добавление Предмета (addItem):
    // Принимает название предмета.
    // Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
    // Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
    fun addItem(item: String): Boolean {
        if (canAccomodate(item)) {
            items.add(item)
            return true
        }
        return false
    }


    // Удаление Предмета (removeItem):
    // Принимает название предмета.
    // Удаляет предмет, если он найден на полке.
    // Возвращает true, если предмет был удален, и false, если такой предмет не найден.
    fun removeItem(item: String): Boolean {
        if (containsItem(item)) {
            items.remove(item)
            return true
        }
        return false
    }


    // Проверка Вместимости (canAccommodate):
    // Принимает название предмета.
    // Определяет, вместится ли предмет на полку.
    // Возвращает true, если предмет вместится, и false, если места недостаточно.
    fun canAccomodate(item: String): Boolean {
        if (items.sumOf { it.length } + item.length <= capacity) {
            return true
        }
        return false
    }

    // Проверка наличия предмета (containsItem):
    // Принимает название предмета
    // Возвращает true если такой предмет есть
    fun containsItem(name: String) = items.contains(name)

    // Получение списка предметов (getItems):
    // Возвращает неизменяемый список предметов
    fun getItems() = items.toList()
}