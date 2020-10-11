package com.bytebank.bank.test;

import com.bytebank.bank.model.CheckingAccount;
import com.bytebank.bank.model.SavingsAccount;
import com.bytebank.bank.model.InsufficientFundsException;

public class AccountTest {

	public static void main(String[] args) throws InsufficientFundsException{

		// Full Qualified Name FQN
		CheckingAccount cc = new CheckingAccount(111, 111);
		cc.deposita(100.00);
		
		SavingsAccount cp = new SavingsAccount(222, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo da Account Corrente: " + cc.getSaldo());
		System.out.println("Saldo da Account Poupanca: " + cp.getSaldo());
	}

}
