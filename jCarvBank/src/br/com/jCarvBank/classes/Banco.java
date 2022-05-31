package br.com.jCarvBank.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Banco {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		int id = 1;
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		int contContas = 0;
		while(escolha != 9) {
			int op = 15;
			while (op <= 10) {
				if(id == 1) {
					System.out.println(".:: Banco jCarv ::.");
					System.out.println("1 - Abrir conta");
					System.out.println("9 - Sair");
				}
				else {
					System.out.println("2 - Realizar Depósito");
					System.out.println("3 - Realizar Saque");
					System.out.println("4 - Transferencia");
					System.out.println("5 - Extrato");
					System.out.println("8 - Abrir outra conta");
					System.out.println("9 - Sair");
				}
				System.out.print("Opção: ");
				op = scan.nextInt();
				if(op >= 10) System.out.println("Opção inválida!");
			}
			id = 5;
			if (escolha == 1) {
				System.out.print("\nDigite o seu nome: ");
				String nome = scan.nextLine(); 
				cliente.setNome(nome);
				
				System.out.print("\nDigite o seu CPF: ");
				int cPF= scan.nextInt(); 
				cliente.setCPF(cPF);
				
				System.out.println("10 - Abrir Conta Corrente");
				System.out.println("Outro valor - Abrir Conta Poupanca");
				System.out.print("Opcao: ");
				int opConta = scan.nextInt();
				if (opConta == 10) {
					System.out.print("Digite o numero da agencia: ");
					int agencia = scan.nextInt();
					Conta cc = new ContaCorrente(agencia);
					cliente.addConta(cc);
				}
				else {
					System.out.print("Digite o numero da agencia: ");
					int agencia = scan.nextInt();
					Conta poup = new ContaPoupanca(agencia);
					cliente.addConta(poup);
				}
				contContas++;
				clientes.add(cliente);
			}
			else if (escolha == 2) {
				System.out.print("Digite a quantidade de depósito: R$");
				double dep = scan.nextDouble();
				cliente.contas.get(contContas).depositar(dep);
			}
			else if(escolha == 3) {
				System.out.println("Digite o valor do saque: R$");
				double valor = scan.nextDouble();
				cliente.contas.get(contContas).sacar(valor);
			}
			else if(escolha == 5) {
				cliente.contas.get(contContas).extrato();
			}
		}
	}
	
}
