class Commissioned_Salaried_Employee(
    name: String,
    val salary: Double,
    val totalSale: Double,
    val commissionRate: Double = 2.5) : Employee(name),FoodAllowance,MedicalAllowance,TransportAllowance {
    override fun calculateSalary(): Double = salary+((totalSale*commissionRate)/100)
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



//class CommissionedSalariedEmployee(
//    name: String,
//    val salary: Double,
//    val totalSale: Double,
//    val commissionRate: Double = 2.5
//) : Employee(name) , FoodAllowance, MedicalAllowance{
//    override fun calculateSalary() = salary +((totalSale * commissionRate) / 100)
//    override fun payFoodAllowance() {
//        println("Pay food allowance to $name")
//    }
//
//    override fun payMedicalAllowance() {
//        println("Pay medical allowance to $name")
//    }
//}