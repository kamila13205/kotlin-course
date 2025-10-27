package org.example.ru.stimmax.kotlincourse.lessons.lesson15.homeworks

// Третий класс при добавлении строки должен отсортировать весь список метиралов в
// алфавитном порядке включая добавляемый материал.


class Materials6 : Materials() {
    fun insertAndSort(item: String) {
        var materials = extractMaterials()
        materials += item
        materials = materials.sorted()
        materials.forEach { addMaterial(it) }
    }
}