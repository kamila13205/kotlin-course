package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

// Мероприятие: концерт. Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
// Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте
// и метод “купить билет”, который увеличивает количество проданных билетов на один.

class Concert (
    val band: String,
    val place: String,
    val price: Int,
    val capacity: Int,
    private var ticketsSold: Int = 99
) {

    fun info() {
        println("$band concert will be held at $place, ticket price is $price, capacity is $capacity")
        println("${capacity - ticketsSold} tickets left")
    }

    fun buyTicket() {
        if (ticketsSold < capacity) {
            ticketsSold++
            println("Ticket sent to email")
        } else {
            println("No more tickets available")
        }
    }

}