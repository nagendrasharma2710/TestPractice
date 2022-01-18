package com.test;

import java.util.Scanner;

public class Factorial {
	void fact() {
		int n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int m = sc.nextInt();
		for(n=1; n<=m; n++) {
			fact=fact*n;//1//5//10//30//120
		}
		System.out.println("Factorial of no is = "+fact);	
	}
	public static void main(String [] args) {
		Factorial fac = new Factorial();
		fac.fact();
	}
}
