package data_structures;

public class Queue {
int x[]=new int[5];
int cursor=0;
void push(int data) {
	x[cursor]=data;
	cursor++;
}
void pop() {
	int data=x[cursor];
	x[cursor]=0;
	System.out.println(data);
	
}
}
