package list_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTreeSet {
public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<>();
	ts.add(21);
	ts.add(22);
	ts.add(45);
	ts.add(56);
	ts.add(67);
	ts.remove(56);
	Iterator<Integer> it=ts.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
