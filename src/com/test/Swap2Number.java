package com.test;

public class Swap2Number {

	void swap2() {
		int a = 9, b = 7, t1;
		System.out.println("Before swap - a = "+a+" , "+"b = "+b);
		t1=a= 9;
		a=b= 7;
		b=t1=9;
		System.out.println("After swap - a = "+a+" , "+"b = "+b);
	}
	public static void main(String []args) {
		Swap2Number ob = new Swap2Number();
		ob.swap2();
	}
}
