package com;

public class Primenumber {

	public static void main(String[] args) {
		int num=37;
		boolean isPrime = true;
		for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
		}
		if(isPrime) {
			System.out.println(num+" Is a Prime number");
		}
		else {
			System.out.println(num+" Is not a Prime number ");
		}

	}

}
