class Box(val width : Int, val height : Int, val depth : Int) {
    fun getVolume() : Int{
        return width*height*depth
    }
}