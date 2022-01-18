package com.test;

public class ALLINONE {
	
	void primenum() {
//		for(int t=1;t<=100;t++) {
			int n,t=7, temp=0;
		for(int i=2; i<=t-1;i++) {
			if(t%i==0) {
				temp=temp+1;
			}
		} if(temp==0) System.out.println("number is prime");
		else System.out.println("not prime");
	}
//	}
	void factor() {
		int m=5, fact=1;
		for(int j=1;j<=m;j++) {
			fact=fact*j;
		}
		System.out.println("factorial : "+fact);
	}
	void fabbo() {
		int a=0,b=1,c;
		for(int i=1;i<=10;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println("fabbonacci series : "+c);}
	}
	void pallin() {
		int p=1221,rem,sum=0,c;
		c=p;
		while(p>0) {
			rem=p%10;
			sum=sum*10+rem;
			p=p/10;
		} if(c==sum) {
			System.out.println("pallindrone");
		} else System.out.println("not pallindrone");
	}
	void armst() {
		int p=153,rem,arm=0,c;
		c=p;
		while(p>0) {
			rem=p%10;
			arm=(rem*rem*rem)+arm;
			p=p/10;
		} if(c==arm) {
			System.out.println("armstrong");
		} else System.out.println("not armstrong");
	}
	void sumOfNum() {
		int g=10, sum=0;
		for(int l=1;l<=g;l++) {
			sum=sum+l;
		}
		System.out.println(sum);
	}
	void sumOfDigit() {
		int nm=176,dg=0,re;
		while(nm>0) {
			re=nm%10;
			dg=dg+re;
			nm=nm/10;
		} System.out.println(dg);
	}
	void swa2() {
		int r=7,s=8,t;
		t=r=7;
		r=s=8;
		s=t=7;
		System.out.println("swap num r= "+r+","+"s= "+s);
	}
	void swa3() {
		int a=4,b=5,c=6;
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("swap num a= "+a+","+"b= "+b+","+"c= "+c);
	}
	void prichek() {
		int s=7, count=0;
		for(int i=1;i<=s;i++) {
			if(s%i==0) {
				count++;
			}
		}
		if(count==2) System.out.println("prime");
		else System.out.println("no prime");
	}
	public static void main(String []args) {
		ALLINONE op = new ALLINONE();
		op.primenum();
		op.factor();
		op.fabbo();
		op.pallin();
		op.armst();
		op.sumOfNum();
		op.sumOfDigit();
		op.swa2();
		op.swa3();
		op.prichek();
	}
}
