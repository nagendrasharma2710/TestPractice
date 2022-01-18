package com.test;

public class Swap3Number {
	
	void swap3() {
		int a = 9, b = 7,c=6;
		System.out.println("Before swap - a = "+a+","+"b = "+b+","+"c = "+c);
		a=a+b+c;        // a=9+7+6 = 22
		b=a-(b+c);      // b=22-(7+6) = 9
		c=a-(b+c);      // c=22-(9+6) = 7
		a=a-(b+c);
		System.out.println("After swap - a = "+a+","+"b = "+b+","+"c = "+c);
	}
	public static void main(String [] args) {
		Swap3Number ob1= new Swap3Number();
		ob1.swap3();
	}
}
