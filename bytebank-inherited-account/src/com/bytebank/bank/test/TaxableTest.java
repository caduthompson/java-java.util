package com.bytebank.bank.test;

import com.bytebank.bank.model.TaxCalculator;
import com.bytebank.bank.model.CheckingAccount;
import com.bytebank.bank.model.LifeInsurance;

public class TaxableTest {

	public static void main(String[] args) {

		CheckingAccount cc = new CheckingAccount(222, 333);
		cc.deposita(100.0);
		
		LifeInsurance seguro = new LifeInsurance();
		
		TaxCalculator calc = new TaxCalculator();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
