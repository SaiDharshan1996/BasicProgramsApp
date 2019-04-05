package list_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
public static void main(String[] args) {
	List<String> user=new ArrayList<>();
	user.add("ashok");
	user.add("vamsi");
	user.add("sai");
	user.add("rohit"); 
	Iterator<String> it=user.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
