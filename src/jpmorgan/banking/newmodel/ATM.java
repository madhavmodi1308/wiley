package jpmorgan.banking.newmodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

class user {

	String name, designation, empID;
	double salary;
	int age;

	HashMap<String, Integer> sal = new HashMap<>();

	user() {
		sal.put("Programmer", 30000);
		sal.put("Manager", 40000);
		sal.put("Tester", 25000);
	}
}

public class ATM {

	TreeMap<String, user> users;
	static Scanner sc;
	int count;

	ATM() {
		users = new TreeMap<>();
		boolean isActive = true;
		char yes = 'n';
		count = 0;
		while (isActive) {
			String opt = "-1";
			if (yes == 'y' && count < 10) {
				opt = "1";
				yes = 'n';
			} else {
				if (count >= 10) {
					System.out.println("Reached Max Limit!!\n");
					System.out.println("Want to reset? y/n");
					if (sc.nextLine().charAt(0) == 'y') {
						count = 0;
						users.clear();
						System.out.println("Data Cleared !!");
					}
				}
				System.out.println("Choose an option");
				System.out.println("\n1) Create\n2) Display\n3) Raise\n4) Delete\n5) Exit");
				opt = sc.nextLine();
			}
			switch (opt) {
			case "1":
				if (count >= 10) {
					System.out.println("Can't add more!!");
					break;
				}
				user u = new user();
				u.name = name();
				while (!isValidName(u.name, 2)) {
					System.out.println("Enter a VALID name");
					u.name = name();
				}
				u.designation = desig();
				while (!isValidDesig(u.designation)) {
					System.out.println("Enter a VALID designation");
					u.designation = desig();
				}
				u.salary = u.sal.get(u.designation);
				u.age = age();
				while (!isValidAge(u.age)) {
					System.out.println("Enter a VALID age");
					u.age = age();
				}
				if (count < 9)
					u.empID = "wil" + ((count < 9) ? "0" : "") + (count + 1);
				users.put(u.empID, u);
				System.out.println("Do you want to continue? y/n");
				yes = sc.nextLine().charAt(0);
				count++;
				break;
			case "2":
				if (count == 0) {
					System.out.println("Please create Entry first");
					break;
				}
				display();
				System.out.println();
				break;
			case "3":
				if (count == 0) {
					System.out.println("Please create Entry first");
					break;
				}
				String id = getId();
				while (!isValidEmpId(id)) {
					System.out.println("Cannot find any user...Wrong ID!!");
					id = getId();
				}
				double percent = getRaise();
				while (!isValidIncrement(percent)) {
					System.out.println("Max upto 30. Enter the percentage Again: ");
					percent = getRaise();
				}
				users.get(id).salary += (users.get(id).salary * percent) / 100;
				System.out.println(users.get(id).name + "'s" + " updated Salary: " + users.get(id).salary);
				break;
			case "4":
				if (count == 0) {
					System.out.println("Please create Entry first");
					break;
				}
				System.out.println("Enter Employee Id: \neg. " + users.keySet());
				String id1 = sc.nextLine();
				while (!isValidEmpId(id1)) {
					System.out.println("Wrong ID!! Enter Employee Id: (eg. wil01,wil02....)");
					id1 = sc.nextLine();
				}
				users.remove(id1);
				System.out.println("User: " + id1 + " deleted successfully!!");
				count--;
				break;

			case "5":
				isActive = false;
				System.out.println("Logging out.....");
				break;
			default:
				System.out.println("Enter a valid choice");
			}
		}
	}

	private double getRaise() {
		System.out.println("Enter the percentage(%) to be Raised: (max : 30) ");
		return Double.parseDouble(sc.nextLine());
	}

	private String getId() {
		System.out.println("Enter Employee Id: \n( eg. " + users.keySet() + ".... )");
		return sc.nextLine();
	}

	private boolean isValidIncrement(double percent) {

		// TODO Auto-generated method stub
		return (percent <= 30);
	}

	private boolean isValidEmpId(String id) {
		if (users.containsKey(id))
			return true;
//		System.out.println("No such Employee found");
		return false;
	}

	private int age() {
		System.out.println("Enter Age: ");
		int age = -1;
		try {
			age = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Age must be a number");
		}
		return age;
	}

	private boolean isValidAge(int age) {
		if (age >= 18 && age <= 60)
			return true;
		return false;
	}

	private String desig() {
		System.out.println("Enter Desig: Programmer/Manager/Tester");
		return sc.nextLine();
	}

	private boolean isValidDesig(String desig) {
		String[] posts = { "Programmer", "Manager", "Tester" };
		for (String post : posts)
			if (post.equals(desig))
				return true;
		return false;
	}

	private String name() {
		System.out.println("Enter Name: ");
		return sc.nextLine();
	}

	private boolean isValidName(String name, int count) {
		for (char c : name.toCharArray()) {
			if (Character.isWhitespace(c))
				count--;
			if (count < 0) {
				return false;
			}
		}
		return true;
	}

	void display() {
		if (users.isEmpty()) {
			System.out.println("!! Nothing to Display !!");
			return;
		}
		// System.out.println(this.name +"\n"+ this.designation+"\n"+this.salary);
		for (user u : users.values()) {
			System.out.println("\tEmployeeId: " + u.empID + "\n\n" + "Name: " + u.name + "\t" + "Job: " + u.designation
					+ "\n" + "Age: " + u.age + "\t\t" + "Salary: " + u.salary + "\n");
			System.out.println("__________________________________");
		}
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ATM users = new ATM();
	}

}
//				System.out.println("Enter Name: ");
//				String name = sc.nextLine();
//				if(!isValidName(name,2)) {
//					System.out.println("Wrong name");
//					System.out.println("Do you want to change? y/n");
//					yes = sc.nextLine().charAt(0);
//					if(yes=='y') count++;
//					break;
//				}
//				else {
//					System.out.println("Enter Desig: Programmer/Manager/Tester");
//					String desig = sc.nextLine();
//					if(!isValidDesig(desig)) {
//						System.out.println("Not Recoganised");
//						System.out.println("Do you want to continue? y/n");
//						yes = sc.nextLine().charAt(0);
//						if(yes=='y') count++;
//						break;
//					}
//					this.name = name;
//					this.designation = desig;
//					System.out.println("Enter Salary: ");
//					this.salary = Integer.parseInt(sc.nextLine());
//				}
//				count = 0;
//				break;

//jhcahadbc
//Tester
//25
//y