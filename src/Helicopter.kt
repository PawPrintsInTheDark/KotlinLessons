class Helicopter {
    var name = "undefined"
    var takeoffWeight = 0
    var flightSpeed = 0
    var maximumFlightAltitude  = 0

    fun build(){
        println("Спроектировали вертолет с названием $name, скоростью полета $flightSpeed km/h, весом $takeoffWeight кг, высотой полета $maximumFlightAltitude м")
    }
}