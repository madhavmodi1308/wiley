package jpmorgan.banking.newmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class key{
	String id;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return 1;
	}
}
public class Pallindrome {
	public static boolean checkNum(String s) {
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) return false;
		}
		return true;
	}
	static boolean isPalindrome(String str)
	{
	    int i = 0, j = str.length() - 1;
	    while (i < j) {
	        if (str.charAt(i) != str.charAt(j))
	            return false;
	        i++;
	        j--;
	    }
	    return true;
	}
	public static void main(String[] args) {
		
		HashMap mp = new HashMap();
		key k = new key();
		k.id = "one";
		mp.put(k.id, 1);
		k.id = "two";
		mp.put(k.id, 2);
		k.id = "Three";
		mp.put(k.id, 3);
//		mp.put(new key(), 2);
//		mp.put(new key(), 3);
		
		System.out.println(mp);
//		System.out.println(nums);
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		if(checkNum(s) && isPalindrome(s)) 
//			System.out.println("Number is Pallindrome");
//		else if(!checkNum(s) && isPalindrome(s))
//			System.out.println("String is pallindrome");
//		else if(!isPalindrome(s))
//			System.out.println("Not pallindrome");
	}

}
