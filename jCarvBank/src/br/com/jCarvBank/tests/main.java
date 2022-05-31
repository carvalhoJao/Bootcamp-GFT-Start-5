package br.com.jCarvBank.tests;

import br.com.jCarvBank.classes.Conta;
import br.com.jCarvBank.classes.ContaCorrente;
import br.com.jCarvBank.classes.ContaPoupanca;

public class main {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(001);
		Conta poup1 = new ContaPoupanca(002);
		cc1.depositar(200);
		poup1.depositar(1050.45);
		
		cc1.extrato();
		poup1.extrato();
		
		cc1.tranferir(20, poup1);
		cc1.extrato();
		poup1.extrato();
		
	
	}
}
