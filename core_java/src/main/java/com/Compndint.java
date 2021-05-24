package com;

import java.util.Scanner;

public class Compndint {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("Enter P R T N to find Compound interest");
			int p,n;
			double ci,r,t;
			r = sc.nextInt();
			t = sc.nextInt();
			p = sc.nextInt();
			n = sc.nextInt();
			ci = p* Math.pow(1+(r/n),n*t);
			ci = ci-p;
			System.out.println("Compound Interest= "+ci);
		}
	}
}
