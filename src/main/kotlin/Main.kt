import Employee.*
import java.util.Scanner
//Md Mahedi Hasan
//0400034063

var scanner = Scanner(System.`in`)
fun main() {
    println("Please type a Manager Name Below: ")
    var managerName = scanner.nextLine()
    var manager: ProjectManager =managerList.first{
        it.managerName == managerName
    }
    println()
    val projlist = projectList.get(managerName)
    val bse1 = Base_Salaried_Employee("Mahedi",85000.0)
    val bse2 = Base_Salaried_Employee("Imrul",81000.0)
    val bse3 = Base_Salaried_Employee("Jahid",74000.0)
    val hse1 = Hourly_Salaried_Employee("Hasan",130.0,520.50, projectManager = manager, project = projlist!!)
    val hse2 = Hourly_Salaried_Employee("Fahim",167.0,520.50, projectManager = manager, project = projlist)
    val cse1 = Commissioned_Salaried_Employee("Hadi",50000.0,3024.0,8.50)
    val cse2 = Commissioned_Salaried_Employee("Kalfan",530000.0,4709.0,8.50)
    val employeelist: ArrayList<Employee> = arrayListOf(bse1,bse2,bse3,hse1,hse2,cse1,cse2)
    for (employee in employeelist){
        println("Mr.${employee.name} your salary: ${employee.calculateSalary()}" )
    }

    println()
    println(hse1)
    println(hse2)
    println()
    for (employee in employeelist){
        if (employee is FoodAllowance){
            employee.payFoodAllowance()
        }
        if (employee is MedicalAllowance){
            employee.payMedicalAllowance()
        }
        if (employee is TransportAllowance){
            employee.payTransportAllowance()
        }
    }

}
interface FoodAllowance{
    fun payFoodAllowance()
}

interface MedicalAllowance{
    fun payMedicalAllowance()
}

interface TransportAllowance{
    fun payTransportAllowance()
}