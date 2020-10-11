package com.bytebank.bank.special;

import com.bytebank.bank.model.Account;

public class SpecialAccount extends Account {
	
	public SpecialAccount(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += saldo;
	}

}
