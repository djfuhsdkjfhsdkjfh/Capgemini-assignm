package com;

public class Factorial {

	public static void main(String[] args) {
	int num=6;
	int fact = 1;
	for(int i=num;i>0;i--) {
		fact = fact*i;
	}
	System.out.println("Fact is : " + fact);
	}

}
