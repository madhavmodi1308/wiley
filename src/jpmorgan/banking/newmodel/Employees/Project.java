package jpmorgan.banking.newmodel.Employees;

public class Project {
	private int projectID;
	String projectName;
	double budget;
	
	Project(int id, String name, double b){
		this.projectID = id;
		this.projectName = name;
		this.budget = b;
	}

}
