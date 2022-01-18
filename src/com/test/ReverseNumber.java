package com.test;

import java.util.Scanner;

public class ReverseNumber {
	void reverse() {  
		int revers = 0;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		while(num > 0)   
		{  
		int rmd = num % 10;  
		revers = revers * 10 + rmd;  
		num = num/10;
		}  
		System.out.println("Reverse number = " + revers);  
		}  
	public static void main(String []args) {
		ReverseNumber obj1 = new ReverseNumber();
		obj1.reverse();
	}
}
