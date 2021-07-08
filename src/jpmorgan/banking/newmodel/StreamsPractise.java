package jpmorgan.banking.newmodel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class StreamsPractise {

	public static void main(String[] args) {
		
//		HashSet set = new HashSet();
//		for(int i = 1; i<=500; i++) {
//			set.add(i);
//		}
//		TreeSet s = new TreeSet();
//		s.add("Madhav");
//		s.add(1);
		System.out.println("Atimal".compareTo("Animal"));
//		set.parallelStream().forEachOrdered(e -> System.out.println(e));
//		// TODO Auto-generated method stub
//		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);
//
////		anonymous class
//		Consumer<Integer> c = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		};
//
//		Consumer<Integer> c1 = t -> System.out.println(t);

//		li.forEach(c);
//		
//		li.forEach(c1);
//
//		li.forEach(i -> System.out.println(i));
		
//		li.forEach(i->doubleIt(i));
//		li.forEach(StreamsPractise::doubleIt);
	}
	
	public static void doubleIt(int i) {
		System.out.println(i*2);
	}

}
