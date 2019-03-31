package data_structures;

public class Stack {
int[] a=new int[10];
int cursor=0;
void push(int data) throws StackOverFlowException{
	if(cursor<a.length) {
		a[cursor]=data;
		System.out.println("Stack=> "+data);
		cursor++;
	}
	else {
		StackOverFlowException s=new StackOverFlowException();
		throw s;
	}
}
	
  int pop() {
	  if(cursor>0) { 
		  int data=a[cursor]; 
		  System.out.println("popped: "+a[cursor]);
		  cursor--; 
		  } 
	  else { 
		  StackUnderFlowException st=new StackUnderFlowException(); 
		  System.out.println("after popping: "+st);
		  }
	return cursor; 
	  } 
 
}
