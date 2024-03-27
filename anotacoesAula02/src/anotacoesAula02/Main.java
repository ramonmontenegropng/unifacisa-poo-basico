package anotacoesAula02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int largura, comprimento;
		
		System.out.println("Digite a largura: ");
		largura = scanner.nextInt();
		
		System.out.println("Digite a comprimento: ");
		comprimento = scanner.nextInt();
		
		int area = largura * comprimento;
		
		System.out.println("A área do terreno é: " + area + "m2");

		scanner.close();
	}

}
