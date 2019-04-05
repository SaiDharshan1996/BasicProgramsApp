package list_collections;

import java.util.Iterator;
import java.util.Stack;

public class IteratorStack {

	public static void main(String[] args) {
	Stack<String> s=new Stack<>();
	s.push("dharhan");
	s.push("ramya");
	s.push("karthick");
	s.push("sandeep");
	s.push("sharma");
	s.pop();
	Iterator<String> it=s.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

}
