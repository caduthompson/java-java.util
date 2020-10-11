package com.bytebank.bank.test;

public class PrimitiveArrayTest {

	// Array [] 
	// Array: zero based.
	public static void main(String[] args) {

		int[] ages = new int[5]; // Array with initializing

		for (int i = 0; i < ages.length; i++) {
			ages[i] = i * i;
		}
		// i = 0; ages[0] = 0 * 0; 
		// i = 1; ages[1] = 1 * 1;
		// i = 2; ages[2] = 2 * 2;
		// i = 3; ages[3] = 3 * 3;
		// i = 4; ages[4] = 4 * 4;

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);;
		}
		
//		ages[0] = 29;
//		ages[1] = 39;
//		ages[2] = 49;
//		ages[3] = 59;
//		ages[4] = 69;
//		
//		int age1 = ages[0];
////		int age4 = ages[49];
//		
//		System.out.println(age1);
////		System.out.println(age4); // Output: Exception: ArrayIndexOutOfBoundException
//
	
	}
}
