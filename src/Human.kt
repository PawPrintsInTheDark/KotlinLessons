class Human(val name: String, val age: Int) {

    fun live() {
        println("Человек с именем $name и возрастом $age лет живёт своей счастливой жизнью")
    }

    inner class head(vararg var thoughts: String) {
        fun think() {
            println("У $name в голове ходят мысли: ${contentToString(thoughts)}")
        }

        fun <T> contentToString(arr: Array<T>): String {
            return arr.joinToString(", ") { "\"$it\"" }
        }

    }

    inner class leg(val side: String) {
        fun move(){
            println("$side нога движется")
        }
    }

    inner class arm(val side: String) {
        fun move(){
            println("$side рука движется")
        }
    }

    inner class torso {

        fun exists(exists : Boolean){
            if (exists) println("Торс $name существует") else println("Извините, мы забыли добавить торс для человека $name")
        }

        inner class Organs(){
            fun isWorking(){
                if (age < 100) println("Органы работают") else println("В таком возрасте органы возможно работают, ну тут 50 на 50")
            }
        }
    }
}