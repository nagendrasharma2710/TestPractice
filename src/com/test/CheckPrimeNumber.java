package com.test;

import java.util.Scanner;

public class CheckPrimeNumber {
	void prime() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number : ");
		int n = sc.nextInt();
		int temp=0;
		for(int i=2; i<=n-1; i++) {
			if(n%i==0) {
				temp = temp+1;
			}
		}if(temp == 0) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}
	public static void main(String []args) {
		CheckPrimeNumber ob = new CheckPrimeNumber();
		ob.prime();
	}
}
