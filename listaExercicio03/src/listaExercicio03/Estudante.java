package listaExercicio03;

public class Estudante {
	
	public String nome;
	public int idade;
	public String curso;
	
	public Estudante() {
		this.nome = "";
		this.idade = 0;
		this.curso = "";
	}
	
	public Estudante(String nome) {
		this.nome = "Ramon";
	}
	
	public Estudante(String nome, int idade) {
		this.nome = "Arthur";
		this.idade = 60;
	}
	
	public Estudante(String nome, int idade, String curso) {
		this.nome = "Ramon";
		this.idade = 15;
		this.curso = "Sitemas";
	}
	
	public String toString() {
		return "Estudante{" +
				"nome = " + nome +
				"idade = " + idade +
				"curso = " + curso +
				"}";
	}
}
