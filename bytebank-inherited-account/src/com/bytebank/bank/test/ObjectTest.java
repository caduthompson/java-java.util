package com.bytebank.bank.test;

import com.bytebank.bank.model.Client;
import com.bytebank.bank.model.CheckingAccount;
import com.bytebank.bank.model.SavingsAccount;

public class ObjectTest {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		CheckingAccount cc = new CheckingAccount(22, 33);
		Object cp = new SavingsAccount(33, 22); // Object is the Biggest generic class
		Object cliente = new Client();

		System.out.println(cc);
		
		System.out.println(cp.toString()); 
		System.out.println(cp); // It's the same, method toString() is implied

		println(cc);
	}

	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
//	static void println(CheckingAccount cc) {}
	static void println(Object referencia) {}
}