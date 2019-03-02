package com.regnant;

public class Sample6 {
public static void main(String[] args) {
	int a=8,b=10;
	a++;
	b++;
	boolean c1=(a<b)||(a<=b)||(3==4);
	if(c1) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
}
}
