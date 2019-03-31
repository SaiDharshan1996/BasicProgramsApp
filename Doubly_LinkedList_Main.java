package data_structures;

public class Doubly_LinkedList_Main {
public static void main(String[] args) {
	Doubly_LinkedList dl=new Doubly_LinkedList();
	dl.add(12);
	dl.add(23);
	dl.add(20);
	dl.add(34);
	dl.add(40);
	dl.add(56);
	dl.add(1);
	dl.add(99);
	System.out.println("Elements");
	dl.display();
	dl.remove(20);
	dl.remove(12);
	System.out.println("After Removing");
	dl.display();
	System.out.println("Size Of List "+dl.size());
	System.out.println("Maximum Element "+dl.max());
	System.out.println("Minimum Element "+dl.min());
	System.out.println();
}
}
