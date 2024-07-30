fun main() {

    val arhive = hashSetOf(Ticket("Головоломка", 12, "12:00"))

    println("⭐ Кинотеатр Барбоса ⭐")
    println("Введите фильм")
    val name = readln()
    println("Введите место")
    val seat = readln().toInt()
    println("Введите время")
    val time = readln()

    arhive.add(Ticket(name, seat, time))

    arhive.add(Ticket("Интерстеллар", 23, "15:00"))
    arhive.add(Ticket("Девять", 56, "9:00"))
    arhive.add(Ticket("Ранго", 65, "22:00"))
    arhive.add(Ticket("Ходячий замок", 41, "18:00"))

    var filmWidth = "Фильм".length
    var seatWidth = "Место".length
    var timeWidth = "Время начала сеанса".length

    for (ticket in arhive) {
        filmWidth = maxOf(filmWidth, ticket.name.length)
        seatWidth = maxOf(seatWidth, ticket.seat.toString().length)
        timeWidth = maxOf(timeWidth, ticket.timeStart.length)
    }

    println("Список проданных билетов:")
    println("╔${"═".repeat(filmWidth + 2)}╦${"═".repeat(seatWidth + 2)}╦${"═".repeat(timeWidth + 2)}╗")
    println(
        "║ ${"Фильм".padStart((filmWidth + 1) / 2 + 1).padEnd(filmWidth)} ║ " +
                "${"Место".padStart((seatWidth + 1) / 2 + 1).padEnd(seatWidth)} ║ " +
                "${"Время начала сеанса".padStart((timeWidth + 1) / 2 + 1).padEnd(timeWidth)} ║"
    )

    println("╠${"═".repeat(filmWidth + 2)}╬${"═".repeat(seatWidth + 2)}╬${"═".repeat(timeWidth + 2)}╣")

    for (ticket in arhive) {
        println(
            "║ ${ticket.name.padEnd(filmWidth)} ║ ${
                ticket.seat.toString().padStart((seatWidth + 1) / 2 + 1).padEnd(seatWidth)
            } ║ ${ticket.timeStart.padStart((timeWidth + 1) / 2 + 1).padEnd(timeWidth)} ║"
        )
    }
    println("╚${"═".repeat(filmWidth + 2)}╩${"═".repeat(seatWidth + 2)}╩${"═".repeat(timeWidth + 2)}╝")
}