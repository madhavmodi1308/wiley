package jpmorgan.banking.newmodel;

interface i1{
	void m1();
	void m3();
	default void m4() {
		System.out.println("Im in m4- interface");
	}
}

interface i2{
	void m1();
//	default void m4() {
//		System.out.println("Im in m4- interface");
//	}
}

class Interfaces implements i1,i2{

	@Override
	public void m1() {
		System.out.println("Declared in class");
	}
	
	@Override
	public void m3() {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		
		Interfaces i = new Interfaces();
		i.m4();
//		i.m2();
	}

}
