package jpmorgan.banking.newmodel.User_Address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserSort {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();

		List<Address> ad = Arrays.asList(new Address("DEL", "110001"), new Address("BLR", "560002"),new Address("BLR", "560001"));
		users.add(new User(1, "Madhav", ad));
		ad = Arrays.asList(new Address("BLR", "560038"), new Address("DEL", "110096"), new Address("DEL", "110001"));
		users.add(new User(2, "Akshay", ad));
		ad = Arrays.asList(new Address("BOM", "400018"),new Address("BOM", "400037"),new Address("DEL", "110001"), new Address("BLR", "560001"));
		users.add(new User(3, "Rohit", ad));

		HashMap<Address, Set<User>> hm = new HashMap<>();

		for (User u : users) {
			//			System.out.println(u.addresses);
			for (Address adr : u.addresses) {
				if (!hm.containsKey(adr)) {
					Set<User> ar = new TreeSet<>();
					ar.add(u);
					hm.put(adr, ar);
				} else {
					hm.get(adr).add(u);
				}
			}
		}
		
		for (Map.Entry<Address, Set<User>> e : hm.entrySet()) {
//			if (e.getValue().size() >= 2) {
				System.out.println(e.getKey() + " " + e.getValue());
//			}
		}
		System.out.println("-------------------");
		Set<record> list = new TreeSet<record>();
		
		for (Map.Entry<Address, Set<User>> e : hm.entrySet()) {
				list.add(new record(e.getKey(),e.getValue()));
		}
		
		list.stream().forEach(i -> System.out.println(i));

	}

}

class record implements Comparable<record>{
	Address address;
	Set<User> users;
	
	record(Address ad, Set<User> u){
		this.address = ad;
		this.users = u;
	}
	@Override
	public int compareTo(record o) {
		// TODO Auto-generated method stub
		return o.users.size()-this.users.size();
	}
	@Override
	public String toString() {
		return this.address+" "+this.users;
	}
	
}

class User implements Comparable<User>{
	int id;
	String name;
	List<Address> addresses;

	User(int id, String name, List<Address> ad) {
		this.addresses = ad;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + this.id + " " + this.name + "}";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}

class Address{
	String city, zip;

	Address(String city, String zip) {
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.city + " " + this.zip;
	}

	@Override
	public int hashCode() {
		return zip.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.zip.equals(((Address) obj).zip);
	}

}
