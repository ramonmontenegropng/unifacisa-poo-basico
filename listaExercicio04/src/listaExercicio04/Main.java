package listaExercicio04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean sair = false;

		System.out.println("Insira o número da conta: ");
		int numeroConta;
		int opcao;
		numeroConta = scanner.nextInt();
		
		System.out.println("Insira o titular da conta: ");
		String nome;
		nome = scanner.next();
		
		System.out.println("Haverá depósito inicial? (1-sim) (2-não)");
		opcao = scanner.nextInt();
		
		Conta conta = new Conta(numeroConta, nome, 0.0);

		if (opcao == 1) {
			
			System.out.println("Insira o valor inicial: ");
				double saldo = scanner.nextDouble();
				conta.setSaldo(saldo);
			
		}else if (opcao == 2) {
			
			System.out.println("Valor definido para zero.");	
		}
		
		System.out.println("Dados da conta: " + conta);
		
		while (!sair) {
			
			System.out.println("Deseja realizar alguma operação? (1-sim) (2-não)");
				opcao = scanner.nextInt();
			
			if(opcao == 1) {
				System.out.println("Qual? (1-saque) (2-depósito)");
				opcao = scanner.nextInt();
				
				if(opcao == 1) {
					
					System.out.println("Digite o valor a ser sacado: ");
					double saque = scanner.nextDouble();
					conta.sacar(saque);
					System.out.println("Valor atualizado para: " + conta.getSaldo());
										
				}else if (opcao == 2) {
					System.out.println("Digite o valor a ser depositado: ");
					double deposito = scanner.nextDouble();
					conta.depositar(deposito);
					System.out.println("Valor atualizado para: " + conta.getSaldo());
				}
			}else if (opcao == 2) {
					sair = true;
				}
			}
		
		scanner.close();

		}		
	}