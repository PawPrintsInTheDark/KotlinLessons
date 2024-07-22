package phone

open class IPhone(model : String) : Smartphone("Apple",model,"iOS") {
    override fun call(number : String){
        println("Вызов на номер $number с iPhone $model через FaceTime")
    }
}