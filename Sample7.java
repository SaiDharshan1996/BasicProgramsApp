package com.regnant;

public class Sample7 {
public static void main(String[] args) {
	int m=15,n=16;
	n--;
	//boolean x=n==m;
	boolean x=(m<n)&&(m!=n)&&(m==n);
	if(x) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
}
}
