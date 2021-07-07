package jpmorgan.banking.newmodel.Employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void maxExpense(List<Employee> a, int size, double budget)
    {
        int max_so_far = Integer.MIN_VALUE,
        max_ending_here = 0,start = 0,
        end = 0, s = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here += a.get(i).salary;
 
            if (max_so_far < max_ending_here && max_ending_here<=budget)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
 
            if (max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        for(int i = start;i<=end; i++) {
        	System.out.println(a.get(i).name);
        }
        System.out.println("Maximum Expense: "
                           + max_so_far);
    }

	public static void main(String args[]) {

		List<Project> projects = Arrays.asList(new Project(1, "Google", 11000), new Project(2, "Facebook", 9000),
				new Project(2, "Amazon", 8000));

		for (Project p : projects) {
			List<User> users = new ArrayList<User>();
			users.add(new User("wil01", "Madhav1"));
			
			Address ad = new Address("Assam", "100012");
			users.add(new Employee("wil07", "Madhav7", p, ad, 2200));

			users.add(new User("wil02", "Madhav2"));

			ad = new Address("Sirsa", "125055");
			users.add(new Employee("wil03", "Madhav3", p, ad, 2500));

			users.add(new User("wil04", "Madhav4"));

			ad = new Address("Delhi", "110086");
			users.add(new Employee("wil05", "Madhav5", p, ad, 3500));

			ad = new Address("Jaipur", "180027");
			users.add(new Employee("wil06", "Madhav6", p, ad, 4000));

			int cost = 0;
			double budget = 0;

			List<Employee> emps = new ArrayList<>();

			for (User e : users) {
				if (e instanceof Employee) {
					budget = ((Employee) e).project.budget;
					cost += ((Employee) e).salary;
					emps.add((Employee) e);
				}
			}

			if (cost <= budget) {
				System.out.println(emps);
				System.out.println("-----------------");
			} else {
				Collections.sort(emps,(emp1,emp2)-> (int)(emp2.salary-emp1.salary));
				maxExpense(emps, emps.size(),budget);
				System.out.println("------------------");
			}
//		System.out.println(cost);
		}

	}

}
