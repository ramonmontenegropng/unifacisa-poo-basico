package listaExercicio03;

public class Funcionario {
	
	public String nome;
	public Double salario;
	public String cargo;
	
	public Funcionario(){
		this.nome = "";
		this.salario = 0.0;
		this.cargo = "";
	}
	
	public Funcionario(String nome) {
		this.nome = "Ramon";
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = "Arthur";
		this.salario = 17.000;
	}
	
	public Funcionario(String nome, double salario, String cargo) {
		this.nome = "Ramon";
		this.salario = 1.000;
		this.cargo = "Feirante";
	}
		
	public String toString() {
		return "Funcionario{" +
				"nome = " + nome +
				"salario = " + salario +
				"cargo = " + cargo +
				"}";
	}
	
}