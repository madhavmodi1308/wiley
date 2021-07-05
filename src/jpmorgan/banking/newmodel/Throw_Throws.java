package jpmorgan.banking.newmodel;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Throw_Throws extends Thread {
	
	public static float divide(int a,int b) throws Exception {
		if(b==0) {
			throw new Exception("division error");
		}
		else return a/b;
	}

	public static void main(String[] args) {
		
		try {
			float a = divide(10,5);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Reached at the end");
		}
	}

}
