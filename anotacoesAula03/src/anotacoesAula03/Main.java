package anotacoesAula03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;
		double altura, peso;
		
		System.out.println("Nome: ");
		nome = scanner.nextLine();
		System.out.println("Idade: ");
		idade = scanner.nextInt();
		System.out.println("Peso: ");
		peso = scanner.nextDouble();
		System.out.println("Altura: ");
		altura = scanner.nextDouble();
		
		Pessoa pessoa = new Pessoa(nome, idade, peso, altura);
		
		Pessoa pessoa1 = new Pessoa("João", 56, 1.78, 1.88);
		
		System.out.println(pessoa);
		scanner.close();
		
		
	}
}
