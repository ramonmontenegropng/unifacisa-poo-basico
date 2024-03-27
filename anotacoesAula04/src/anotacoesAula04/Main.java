package anotacoesAula04;

public class Main {
	public static void main(String[] args) {
		
		//Instanciando o objeto a partir do construtor
		
		Retangulo retangulo1 = new Retangulo();
		Retangulo retangulo2 = new Retangulo(10,10);
		Retangulo retangulo3 = new Retangulo(30);
		
		System.out.println(retangulo1);
		System.out.println(retangulo2);
		System.out.println(retangulo3);
		
	}
}