package com.bytebank.bank.test;

import com.bytebank.bank.model.Account;
import com.bytebank.bank.model.CheckingAccount;
import com.bytebank.bank.model.InsufficientFundsException;

public class WithdrawTest {

	public static void main(String[] args) {
		Account conta = new CheckingAccount(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch (InsufficientFundsException ex) {
			System.out.println("" + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
