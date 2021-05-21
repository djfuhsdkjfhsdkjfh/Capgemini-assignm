package com;

public class Reverse {

	public static void main(String[] args) {
		int num= 429;
		int reversed = 0;
		while (num!= 0) {
			int d = num%10;
			reversed = reversed*10 + d;
			num = num/10;
		}
		System.out.println("Reversed number: "+reversed);
	}

}
