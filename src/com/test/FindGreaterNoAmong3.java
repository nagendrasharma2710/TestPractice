package com.test;

public class FindGreaterNoAmong3 {
	
	void swap() {
		int  i=18, j=21, k=14, larg, temp;
		temp = i>j?i:j;
		larg = k>temp?k:temp;
		System.out.println("Greater no by holding value in variable : "+larg);
		//using ternary operator
		larg = k > (i > j ? i : j) ? k : ((i > j) ? i : j);  
		System.out.println("Greater no by ternary opeartor : "+larg);
	}
	public static void main(String []args) {
		FindGreaterNoAmong3 obj = new FindGreaterNoAmong3();
		obj.swap();
	}
}
