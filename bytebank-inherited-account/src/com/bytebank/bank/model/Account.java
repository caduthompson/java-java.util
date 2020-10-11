package com.bytebank.bank.model;

/**
 * Class represents the frame of an account
 * 
 * @author Carlos Thompson
 *
 */

public abstract class Account {

	protected double saldo;
	private int agencia;
	private int numero;
	private Client titular;
	private static int total = 0;
	
	public Account() {}
	
	/**
	 * Constructor to initialize object Account from the agency and number
	 * 
	 * @param agencia
	 * @param numero
	 */
	

	public Account(int agencia, int numero) {
		Account.total++;
//		System.out.println("O total de contas são: " + Account.total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);
	
	/**
	 * Valor needs to be more than saldo.
	 * 
	 * @param valor
	 * @throws InsufficientFundsException
	 */

	public void saca(double valor) throws InsufficientFundsException{
		if (this.saldo < valor) {
			throw new InsufficientFundsException("Saldo Insuficiente:\n" + 
					"Saldo: " + this.saldo + 
					"\nValor do Saque: " + valor);// problema
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Account destino) throws InsufficientFundsException{
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Client titular) {
		this.titular = titular;
	}

	public Client getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Account.total;
	}
	
	@Override
	public String toString() {
		return "Agencia: " + this.agencia +
				"\n Número: " + this.numero;
	}

}