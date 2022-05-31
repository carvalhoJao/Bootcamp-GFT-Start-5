package br.com.jCarvBank.classes;


public abstract class Conta {
	protected double saldo;
	protected int numConta;
	protected int agencia;
	protected Cliente titular;
	protected static int SEQUENCIAL = 10050;
	
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -=  valor;	
		}
		else System.out.println("Valor indisponível!");
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void tranferir(double valor, Conta contadestino) {
		sacar(valor);
		contadestino.depositar(valor);
	}
	
	public Conta(int a) {
		this.agencia = a;
		this.numConta = SEQUENCIAL++;
	}
	
	
	public void extrato() {
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta " + this.numConta);
		System.out.println("Saldo: R$" + this.saldo + "\n");
	}
	
	
	
	
	
//	Getters e Setters++++++++++++++++

	public double getSaldo() {
		return saldo;
	}


	public int getNumConta() {
		return numConta;
	}


	public int getAgencia() {
		return agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
