package desafioExtra01;
import java.util.Scanner;


public class Desafio03DoWhile {
	public static void main(String[] args) {
		
		int numero = 0;
		Scanner scanner = new Scanner(System.in);
		int entrada = scanner.nextInt();
		
		do {
			System.out.println(numero);
			numero ++;
			
		} while (numero < entrada);
		
		scanner.close();
	}
}
