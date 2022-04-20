
val managerList = listOf<ProjectManager>(
    ProjectManager(managerName = "Muhid", department = "Ai"),
    ProjectManager(managerName = "Fahim", department = "Game"),
    ProjectManager(managerName = "Khan", department = "Tour"),
    ProjectManager(managerName = "Mahe", department = "Ride")
)

val projectList = mapOf(
    "Muhid" to listOf<Project>(
        Project(projectName = "Project01", projectduration = "3 months"),
        Project(projectName = "Project02", projectduration = "6 months"),
        Project(projectName = "Project03", projectduration = "4 months"),
        Project(projectName = "Project04", projectduration = "5 months"),
        Project(projectName = "Project05", projectduration = "9 months"),
    ),
    "Fahim" to listOf<Project>(
        Project(projectName= "Project01", projectduration = "6 months"),
        Project(projectName = "Project02", projectduration = "4 months"),
    ),
    "Khan" to listOf<Project>(
        Project(projectName = "Project01", projectduration = "3 months"),
        Project(projectName = "Project02", projectduration = "7 months"),
        Project(projectName = "Project03", projectduration = "5 months"),
    ),
    "Mahe" to listOf<Project>(
        Project(projectName = "Project01", projectduration = "3 months"),
        Project(projectName = "Project02", projectduration = "1 months"),
        Project(projectName = "Project03", projectduration = "4 months"),
        Project(projectName = "Project04", projectduration = "5 months")
    ),


    )