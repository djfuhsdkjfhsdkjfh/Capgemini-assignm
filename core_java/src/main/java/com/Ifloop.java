package com;

public class Ifloop {

	public static void main(String[] args) {
		
		int marks = 82;
		
		if(marks>60) {
			System.out.println("First Division");
		}
		else {
			if(marks>=45 && marks<60) {
			System.out.println("Second division");
			}
			else {
				System.out.println("Fail");
			}
		}
		
	}
}


