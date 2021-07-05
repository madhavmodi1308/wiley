package jpmorgan.banking.newmodel;

public class FirstCode {
	
//	instance block
	static int d = 10;
	static{
		System.out.println("In static block");
	}
	{
		System.out.println("In Instance block");
	}
	static{
		System.out.println("In static block2");
	}

	void add() {
		System.out.println("adding the numbers");
	}
	double CtoF(int c) {
		return (c*9/5)+32;
	}

	double FtoC(int f) {
		return (f-32) * 5/9;
	}

	public static void main(String[] args) {
		
		for(String s : args) {
			System.out.println(s);
		}
		// TODO Auto-generated method stub
//		FirstCode obj = new FirstCode();
//		obj.add();
//		System.out.println(obj.CtoF(80));
		
//		FirstCode obj = new FirstCode();

	}

}
