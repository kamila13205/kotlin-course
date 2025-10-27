package org.example.ru.stimmax.kotlincourse.lessons.lesson15.homeworks

// Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)

class Materials4 : Materials() {
    fun insertAtTheBottom(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach { addMaterial(it) }
    }
}