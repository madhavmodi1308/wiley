package jpmorgan.banking.newmodel.User_Address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSort {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();

		List<Address> ad = Arrays.asList(new Address("DEL", "110086"), new Address("BLR", "100072"));
		users.add(new User(1, "Madhav", ad));
		ad = Arrays.asList(new Address("HYD", "123086"), new Address("BLR", "100072"));
		users.add(new User(2, "Akshay", ad));
		ad = Arrays.asList(new Address("HYD", "123086"), new Address("BLR", "100072"));
		users.add(new User(3, "Rohit", ad));

		HashMap<Address, List<User>> hm = new HashMap<>();

		for (User u : users) {
			//			System.out.println(u.addresses);
			for (Address adr : u.addresses) {
				if (!hm.containsKey(adr)) {
					ArrayList<User> ar = new ArrayList<>();
					ar.add(u);
					hm.put(adr, ar);
				} else {
					hm.get(adr).add(u);
				}
			}
		}

		for (Map.Entry<Address, List<User>> e : hm.entrySet()) {
			if (e.getValue().size() >= 2) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}

	}

}

class User {
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
		// TODO Auto-generated method stub
		return city.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.city.equals(((Address) obj).city);
	}
}
