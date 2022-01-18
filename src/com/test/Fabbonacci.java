package com.test;

public class Fabbonacci {

	void fabb() {
		int a=0,b=1,c;
		for(int i=1; i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
	public static void main(String []args) {
		Fabbonacci object = new Fabbonacci();
		object.fabb();
	}
}
