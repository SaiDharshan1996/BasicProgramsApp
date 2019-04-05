package list_collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<String> lhs=new LinkedHashSet<>();
	lhs.add("bharat");
	lhs.add("kumar");
	lhs.add("trinath");
	lhs.add("kiran");
	Iterator<String> it=lhs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
