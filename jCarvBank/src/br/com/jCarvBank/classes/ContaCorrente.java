package br.com.jCarvBank.classes;

public class ContaCorrente extends Conta {

	public ContaCorrente(int a) {
		super(a);
	}

	@Override
	public void extrato() {
		System.out.println("---- Extrato Conta Corrente ----");
		super.extrato();
	}
}
