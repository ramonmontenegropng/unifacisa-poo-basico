package anotacoesAula04;

public class Retangulo {
	public double comprimento;
	public double largura;
	
	//Criando construtor
	
	public Retangulo(){
		this.comprimento = 0.0;
		this.largura = 0.0;
	}
	
	//Criando sobrecarga de construtor (criar o mesmo construtor)
	//Serve basicamente pra ser preenchido, pois no futuro vai ser necessário um construtor vazio, e uma sobrecarga pra ser preenchido
	
	public Retangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	//Criando mais uma sobrecarga, construtor com apenas um parâmetro
	//Automaticamente, ele vai preencher o mesmo valor em ambos os dados
	
	public Retangulo(double valor) {
		this.comprimento = valor;
		this.largura = valor;
	}
	
	//Criando método toString
	
	public String toString() {
		return "Retangulo{" +
				"comprimento=" + comprimento +
				"largura=" + largura +
				"}";
	}
}
