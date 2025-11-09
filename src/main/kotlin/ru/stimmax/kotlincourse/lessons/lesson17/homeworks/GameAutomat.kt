package org.example.ru.stimmax.kotlincourse.lessons.lesson17.homeworks

// Игровой автомат
// Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var)
// и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)
// Поля: цвет, модель, включен, ОС загружена, список установленных игр, наличие джойстика, баланс вырученных средств,
// владелец, телефон поддержки, игровой сеанс оплачен, стоимость одного игрового сеанса, пин-код автомата


class GameAutomat(
    val color: String,
    val model: String,
    var status: Boolean,
    private var statusOS: Boolean,
    val games: List<String>,
    var joystickAvailable: Boolean,
    private var balance: Int,
    private val owner: String,
    val phone: String,
    var gamePaid: Boolean,
    val gamePrice: Int,
    private var pinCode: String
) {
    // Методы:
    // включить
    fun switchOn() {
        loadOS()
        status = true
    }

    // выключить
    fun switchOff() {
        stopOS()
        status = false
    }

    // загрузить ОС
    private fun loadOS() {
        statusOS = true
    }

    // завершить работу ОС
    private fun stopOS() {
        statusOS = false
    }

    // показать список игр
    fun showGames() {
        println(games)
    }

    // включить игру
    fun gameOn(game: String) {
        if (game in games) {
            println("game $game started")
        } else {
            println("$game not found")
        }
    }

    // оплатить игровой сеанс
    fun payForGame(amount: Int) {
        if (amount > gamePrice) {
            balance += amount
            gamePaid = true
        } else {
            println("Insufficient funds")
        }
    }

    // забрать наличные с помощью пин-кода
    fun withDrawWithPin(pinCode: String, amount: Int): Int {
        if (this.pinCode == pinCode) {
            return openSafebox(amount)
        } else {
            println("Try again")
            return 0
        }
    }

    // открыть сейф и выдать наличные
    private fun openSafebox(amount: Int): Int {
        if (amount >= balance) {
            balance -= amount
            return amount
        } else {
            return 0
        }
    }
}