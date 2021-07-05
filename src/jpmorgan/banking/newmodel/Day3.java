package jpmorgan.banking.newmodel;

import java.util.Scanner;

class parent{
	parent(){
		System.out.println("Parents 1");
	}
	parent(int a){
		System.out.println("Parents 2");
	}
	void m1(int a) {
		System.out.println("IN PARENT M1");
	}
}

public class Day3 extends parent{
	
	Day3(){
		super();
//		super(1);
		System.out.println("Child");
	}
	
	int a = 10 ,b = 20;
	private String name, id;
	
	void m1() {
		System.out.println("In CHILD M1");
	}
	
	void m2() {
		System.out.println("IN CHILD m2");
	}
	void m3() {
		m1(10);
	}
	
//	public Day3(String n, String id){
//		this.name = n;
//		this.id = id;
//		this.display(n,id);
//	}
	private void display(String n, String id) {
		
		System.out.println(this.name+"\n"+this.id);
	}
//	public Day3(int a, int b){
//		System.out.println(a+b);
//	}
//	
//	void m1(int a, int b) {
//		sop(a,b);
//		sop(this.a ,this.b);
//	}

//	private void sop(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println(i+j);
//	}

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Name:");
//		String name = sc.nextLine();
//		System.out.println("Enter Id:");
//		String id = sc.nextLine();
		// TODO Auto-generated method stub
//		Day3 obj = new Day3(name,id);
//		obj.m1(3,4);
		Day3 obj = new Day3();
//		obj.m3();
	}

}
