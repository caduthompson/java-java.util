package com.bytebank.bank.model;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Account Poupança:\n " +  super.toString();
	}

}
