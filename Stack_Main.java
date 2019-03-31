package data_structures;

import java.util.Arrays;

public class Stack_Main {
public static void main(String[] args) throws StackOverFlowException {
	Stack s=new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	s.push(6);
	s.push(7);
	s.push(8);
	s.push(9);
	s.push(10);
	s.pop();
	System.out.println("cursor position: "+s.cursor);
	System.out.println("Popping Out Of Stack=> ");
	for(int i=0;i<s.a.length-1;i++) {
		s.a[i]=s.a[i+1];
		}
		System.out.println(Arrays.toString(s.a));
	}
	
}


