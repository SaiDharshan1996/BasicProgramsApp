package data_structures;

import java.util.Arrays;

public class Queue_Main {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.push(10);
		q.push(12);
		q.push(20);
		q.push(50);
		q.push(100);
		System.out.println("Queue Values=> ");
		for(int i=0;i<q.x.length;i++) {
		System.out.println(q.x[i]);
	}
		q.pop();
		System.out.println("Popping Out Of Queue=> ");
		for(int i=0;i<q.x.length-1;i++) {
			q.x[i]=q.x[i+1];
			}
			System.out.println(Arrays.toString(q.x));
		}
	

	}

