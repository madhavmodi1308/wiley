package jpmorgan.banking.newmodel;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("wil01".substring(0,3));
	
		
		String s1 = new String("Madhav");
		s1.concat("Modi");
		
		String s2 = "Madhav";
		s2.concat("Modi");
		
		String s3 = "Madhav";
		
		System.out.println(s1==s3);
		System.out.println(s2==s3);
	}

}
