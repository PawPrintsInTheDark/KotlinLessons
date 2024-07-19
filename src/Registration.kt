class Registration (private val email: String){

    private var password: String = ""

    fun getEmail()= email.uppercase()
    fun setPassword(pass : String) = if (pass.length >= 6) password = pass else println("Длина пароля должна быть не менее 6 символов!")
    fun getPassword() = password
}