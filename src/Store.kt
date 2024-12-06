interface Store {
    fun sellPhone(phone: Phone)
    fun getStatistics(): String
    fun offerRepair(): Boolean
}
