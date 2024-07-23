class PoliceDepartment(name: String, phone: String) : EmergencyResponseServices(name, phone), Describable {
    override fun activity() {
        println("$name занимается своей работой, сотрудники катаются на машинках и кушают вкуснейшие пончики")
    }

    override fun getDescription() {
        println("Это $name. Она занимается обеспечением правопорядка. Вы можете связаться с нами по телефону $phone")
    }
}