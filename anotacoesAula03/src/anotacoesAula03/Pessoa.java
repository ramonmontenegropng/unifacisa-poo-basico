package anotacoesAula03;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	double peso;
	
	public void imprimirDetalhes(double imc) {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(peso);
		System.out.println(imc);
	}

    
	public String toString() {
		return "Pessoa{" +
				"nome='" + nome +
				", idade=" + idade +
				", altura" + altura +
				", peso=" + peso +
				'}';
	}
	
	//Criando um construtor
	
	//O uso do this é para refenciar o atributo padrão do código
	
	public Pessoa() {	
	}
	
	public Pessoa(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
}
