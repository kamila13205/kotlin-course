package org.example.ru.stimmax.kotlincourse.lessons.lesson17.homeworks

import org.example.ru.stimmax.kotlincourse.lessons.lesson17.SomeClass

// Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях и
// заданным образом доработать класс ChildrenClass (BaseClass доработке не подлежит)

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // ChildrenClass не наследует privateVal из BaseClass, privateVal публичный при инициализации ChildrenClass
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    // ChildrenClass наследует protectedVal из BaseClass где он protected
    protected val protectedVal: String,
    val publicVal: String
) {
    // 3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()
    var publicField = ""
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    // private поле неизменяемо из дочернего класса
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. объясни, почему эта функция не может быть публичной
    // ProtectedClass - protected, доступен только внутри класса и класса наследника
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // generate переопределена в дочернем классе
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    // приватный класс, доступен только внутри класса
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // 10. потому как в наследуемом классе есть одноимённое публичное поле и доступно именно оно а не этот аргумент
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 4. Доработай ChildrenClass таким образом, чтобы это получилось
    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // публичная функция родительского класса
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // printText использует privatePrint из класса BaseClass, не может использовать privatePrint из
    // ChildrenClass, потому что она private и не override privatePrint
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    fun updateProtectedField(value: String) {
        protectedField = value
    }
}

fun main() {
    var children = ChildrenClass("privateVal", "protectedVal", "publicVal")
    children.publicField = "Антонио Бандерас"
    children.updateProtectedField("protectedField1")
    println(children.getAll())
    children.printText()
}