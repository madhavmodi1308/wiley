package jpmorgan.banking.newmodel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class StreamsPractise {

	public static void main(String[] args) {

		//		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);
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

		System.out.println(li.stream()
				.map(i->i*2)
				.reduce(0,(i,j)->i+j)); // lambda

		System.out.println(li.stream()
				.map(i->i*2)
				.reduce(Integer::sum));//method referencing

		li = Arrays.asList(10, 21, 35, 14, 56, 65);

		System.out.println(li.stream()
				.filter(i->i%5==0)
				.map(i->i*2.0)
				.reduce(Double::sum)
				);

		System.out.println(li.stream()
				.filter(i->i%5==0)
				.map(i->i*2)
				.findFirst()
				.orElse(0) // associated with findFirst/findAny
				);
		
		List<Employee1>emp=users.stream().filter(u->u instanceof Employee1).map(u->(Employee1)u).collect(Collectors.toList());
		List<Employee1>emp1=users.stream().filter(u->u instanceof Employee1).map(Employee::new).collect(Collectors.toList());


	}

	public static void doubleIt(int i) {
		System.out.println(i*2);
	}

}
