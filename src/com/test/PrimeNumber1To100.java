package com.test;

public class PrimeNumber1To100 {
	void primeNum() {

		for(int n=1; n<=100; n++) {
			int temp=0;
			for(int i=2; i<=n-1; i++) {
				if(n%i==0) {
					temp = temp+1;
				}
			}if(temp == 0) {
				System.out.println(n);
			}
		}
	}
	public static void main(String []args) {
		PrimeNumber1To100 objct = new PrimeNumber1To100();
		objct.primeNum();
	}
}
