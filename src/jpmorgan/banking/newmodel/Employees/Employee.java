package jpmorgan.banking.newmodel.Employees;

public class Employee extends User {
	
	Address address;
	Project project;
	double salary;

//	Employee() {
//		
//	}
	Employee(String id, String n,Project p, Address a, double s){
		super(id, n);
		this.address = a;
		this.project = p;
		this.salary = s;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
