class Hourly_Salaried_Employee(
    name: String,
    val totalHour: Double,
    val hourlyRate: Double = 500.0,
    var projectManager : ProjectManager,
    var project: List<Project>  ) : Employee(name),MedicalAllowance{
    override fun calculateSalary(): Double = totalHour*hourlyRate
    override fun payMedicalAllowance() {
        println("Paying Medical Allowance To Mr.$name")
    }

    override fun toString(): String {
        return "Hourly_Salaried_Employee(totalHour=$totalHour, hourlyRate=$hourlyRate, projectManager=$projectManager, project=$project)"
    }
}

data class ProjectManager(val managerName: String, val department: String) {
    override fun toString(): String {
        return "ProjectManager(managerName='$managerName', department='$department')"
    }
}

data class Project(val projectName: String, val projectduration: String) {
    override fun toString(): String {
        return "Project(projectName='$projectName', projectduration='$projectduration')"
    }
}