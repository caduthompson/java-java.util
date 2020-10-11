package com.bytebank.bank.model;

public class CheckingAccount extends Account implements Taxable{
	
	public CheckingAccount(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws InsufficientFundsException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Account Corrente:\n " +  super.toString();
	}

}
