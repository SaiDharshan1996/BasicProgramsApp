package data_structures;

public class LinkedList {
	Node head = null, currentnode = null;

	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			currentnode = n;
		} else {
			currentnode.nextnode = n;
			currentnode = n;
		}
	}
	void  remove(int d) {
	Node t = null;
	Node n=head;
	while(n!=null) {
		if(head.data==d) {
			head=head.nextnode;
			break;
			
		}
		if(n.data==d) {
			t.nextnode=n.nextnode;
			break;
		}
		t=n;
		n=n.nextnode;
	}

			
		}

	void display() {
		Node n = head;
		while (n!= null) {
			System.out.println(n.data);
			n = n.nextnode;
			
		}
	} 
	
	/*void display() {
		Node n=currentnode;
		while(n!=null) {
			System.out.println(n);
			n.nextnode=n;
		}
	}*/
	int size() {
		int size=0;
		Node n=head;
		while(n!=null) {
			size++;
			n=n.nextnode;
		}
		return size;
	}
	
	int max() {
		int max=head.data;
		Node n=head;
		while(n!=null) {
			if(n.data>max) {
				max=n.data;
			}
			n=n.nextnode;
		}
		return max;
	}
	
	int min() {
		int min=head.data;
		Node n=head;
		while(n!=null) {
			if(n.data<min) {
				min=n.data;
			}
			n=n.nextnode;
		}
		return min;
	}
	
	
	
	
	
	
	
	
}
