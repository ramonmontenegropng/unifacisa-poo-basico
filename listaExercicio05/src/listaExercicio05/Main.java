package listaExercicio05;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		
		int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta: "));
		
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		
		int opcao = JOptionPane.showConfirmDialog(null, "Haverá depósito inicial? ");
		
		Conta conta = new Conta(numeroConta, nome, 0.0);
		
		if (opcao == 0) {
			
				double saldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor inicial: "));
				conta.setSaldo(saldo);

		}else if (opcao == 1) {
			
			JOptionPane.showMessageDialog(null, "Necessário inserir algum valor inicial posteriormente.");
			
		}
		
		JOptionPane.showMessageDialog(null, conta);
		JOptionPane.showConfirmDialog(null, "Deseja prosseguir?");
					
		JOptionPane.showConfirmDialog(null, "Deseja realizar alguma operação?");
			
		if (opcao == 0) {
			
			JOptionPane.showConfirmDialog(null, "É saque?");
			
			if (opcao == 0) {
				
				double saque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser sacado: "));
				conta.sacar(saque);
				JOptionPane.showMessageDialog(null, "Valor atualizado para: " + conta.getSaldo());
				JOptionPane.showConfirmDialog(null, "Deseja prosseguir?");
				
			}else if (opcao == 1) {
				
				JOptionPane.showConfirmDialog(null, "É depósito?");
				
				if (opcao == 0) {
					
					double deposito = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado: "));
					conta.depositar(deposito);
					JOptionPane.showConfirmDialog(null, "Valor atualizado para: " + conta.getSaldo());
				}

			}
		}else if (opcao == 2) {
			System.out.println("oi");
		}
	
	}

}