package com;
import java.util.Scanner;
public class Simpleinte {

	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in);){
		System.out.println("Enter P R T to find Simple interest");
		int p;
		double si,r,t;
		r = sc.nextInt();
		t = sc.nextInt();
		p = sc.nextInt();
		si = (p*t*r)/100;

		System.out.println("Simple Interest= "+si);
	}
	}
}
