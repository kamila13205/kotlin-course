package org.example.ru.stimmax.kotlincourse.lessons.lesson15.homeworks

// Четвёртый класс должен принимать словарь (ключи и значения строки). Каждая пара ключа и значения должна попадать
// в контейнер следующим образом - ключ в начало, значение в конец. Таким образом в начале должны быть ключи в обратном
// порядке, потом существующие материалы, потом все значения.

class Materials7: Materials() {
    fun insertKeysAndValues(m: Map<String, String>) {
        val materials = extractMaterials()

        m.keys.reversed().forEach { addMaterial(it) }
        materials.forEach { addMaterial(it) }
        m.values.forEach { addMaterial(it) }
    }
}