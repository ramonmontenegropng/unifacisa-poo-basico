package desafioExtra01;
import java.util.Scanner;


public class Desafio03While {
	public static void main(String[] args) {
		
		int numero = 0;
		Scanner scanner = new Scanner(System.in);
		int entrada = scanner.nextInt();
		
		while (numero < entrada) {
			System.out.println(numero);
			numero ++ ;
		}		
		
		scanner.close();
	}
}
