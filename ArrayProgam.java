package com.regnant;

//import java.util.Arrays;

public class ArrayProgam {
	public static void main(String[] args) { 
		arr1();
		System.out.println();
		strarr();
		System.out.println();
		dharr();
		System.out.println();
		dharrs();
		System.out.println();
		even();
		System.out.println();
		odd();
		System.out.println();
		eind();
		System.out.println();
		oind();
		System.out.println();
		rtl();	
		System.out.println();
		ltr();
		System.out.println();
		aele();
		System.out.println();
		soa();
		System.out.println();
		}
	public static void arr1() {
		int[] ar = {20,30,59,68,98};
		for(int i = 0; i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
	public static void strarr() {
		String[] car = {"Jeep","BMW","Mesrati"};
		for(int i = 0; i<car.length; i++)
			System.out.print(car[i]+" ");
	}
	public static void dharr() {
		String[] d= {"x", "y", "z"};
		for(int i=0; i<d.length; i++)
			System.out.print(d[i]+"     ");
	}
	
public static void dharrs() {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.print(i+"  ");
    }}
   
    //Print even numbers in array
    
    public static void even() {
    	System.out.println("Print even numbers in array");
    int[] even= {1,2,3,4,5,6,7,8,9,10};
    for(int i=0; i<even.length; i++) {
    		if(even[i]%2==0){
    		System.out.print(even[i]+"  ");
    		}
    }}
  
    //Print odd numbers in array
    public static void odd() {
    	System.out.println("Print odd numbers in array");
    int[] odd= {1,2,3,4,5,6,7,8,9,10};
    for(int i=0; i<odd.length; i++) {
    		if(odd[i]%2!=0){
    		System.out.print(odd[i]+"  ");
    		}
    }}
    
    //Print elements at even index in array
    public static void eind() {
    	System.out.println("Print elements at even index in array");
    	int[] eind= {1,2,3,4,5,6,7,8,9,10};
    	for(int i=1; i<eind.length; i++) {
    		if (i%2==0) {
    		System.out.print(eind[i]+"  ");
    		}
    	}}
    
    
    //Print elements at odd index in array
    	public static void oind() {
    		System.out.println("Print elements at odd index in array");
    		int[] oind= {1,2,3,4,5,6,7,8,9,10};
    		for(int i=1; i<oind.length; i++) {
    			if (i%2!=0) {
    				System.out.print(oind[i]+"  ");
    			}
    		}
    	}
    
    
    //Print elements right to left from middle
    	public static void rtl() {
    		System.out.println("Print elements right to left from middle");
    		int[] rtl= {1,2,3,4,5,6,7,8,9,10};
    		for(int i=rtl.length/2-1; i>=0; i--) {
    			System.out.print(rtl[i]+"  ");
    		}
    	}
    	
    //print elements left to right from middle
    	public static void ltr() {
    		System.out.println("Print elements left to right from middle");
    		int[] ltr= {1,2,3,4,5,6,7,8,9,10};
    		for(int i=ltr.length/2; i<ltr.length ; i++) {
    			System.out.print(ltr[i]+"  ");
    		}
    	}
    //Print the Alternate Elements in an Array
    	public static void aele() {
    		System.out.println("Print the Alternate Elements in an Array");
    		int[] aele= {10,20,30,40,50,60,70,80,90,100};
    		for(int i=0;i<aele.length;i+=2) {
       			System.out.print(aele[i]+"  ");
    	}
    	}

    //Find the index of a given element
    /*	public static int ioge() {
    		System.out.println("Find the index of a given element");
    		int index = Arrays.binarySearch(); 
            return (index < 0) ? -1 : index; 
    	}
    		int[] ioge= {10,40,70,100,130,160,190,210,240,270,300};{
    		//for(int i=0;i<=ioge.length;i++) 
    		System.out.println("ioge,100");
   	
}*/
    		
    //Calculate Sum & Average of an Array
    		public static void soa() {
    			System.out.println("Calculate Sum & Average of an Array");
    			int a=0;
    			int[] soa= {10,20,30,40,50,60,70,80,90,100};
    			for (int i=0; i<soa.length; i++) {
    			a=soa[i]+a;
    			System.out.println("sum"+ a);
    			int obj=a/soa.length;
    			System.out.println("avg"+ obj);
    				
    			}
    		}
}
    	

    
    
    
