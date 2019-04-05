package list_collections;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashSet {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	hs.add("ravi");
	hs.add("ravi kiran");
	hs.add("ashok");
	hs.add("vamsi");
	Iterator<String> it=hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
