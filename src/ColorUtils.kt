class ColorUtils {
    companion object {
        val ANSI_RESET: String = "\u001B[0m"
        val ANSI_BLACK: String = "\u001B[30m"
        val ANSI_RED: String = "\u001B[31m"
        val ANSI_GREEN: String = "\u001B[32m"
        val ANSI_YELLOW: String = "\u001B[33m"
        val ANSI_BLUE: String = "\u001B[34m"
        val ANSI_PURPLE: String = "\u001B[35m"
        val ANSI_CYAN: String = "\u001B[36m"
        val ANSI_WHITE: String = "\u001B[37m"

        const val ANSI_BLACK_BACKGROUND: String = "\u001B[40m"
        const val ANSI_RED_BACKGROUND: String = "\u001B[41m"
        const val ANSI_GREEN_BACKGROUND: String = "\u001B[42m"
        const val ANSI_YELLOW_BACKGROUND: String = "\u001B[43m"
        const val ANSI_BLUE_BACKGROUND: String = "\u001B[44m"
        const val ANSI_PURPLE_BACKGROUND: String = "\u001B[45m"
        const val ANSI_CYAN_BACKGROUND: String = "\u001B[46m"
        const val ANSI_WHITE_BACKGROUND: String = "\u001B[47m"
    }
}