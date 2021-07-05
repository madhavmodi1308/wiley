package jpmorgan.banking.newmodel;


class vehicle{
	int petrol;
	private boolean isMoving;
	
	public int getPetrol() {
		return petrol;
	}

	public void setPetrol(int petrol) {
		this.petrol = petrol;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	void accelerate() {
		System.out.println("Vehicle is accelerating");
	}
}

class bike extends vehicle{
	void accelerate() {
		System.out.println("Bike is accelerating");
	}
}

class car extends vehicle{
	void accelerate() {
		System.out.println("car is accelerating");
	}
	void airConditioner() {
		System.out.println("AC is ON");
	}
}


public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		vehicle v = new car();
		v.setPetrol(20);
		System.out.println(v.getPetrol());
		vehicle v1 = new vehicle();
//		v1.petrol;
//		v.airConditioner();
//		c.accelerate();
//		v.accelerate();
	}

}

//class grandFather{
//	void Eyes() {
//		System.out.println("Have blue eyes");
//	}
//}
//class grandMother{
//	void Eyes() {
//		System.out.println("Have Red eyes");
//	}
//}
//
//class parent extends grandFather, grandMother{
//	void Hair() {
//		System.out.println("Have Brown Hairs");
//	}
//}
//
//class child extends parent{
//	void moleOnChin() {
//		System.out.println("Have a Mole");
//	}
//	void Hair() {
//		System.out.println("Have Black hairs");
//	}
//}
