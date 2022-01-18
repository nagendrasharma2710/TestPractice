package com.test;

public class AllBasicsConcepts {
	void prim() {
		int d=7, count=0;
		for(int i=1;i<=d;i++) {
			if(d%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
	void pallin() {
		int n=1221, rem, sum=0, c;
		c=n;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}if(c==sum) {
			System.out.println("pallindrom");
		}else {
			System.out.println("not pallindrom");
		}
	}
	void armtro() {
		int m=153,rem,arm=0,c;
		c=m;
		while(m>0) {
			rem=m%10;
			arm=(rem*rem*rem)+arm;
			m=m/10;
		}if(c==arm) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}
	void factori() {
		int h=5, fact=1;
		for(int i=1;i<=h;i++) {
			fact= fact*i;
		} System.out.println(fact);
	}
	void fabbonacc() {
		int a=0, b=1, c;
		for(int i=1; i<=5; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	}
	void swa2() {
		int r=8, s=9, t;
		t=r=8;
		r=s=9;
		s=t=8;
		System.out.println("r = "+r+","+"s = "+s);
	}
	void swa3() {
		int p=3,q=5,r=7;
		p=p+q+r;
		q=p-(q+r);
		r=p-(q+r);
		p=p-(q+r);
		System.out.println("p = "+p+","+"q = "+q+","+"r = "+r);
	}
	void prime100N() {
		for(int k=1;k<=50;k++) {
			int count=1;
		for(int i=1; i<k; i++) {
			if(k%i==0) {
				count++;
			}
		}if (count==2) System.out.println(k);
	}
	}
	void sumdOfNm() {
		int j=1000, sum=0;
		for(int i=1;i<=j;i++) {
			sum=sum+i;
		}System.out.println("sum of 1 to 10 = "+sum);
	}
	void sumOfDg() {
		int s=999999999,som=0,remi;
		while(s>0) {
			remi=s%10;
			som=som+remi;
			s=s/10;
		} System.out.println("Sum = "+som);
	}
	void greatestin3() {
		int a=20,b=11,c=52,r;
		r= a>b?a:b;
		r=c>r?c:r;
		System.out.println("greatest no = "+r);
	}
	void revas() {
		int i=12345, rev=0, v;
		while(i>0) {
			v=i%10;
			rev=rev*10+v;
			i=i/10;
		} System.out.println("reverse no = "+rev);
	}
	public static void main(String []args) {
		AllBasicsConcepts test = new AllBasicsConcepts(); 
		test.prim();
		test.pallin();
		test.armtro();
		test.factori();
		test.fabbonacc();
		test.swa2(); 
		test.swa3();
		test.prime100N();
		test.sumdOfNm();
		test.greatestin3();
		test.sumOfDg();
		test.revas();
	}
}
