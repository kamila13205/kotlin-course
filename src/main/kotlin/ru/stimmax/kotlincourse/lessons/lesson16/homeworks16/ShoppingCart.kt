// Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
// Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
// Выполнить перегрузку addToCart который:
// Принимает два аргумента (itemId и количество amount)
// Принимает словарь из id и количества и добавляет всё в корзину
// Принимает список из id (добавляет по одной единице).
// Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
// Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
// Переопредели у корзины метод toString для красивого форматирования содержимого таблицы,
// включая итоговое количество артикулов и общее количество всего товара в корзине.

package org.example.ru.stimmax.kotlincourse.lessons.lesson16.homeworks16

class ShoppingCart() {
    private val items: MutableMap<String, Int> = mutableMapOf()


    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(itemsToAdd: Map<String, Int>) {
        itemsToAdd.forEach {
            items[it.key] = items.getOrDefault(it.key, 0) + it.value
        }
    }

    fun addToCart(itemsToAdd: List<String>) {
        itemsToAdd.forEach {
            items[it] = items.getOrDefault(it, 0) + 1
        }
    }

    override fun toString(): String {
        var result = ""
        items.forEach {
            result += "${it.key} --- ${it.value} \n"
        }
        result += "Total items in cart: ${items.values.sum()}"
        return result
    }
}

fun main() {
    val cart = ShoppingCart()

    cart.addToCart("Apple")
    cart.addToCart("Banana", 3)
    cart.addToCart(mapOf("Pear" to 2, "Apple" to 5))
    cart.addToCart(listOf("Milk", "Banana", "Bread"))

    println(cart)
}
