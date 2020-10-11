package com.bytebank.bank.model;

// model.CalculadoraDeImposto -> Full Qualified Name FQN
public class TaxCalculator {
	
	private double totalImposto;
	
	public void registra(Taxable t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
