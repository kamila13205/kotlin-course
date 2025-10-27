package org.example.ru.stimmax.kotlincourse.lessons.lesson15.homeworks

import org.example.ru.stimmax.kotlincourse.lessons.lesson11.max

// Второй класс должен получать список строк и вставлять их в начало контейнера
// но поочерёдно с теми данными, которые уже есть.
// То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.

class Materials5: Materials() {

    fun insertOnEverySecond(items: List<String>) {
        val materials = extractMaterials()
        for (i in 0..max(materials.lastIndex, items.lastIndex)) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}