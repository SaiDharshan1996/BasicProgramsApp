package com.regnant;

public class LoopProgram {
public static void main(String[] args) {
	System.out.println("Print 1 to 10 numbers");
	for (int i=1; i<=10; i++) {
		System.out.println(i+"  ");
		
	}
	
	//Print 10 to 1 numbers
	System.out.println("Print 10 to 1 numbers");
	for(int i=10; i>=1; i--) {
		System.out.println(i+"  ");
	
	}
	
	//Print even numbers
	System.out.println("Print even numbers");
	for(int i=2; i<=10; i+=2) {
		System.out.println(i+"  ");
	}
	
	//Print odd numbers
	System.out.println("Print odd numbers");
	for(int i=1; i<=30; i+=2) {
		System.out.println(i+"  ");
	}
	
	//Print prime numbers
	System.out.println("Print prime numbers");
	int num=20;
	for(int i=1; i<=num; i++) {
		int fact=0;
		for (int j=1; j<=i; j++) {
			if(i%j==0)
				fact++;
		}
		if(fact==2)
			System.out.println(i+"  ");
		}
		
	

	//Print alternative numbers from 1 to 20
	System.out.println("Print alternative numbers from 1 to 20");
	for(int i=1; i<=20; i+=2) {
		System.out.println(i);
	}
	
	//Print numbers divisible by 7
	System.out.println("Print numbers divisible by 7");
	for(int i=1; i<30; i++) {
		if(i%7==0)
		System.out.println(i+"  ");
	}
}
}