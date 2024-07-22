class Dog (type: String = "", weight: Int = 0) : Animal(type, weight){
    fun bark(){
        println("$type гавкает")
    }
}