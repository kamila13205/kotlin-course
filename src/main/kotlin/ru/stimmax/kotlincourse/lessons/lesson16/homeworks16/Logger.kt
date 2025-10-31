// Класс “Логгер”: представляет из себя инструмент для вывода информации в консоль с разным префиксами
// уровня логирования (INFO, WARNING, ERROR, DEBUG)
// Базовый метод log(message) выводит в консоль сообщение message с префиксом INFO
// Выполнить перегрузку метода log, который:
// Принимает уровень логирования и сообщение. Выводит сообщения типа WARNING жёлтым цветом,
// а ERROR белым цветом на красном фоне.
// Принимает список сообщений и все их выводит с уровнем INFO
// Принимает объект типа Exception и выводит его поле message с префиксом уровня ERROR
// Попробуй создать логгер и добавить в него сообщения разными способами. Проверь вывод в консоли.

package org.example.ru.stimmax.kotlincourse.lessons.lesson16.homeworks16

class Logger {
    fun log(message: String) {
        println("INFO $message")
    }

    fun log(level: String, message: String) {
        when (level) {
            "INFO" -> log(message)
            "DEBUG" -> println("DEBUG ${message}")
            "WARNING" -> printColored("WARNING $message", Colors1.YELLOW)
            "ERROR" -> printColored("ERROR $message", Colors1.WHITE, Colors1.BG_RED)
            else -> println("Incorrect level")
        }
    }

    fun log(messages: List<String>) {
        messages.forEach { log("INFO", it) }
    }

    fun log(e: Exception) {
        log("ERROR", e.message.toString())
    }
}

fun main() {
    val logger = Logger()

    logger.log("Tet started")
    logger.log("WARNING", "Unstable connection")
    logger.log("ERROR", "Remote connection cannot be established")
    logger.log("DEBUG", "Switched to snapshot")
    logger.log(listOf("Step 1", "Step 2", "Step 3"))
    logger.log(Exception("Sth bad happened. Panic!"))
}