package com;

public class Fibaonacci {

	public static void main(String[] args) {
	int num=7;
	int a = 0;
	int b = 1;
	int c;
	System.out.println(num);
	for(int i=0;i<num;i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}

	}

}
