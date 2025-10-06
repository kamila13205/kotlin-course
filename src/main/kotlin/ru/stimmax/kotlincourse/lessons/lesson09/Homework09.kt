package org.example.ru.stimmax.kotlincourse.lessons.lesson09

fun main() {

// Работа с массивами Array
// 1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val a1 = arrayOf<Int> (1, 2, 3, 4, 5)

// 2. Создайте пустой массив строк размером 10 элементов.
    val a2 =  Array<String> (10) {""}

// 3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val a3 = Array<Double> (5) { 0.0 }
    for (i in a3.indices){
        a3[i] = (i * 2).toDouble()
    }

// 4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val a4 = Array<Int> (5) {0}
    for (i in a4.indices) {
        a4[i] = i * 3
    }

// 5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val a5 = arrayOf<String?> (null, "aaa", "bbb")

// 6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val a6 = arrayOf<Int> (1, 2, 3, 4, 5)
    val a61 = Array<Int> (5) {0}
    for (i in a6.indices) {
        a61[i] = a6[i]
    }

// 7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val a71 = arrayOf<Int> (2, 4, 6, 8,10)
    val a72 = arrayOf<Int> (6, 7, 8, 9, 10)
    val a73 = Array<Int> (5) {0}
    for (i in a71.indices) {
        a73[i] = a71[i] - a72[i]
    }

// 8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1.
// Реши задачу через цикл while.
    val a8 = arrayOf<Int> (1, 2, 3, 4, 6, 7, 8, 9, 10)
    arrays_fun8(a8)


// 9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
// Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val a9 = arrayOf<Int> (1, 54, 12, 44, 76, 89, 11)
    for (element in a9) {
        if (element % 2 == 0) {
            println("$element is even")
        } else {
            println("$element is odd")
        }
    }

// 10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    val a10 = arrayOf<String> ("Kotlin", "is", "fun")
    arrays_fun10(a10, "in")


// Работа со списками List
// 1. Создайте пустой неизменяемый список целых чисел.
    val l1: List<Int> = listOf()

// 2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val l2 = listOf<String> ("Hello", "World", "Kotlin")

// 3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val l3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

// 4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val l4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    l4.add(6)
    l4.add(7)
    l4.add(8)

// 5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val l5: MutableList<String> = mutableListOf("Hello", "World", "!!!")
    l5.remove("World")

// 6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val l6 = listOf<Int> (1, 2, 3, 4, 5)
    for (element in l6)
        println(element)

// 7. Создайте список строк и получите из него второй элемент, используя его индекс.
    val l7 = listOf<String> ("All", "work", "and", "no", "play")
    println(l7[1])

// 8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val l8 = mutableListOf<Int> (1, 2, 3, 4, 5)
    l8[1] = 22

// 9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val l91 = listOf<String> ("All", "work", "and", "no", "play")
    val l92 = listOf<String> ("makes", "Jask", "a", "dull", "boy")
    val l9 = mutableListOf<String>()
    for (element in l91)
        l9.add(element)
    for (element in l92)
        l9.add(element)

// 10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val l10 = listOf<Int> (12, 43, 543, 191, 11, 0, 333)
    var min = l10[0]
    var max = l10[0]
    for (element in l10) {
        if (element < min)
            min = element
        if (element > max)
            max = element
    }

// 11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val l11 = listOf<Int> (12, 832, 1234, 59595, 191, 9921, 22)
    val l11_2 = mutableListOf<Int>()
    for (element in l11) {
        if (element % 2 == 0)
            l11_2.add(element)
    }

// Работа с Множествами Set
// 1. Создайте пустое неизменяемое множество целых чисел.
    val s1 = setOf<Int> ()

// 2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val s2 = setOf<Int> (1, 2, 3)

// 3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val s3 = mutableSetOf<String>("Kotlin", "Jave", "Scala")

// 4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val s4 = mutableSetOf<String>("Kotlin", "Java", "Scala")
    s4.add("Swift")
    s4.add("Go")

// 5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val s5 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    s5.remove(2)

// 6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val s6 = setOf<Int> (1, 2, 4, 6, 12, 1, 2)
    for (element in s6)
        println(element)

// 7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    val s7 = setOf<String> ("All", "work", "and", "no", "play")
    set_fun7(s7, "play")

// 8. Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    val s8 = setOf<String> ("All", "work", "and", "no", "play")
    val s8_1 = mutableListOf<String> ()
    for (element in s8)
        s8_1.add(element)
}

fun arrays_fun8(arg: Array<Int>) {
    var index = 0
    while (index in arg.indices) {
        if (arg[index] == 5) {
            println(index)
            return
        }
        index++
    }
    println(-1)
}

fun arrays_fun10(arg: Array<String>, keyword: String) {
    for (element in arg) {
        if (element.contains(keyword)) {
            println(element)
            return
        }
    }
    println("Element not found")
}

fun set_fun7(arg: Set<String>, keyword: String): Boolean {
    for (element in arg) {
        if (element == keyword) {
            return true
        }
    }
    return false
}