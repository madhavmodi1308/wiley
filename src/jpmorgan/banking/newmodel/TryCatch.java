package jpmorgan.banking.newmodel;

import java.util.ArrayList;
import java.util.Iterator;

class test{
	int num;
}

public class TryCatch {

	public static void main(String[] args) {
		
		test t = null;
		
		ArrayList list = new ArrayList();
	    list.add("one");
	    list.add("two");
	    list.add(1);
	    Iterator it = list.iterator();
	    while (it.hasNext()) {
	    	try {
	    		int i = (int)it.next();
			} catch (Exception e) {
				System.err.println(e);
			}
	    }
		
	}
	


}
