package org.example.ru.stimmax.kotlincourse.lessons.lesson04

val v1 = 42
val v2 = 98765432123456789L
val v3 = 23.45f
val v4 = 0.123456789
val v5 = "Kotlin & Java"
// капс
// val v6 = false
// val v6 = FALSE
val v7 = 'c'
val v8 = 500
val v9 = 4294967296L
val v10 = 18.0f
val v11 = -0.001
val v12 = "OpenAI"
val v13 = "true"
val v14 = listOf(3, 14)
val v15 = '9'
val v16 = 2048
val v17 = 10000000000L
val v18 = setOf("OpenAI", "Quantum Computing")
val v19 = 5.75f
// Строка в char
// val v20 = 1.414
// val v20 = "1.414"
//val v20 = `1.414`
val v21 = "Artificial Intelligence"
// Должны использовать один и тот же тип в массиве, или char или string
// val v22 = arrayOf('x', "A")
val v23 = "Android Studio"
val v24 = '@'
val v25 = 1024
val v26 = 1234567890123L
val v27 = 10.01f
val v28 = -273.15
val v29 = "SpaceX"
// false
//val v30 = FALSE
val v31 = 0.007
// не UTF кодировка ?
//val v32 = “🤯”
val v33 = mapOf("true" to 2, "false" to 34)
// строка в char, должно быть или Int или String
//val v34 = ‘65535’
val v35 = 72057594037927935L
val v36 = 2.71828f
val v37 = 101.0101
val v38 = "Quantum Computing"
// true и false в этом мапе будут строками, а не булевыми значениями
//val v39 = mapOf(2 to "true", 34 to "false")
val v40 = 'x'
val v41 = 314
val v42 = 123456789123456789L
val v43 = 6.626f
// true
//val v44 = TRUE


// 1. Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
val finger: Char = 'A'
// 2. Хранить количество ложек сахара, которые я кладу в одну чашку чая.
val spoons: Byte = 1
// 3. Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
var foods: List<Map<String, Int>> = listOf(
    mapOf("булка" to 120),
    mapOf("каша" to 100)
)
// 4. Хранить длину очереди в столовой до миллиардной доли сантиметра.
var queueLength: Double = 14.5632
// 5. Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
var bugStatus: Boolean = true
// 6. Хранить количество свистков чайника за день.
var whistleCount: Byte = 0
// 7. Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
var keyPress: Long = 1_234_567L
// 8. Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
var starsCount: Long = 1_234_567L
// 9. Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
var airMass: Float = 0.57F
// 10. Хранить словарь «название стартапа → сумму потерь инвесторов».
var startuo: Map<String, Long> = mapOf(
    "Ozon" to 100500L,
    "Avito" to 200500L
)
// 11. Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
val fixed: String = "Починилось само"
// 12. Хранить список тем для митингов, которые на самом деле никому не нужны.
var meetingTopics: Set<String> = setOf(
    "Better planning",
    "Requirements update"
)
