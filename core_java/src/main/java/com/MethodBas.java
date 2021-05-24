package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MethodBas {
	int addition(int i,int j) {
	return i+j;
	}
	void substraction(int i,int j) {
		System.out.println("result is "+(i-j));
	}
	static int multiplication(int i,int j) {
		return i*j;
	}
	void division(int i,int j) {
		System.out.println("result is "+(i/j));
	}
	public static void main(String[] args) throws Exception {
	String ss="y";
	while(ss.equals("y")) {
		System.out.println("press 1 for addition");
        System.out.println("press 2 for substraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("------------------------------");
        System.out.println("Enter your choice");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b= br.readLine();
        int c = Integer.parseInt(b);
        System.out.println("enter your First number");
        String b1=br.readLine();
        int c1=Integer.parseInt(b1);
        System.out.println("enter your second number");
        String b2=br.readLine();
        int c2=Integer.parseInt(b2);
        MethodBas m = new MethodBas();
        switch(c) {
        case 1 :
        	int k=m.addition(c1, c2);
        	System.out.println("result is"+k);
        	break;
        case 2 :
        	m.substraction(c1,c2);
        	break;
        case 3 :
        	int l=multiplication(c1,c2);
        	break;
        case 4:
        	m.division(c1, c2);
        	break;
        	default:System.out.println("wrong choice");
        }
        System.out.println("Do you want to continue press y/n");
        ss = br.readLine();
	}

	}

}
