package br.com.jCarvBank.classes;

import java.util.List;

public class Cliente {
	protected String nome;
	protected int CPF;
	protected List<Conta> contas;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}
}
