package anotacoesAula05;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Exibindo mensagem simples para o usuário");

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover o usuário?");

		if (escolha == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Usuário removido");

		} else {
			JOptionPane.showMessageDialog(null, "Ação cancelada");
		}

		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Meu nome é: " + nome);

		String preco = JOptionPane.showInputDialog(null, "Digite o preço: ");
		JOptionPane.showMessageDialog(null, "O preço é: " + preco);
		
		

	}
}
