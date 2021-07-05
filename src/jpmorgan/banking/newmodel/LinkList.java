package jpmorgan.banking.newmodel;

class node{
	int data;
	node next;
	node prev;
	node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}

public class LinkList {
	static node head, tail;
	int size;
	
	public static void add(int d) {
		node cur = new node(d);
		if(head==null) {
			head = cur;
			tail = cur;
		}
		else {
			cur.prev = tail;
			tail.next = cur;
			tail = cur;
		}
	}
	public static int remove() {
		if(tail==null) {
			System.out.println("List is empty");
			return -1;
		}
		int val = tail.data;
		tail = tail.prev;
		tail.next = null;
		
		return val; 
	}
	public static int get(int idx) {
		if(idx>)
		int count = 0;
		node temp  = head;
		while(count!=idx) {
			temp  = temp.next;
			count++;
		}
		return temp.data;
	}
	public static void display(){
		node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll = new LinkList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println(ll.get(2));
//		ll.display();
//		ll.remove();
//		ll.display();
	}

}
