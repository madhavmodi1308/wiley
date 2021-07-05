package jpmorgan.banking.newmodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class u{
	int salary;
	String address,name;
	u(int s, String a, String name){
		this.salary = s;
		this.address  =a;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class userSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		u u1 = (u) o1;
		u u2 = (u) o2;
		if((u1.salary - u2.salary) !=0) return u2.salary - u1.salary;
		return u1.address.compareTo(u2.address);
	}
	
}

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<u> li= new ArrayList<>();
		li.add(new u(1000,"BOM","E1"));
		li.add(new u(1200,"DEL","E2"));
		li.add(new u(1000,"BLR","E3"));
		
		Collections.sort(li,new userSort());
		
		System.out.println(li);

	}

}
