package com;

public class Array2Array {

	public static void main(String[] args) {
		int arr1[] = new int[] {1,2,3,4,5};
		int arr2[] = new int[arr1.length];
		
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("elements of first array ");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("elements of second array ");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i] );
		}
	}

}
