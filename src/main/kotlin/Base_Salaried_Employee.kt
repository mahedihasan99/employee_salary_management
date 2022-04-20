class Base_Salaried_Employee(
        name: String,
        var salary: Double):Employee(name),FoodAllowance,MedicalAllowance,TransportAllowance{
        override fun calculateSalary(): Double = salary
        override fun payFoodAllowance() {
                println("Paying Food Allowance To Mr.$name")
        }

        override fun payMedicalAllowance() {
                println("Paying Medical Allowance To Mr.$name")
        }

        override fun payTransportAllowance() {
                println("Paying Transport Allowance To Mr.$name")
        }
}
