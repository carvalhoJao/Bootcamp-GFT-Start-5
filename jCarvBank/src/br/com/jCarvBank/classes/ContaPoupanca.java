package br.com.jCarvBank.classes;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int a) {
		super(a);	
	}

	@Override
	public void extrato() {
		System.out.println("---- Extrato Conta Poupan�a ----");
		super.extrato();
	}
	
}
