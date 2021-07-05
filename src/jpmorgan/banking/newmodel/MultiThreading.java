package jpmorgan.banking.newmodel;

//class sample extends Thread{
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
////		super.run();
//	}
//}

public class MultiThreading extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i<15; i++) {
			System.out.println("Second thing");
		}
//		super.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading s1 = new MultiThreading();
		s1.start();
		for(int i = 0; i<15; i++) {
			System.out.println("First thing");
		}
	}

}
