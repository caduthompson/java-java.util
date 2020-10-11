package com.bytebank.bank.test;

import com.bytebank.bank.model.CheckingAccount;

public class ReferencesArrayTest {
	
	public static void main(String[] args) {
		
		// int[] ages = new int[5];
		CheckingAccount[] accounts = new CheckingAccount[5];
		CheckingAccount cc1 = new CheckingAccount(123, 321);
		accounts[0] = cc1;
		
		CheckingAccount cc2 = new CheckingAccount(22, 22);
		accounts[1] = cc2;
		
		CheckingAccount ref = accounts[1];
		
		
		System.out.println(cc1.getNumero());
		System.out.println(accounts[1].getNumero());
		System.out.println(ref.getNumero());
		
		// 2 -> objects(cc1, cc2: new CheckingAccount); 6 -> references: accounts, cc1, accounts[0], cc2, accounts[1], ref.  
	}

}
