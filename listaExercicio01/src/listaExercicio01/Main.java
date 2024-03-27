package listaExercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> tarefas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		boolean sair = false;

		while (!sair) {
			System.out.println("BEM VINDO AO NOSHON");
			System.out.println("1. Adicionar nova tarefa \n2. Visualizar tarefa \n3. Remover tarefa \n4. Sair");
			int opcao = scanner.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite a tarefa:");
				String tarefa = scanner.next();
				tarefas.add(tarefa);
				
			}else if (opcao == 2) {
				System.out.println("Segue a lista: \n" +tarefas);
				
//			}else if (opcao == 3) {
//				System.out.println(tarefas + "\nQual tarefa você quer excluir?");
//				String tarefa = scanner.next();
//				tarefas.remove(tarefa);
				
			}else if (opcao == 3) {
				System.out.println(tarefas + "\nQual tarefa você quer excluir:");
				String tarefa = scanner.next();
					if (tarefas.contains(tarefa)) {
						tarefas.remove(tarefa);
					}
				
			}else if (opcao == 4) {
				sair = true;
				System.out.println("Tchau");
					
			}else {
				System.out.println("Esse número não...");
			}
		}
		
        scanner.close();
	}
}