package org.example.ru.stimmax.kotlincourse.lessons.lesson03
import com.sun.jdi.IntegerType
import java.security.KeyStore

class Hackathon {
    // 1. Название мероприятия
    val eventName: String = "Hackathon Survival"

    // 2. Дата проведения
    val eventDate: String = "15.09.2025"

    // 3. Место проведения
    val eventPlace: String = "Moscow"

    // 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    private var budgetDetailed: Int = 100500

    // 5. Количество участников
    var paeticipantsTotal: Int = 100

    // 6. Длительность хакатона
    var duration: Int = 3

    // 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    private var contactInfo: String = "contact"

    // 8. Текущее состояние хакатона (статус)
    var hackathonStatus: String = "Delayed"

    // 9. Список спонсоров
    private var sponsorsList: String = "sponsors"

    // 10. Бюджет мероприятия
    private var budget: Int = 100500

    // 11. Текущий уровень доступа к интернету
    var connectionStatus: String = "OK"

    // 12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    private var trnasportResources: String = "information"

    // 13. Количество команд
    var teams: Int = 20

    // 14. Перечень задач
    var tasksToDo: String = "Write code"

    // 15. План эвакуации
    val evacuationPlan: String = "run"

    // 16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
    private val equipmentTotal: String = "Computers"

    // 17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
    var equipmentAvailable: String = "Keyboard"

    // 18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    lateinit var food: String

    // 19. План мероприятий на случай сбоев
    var emergencyPlan: String = "DoNothing"
        get() {
            return if (connectionStatus == "OK") field else "Fix internet"
        }
        private set(value) {}

    // 20. Список экспертов и жюри
    val experts: String = "Alexander"

    // 21. Политика конфиденциальности
    val policies: String = "policy"

    // 22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    private var feedback: String = "Everything's okay"

    // 23. Текущая температура в помещении
    var temperature: Int = 16

    // 24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
    val connectionReport: String by lazy {
        "Some info about connection"
    }

    // 25. Регулятор скорости интернета (понижающий коэффициент, например 0.5)
    var connectionRegulator: Double = 0.55

    // 26. Уровень освещения
    var lightLevel: Int = 50

    // 27. Лог событий мероприятия
    var eventLog: String = "Event started"

    // 28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)
    val medicsAvailable: Boolean = true

    // 29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    private val emergencyPlanPrivate: String by lazy {
        "RUN"
    }

    // 30. Регистрационный номер мероприятия
    private val registryNumber: Int = 10

    // 31. Максимально допустимый уровень шума в помещении хакатона.
    val noiseLevel: Int = 100

    // Какой уровень шума сейчас
    var noiseRightNow: Int = 200

    // 32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
    var noiseLevelExceed: Boolean = false
        get() {
            return if (noiseRightNow > noiseLevel) true else false
        }

    // 33. План взаимодействия с прессой
    private val pressInteraction: String = "plan"

    // 34, Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    lateinit var teamsProjects: String

    // 35. Статус получения всех необходимых разрешений для проведения мероприятия
    private var permissions: Boolean = false

    // 36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
    var specialEquipmentAvailable: Boolean = true

    // 37. Список партнеров мероприятия
    val partnersList: String = "partners"

    // 38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    lateinit var photoReport:  String

    // 39. Внутренние правила распределения призов
    private val prizeSelection: String = "prize"

    // 40. Список разыгрываемых призов
    var prizes: String = "Automobile"

    // 41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
    private val emergencyContact: Int = 112

    // 42. Особые условия для участников с ограниченными возможностями
    val specialRules: String = "rules"

    // 43. Общее настроение участников (определяется опросами)
    lateinit var mood: String

    // 44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
    lateinit var hackathonPlan: String

    // 45, Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
    lateinit var specialGuest: String

    // 46. Максимальное количество людей, которое может вместить место проведения.
    private val maxPeople: Int = 100

    // 47. Количество часов, отведенное каждой команде для работы над проектом.
    val hours: Int = 5
}

