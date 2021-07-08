package jpmorgan.banking.newmodel.ClassTask_TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UserSet {

	public static void main(String[] args) {

		Set<Type> custom1 = new TreeSet<Type>(new sort3());

		custom1.add(new Type(new Integer(10)));
		custom1.add(new Type(new User(1, "User1")));

		custom1.add(new Type("Hi"));
		custom1.add(new Type(new Integer(4)));
		custom1.add(new Type("Hello"));
		custom1.add(new Type(new User(2, "Adam")));

		custom1.forEach(System.out::println);
		
	}

}

class User {
	private int id;
	private String name;

	public User(){

	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{"+this.id+", "+this.name+"}";
	}

	@Override
	public int hashCode() {
		return this.getId();
	}
}


