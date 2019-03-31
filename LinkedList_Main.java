package data_structures;

public class LinkedList_Main {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(20);
	l.add(40);
	l.add(78);
	l.add(99);
	l.add(100);
	l.add(98);
	l.add(100);
	System.out.println("Elements");
	l.display();
	l.remove(100);
	l.remove(20);
	l.remove(99);
	l.remove(40);
	System.out.println("After Removing");
	l.display();
	System.out.println("Size of List "+l.size());
	System.out.println("Maximum Element in List "+l.max());
	System.out.println("Minimum Element in List "+l.min());
	
}
}
