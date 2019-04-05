package list_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorLinkedList {

	public static void main(String[] args) {
	List<String> ll=new LinkedList<>();
	ll.add("dharshan");
	ll.add("ravi");
	ll.add("uma");
	ll.add("satish");
	Iterator<String> it=ll.listIterator(ll.size()-1);
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
