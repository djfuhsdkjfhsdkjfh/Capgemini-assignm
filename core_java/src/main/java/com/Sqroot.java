package com;
import java.util.Scanner;
public class Sqroot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		num = sc.nextDouble();
		System.out.println("Square root of the number "+Math.sqrt(num));
		sc.close();
	}

}
