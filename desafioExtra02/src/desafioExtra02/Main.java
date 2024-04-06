package desafioExtra02;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		HashSet<Tarefa> lista = new HashSet<>();
		boolean sair = false;

		while (!sair) {
			String opcao = JOptionPane.showInputDialog(null, "Menu:\n" + "1. Adicionar tarefa \n"
					+ "2. Visualizar tarefa \n" + "3. Remover tarefa \n" + "4. Sair");

			switch (opcao) {

			case "1":
				String input = JOptionPane.showInputDialog(null, "Digite a tarefa: ");
				Tarefa novaTarefa = new Tarefa(input);
				lista.add(novaTarefa);
				break;

			case "2":
				StringBuilder mensagem = new StringBuilder("Tarefas:\n");
				for (Tarefa tarefa : lista) {
					mensagem.append("- ").append(tarefa.getTarefa()).append("\n");
				}
				JOptionPane.showMessageDialog(null, mensagem.toString(), "Lista de Tarefas", JOptionPane.PLAIN_MESSAGE);
				break;

			case "3":
				if (lista.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Não há tarefas.");
				} else {
					String nomeTarefa = JOptionPane.showInputDialog("Qual tarefa deseja remover?");
					Tarefa tarefaRemover = new Tarefa(nomeTarefa);
					if (lista.contains(tarefaRemover)) {
						lista.remove(tarefaRemover);
						JOptionPane.showMessageDialog(null, "Tarefa removida");
					} else {
						JOptionPane.showMessageDialog(null, "Tarefa não encontrada.");
					}
				}
				break;

			case "4":
				sair = true;

			}
		}

	}
}
