package jpmorgan.banking.newmodel;

import java.util.Iterator;
import java.util.TreeSet;

class identity implements Comparable<identity>{
	String name;
	String empID;
	int salary;
	identity(String n, String id, int s){
		this.name = n;
		this.empID = id;
		this.salary = s;
	}
	@Override
	public int compareTo(identity o) {
		return this.name.compareTo(o.name);
	}
	
}

public class Collection_framework {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TreeSet<identity> ts = new TreeSet<>();
		ts.add(new identity("madhav","wil1",25000));
		ts.add(new identity("tushar","wil2",50000));
		ts.add(new identity("riya","wil3",25000));
		ts.add(new identity("mazvcv","wil4",30000));
		
//		Iterator<identity>ts.iterator()
		
//		Iterator<identity> it = new<>(); 
		
		System.out.println(ts.size());
		
	}

}
