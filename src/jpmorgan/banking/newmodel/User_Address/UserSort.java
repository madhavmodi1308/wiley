package jpmorgan.banking.newmodel.User_Address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserSort {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();

		List<Address> ad = Arrays.asList(new Address("DEL", "110001"), new Address("BLR", "560002"),
				new Address("BLR", "560001"));
		users.add(new User(3, "Madhav", ad));
		ad = Arrays.asList(new Address("BLR", "560038"), new Address("DEL", "110096"), new Address("DEL", "110001"));
		users.add(new User(1, "Akshay", ad));
		ad = Arrays.asList(new Address("BOM", "400018"), new Address("BOM", "400037"), new Address("DEL", "110001"),
				new Address("BLR", "560001"));
		users.add(new User(2, "Rohit", ad));

		HashMap<Address, Set<User>> hm = new HashMap<>();

		for (User u : users) {
			// System.out.println(u.addresses);
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

//		for (Map.Entry<Address, Set<User>> e : hm.entrySet()) {
//			System.out.println(e.getKey() + " " + e.getValue());
//		}
//		System.out.println("-------------------");
		
		List<record> list = new ArrayList<record>();

		for (Map.Entry<Address, Set<User>> e : hm.entrySet()) {
			list.add(new record(e.getKey(), e.getValue()));
		}
//		Collections.sort(list, (i,j) -> j.users.size()-i.users.size());
		Collections.sort(list,new sort());
		list.stream().forEach(i -> System.out.println(i));

	}

}

class record
{
	Address address;
	Set<User> users;

	record(Address ad, Set<User> u) {
		this.address = ad;
		this.users = u;
	}

	@Override
	public String toString() {
		return this.address + " " + this.users;
	}

}

class sort implements Comparator<record>{

	@Override
	public int compare(record o1, record o2) {
		// TODO Auto-generated method stub
		if(o1.users.size()!=o2.users.size()) {
			return o2.users.size()-o1.users.size();
		}
		else {
			if(o1.address.city.compareTo(o2.address.city)!=0){
				return o1.address.city.compareTo(o2.address.city);
			}
			else return o1.address.zip.compareTo(o2.address.zip);
		}
	}
	
}

class User implements Comparable<User> {
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
		return this.id - o.id;
	}
}

class Address {
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
