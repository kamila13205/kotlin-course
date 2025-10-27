package org.example.ru.stimmax.kotlincourse.lessons.lesson15.homeworks

// Иерархия Мебели
// Базовый класс: Мебель
// Производные классы: …
// Дополнительное разветвление для …: …

abstract class Furniture (
    val room: String,
    val type: String,
    val price: Int
) {
    fun info() {
        println("Furniture type $type for room $room, price $price")
    }
}

class Beds(
    val soft: Boolean,
    price: Int
): Furniture("Bedroom", "Bed", price) {
    fun checkBedIsSoft(): Boolean {
        return soft
    }
}

open class Tables(
    room: String,
    val height: Int,
    price: Int
): Furniture(room, "Table", price) {

    fun isChildsTable(): Boolean {
        if (height > 60)
            return false
        return true
    }
}

class DinnerTables(
    height: Int,
    price: Int,
    val seats: Int
) : Tables("Dining room", height, price) {
    fun tableFitsBigFamily(): Boolean{
        if (!isChildsTable()) {
            if (seats > 4) {
                return true
            }
        }
        return false
    }
}

class studyingTables(
    height: Int,
    price: Int,
    val material: String
): Tables("Studyroom", height, price) {
    fun checkTableNotExpensive(): Boolean {
        if (!(material in listOf("Wood", "Stone")) && (price < 1000)) {
            return true
        }
        return false
    }
}