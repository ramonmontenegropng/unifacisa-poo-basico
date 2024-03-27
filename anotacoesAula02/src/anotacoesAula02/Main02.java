package anotacoesAula02;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Terreno terreno01 = new Terreno();
		
		System.out.println("Digite a largura do terreno: ");
		terreno01.largura = scanner.nextInt();
		
		System.out.println("Digite o comprimento do terreno: ");
		terreno01.comprimento = scanner.nextInt();
		
		int areaTerreno01 = terreno01.largura * terreno01.comprimento;
		
		System.out.println(areaTerreno01);
		
		scanner.close();
	}
}
