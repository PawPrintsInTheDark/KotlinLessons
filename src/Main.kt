fun main() {
    val helicopter = Helicopter()
    helicopter.name = "alligator"
    helicopter.takeoffWeight = 10_800
    helicopter.flightSpeed =  250
    helicopter.maximumFlightAltitude =  5500
    helicopter.build()

    val pet = Pet()
    pet.type = "Кот"
    pet.weight = 6
    pet.alias = "Барсик"
    pet.announce()

    val a = 5.87
    val b : Int = a.toInt()
    println(b)
}



