package listaExercicio02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		Imc imc = new Imc ();
						
		System.out.println("Digite seu nome: ");
		pessoa.nome = scanner.nextLine();
		
		System.out.println("Digite seu peso: ");
		pessoa.peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura: ");
		pessoa.altura = scanner.nextInt();
		
		scanner.close();
	}
}
