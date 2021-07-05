package jpmorgan.banking.newmodel;

public class MultiThreding_Runnable extends Thread {
	
	int a,b;
	public MultiThreding_Runnable(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i =a; i<=b; i++) {
			if(i%2==0) System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
//		MultiThreding_Runnable m1 = new MultiThreding_Runnable();
		MultiThreding_Runnable t1 = new MultiThreding_Runnable(1, 10);
		MultiThreding_Runnable t2 = new MultiThreding_Runnable(11, 20);
		t1.start();
		t1.wait(100);
//		System.out.println(t1.isAlive());
		try {
//			t1.sleep(100);
			t1.interrupt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
//		System.out.println(t1.isAlive());
		System.out.println(t1.isInterrupted());
	}

}
