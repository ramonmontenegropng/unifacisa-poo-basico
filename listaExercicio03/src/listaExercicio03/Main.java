package listaExercicio03;

public class Main {
	public static void main(String[] args) {
		
		SobrecargaTeste sobrecargateste1 = new SobrecargaTeste();

		System.out.println(sobrecargateste1.imprimir("String"));
		System.out.println(sobrecargateste1.imprimir(10));
		System.out.println(sobrecargateste1.imprimir(12.2));
		System.out.println("--------------------");

		Funcionario funcionario1 = new Funcionario();
		
		System.out.println(funcionario1.nome);
		System.out.println(funcionario1.cargo);
		System.out.println(funcionario1.salario);
		System.out.println("--------------------");
		
		Calculadora calculadora1 = new Calculadora();
		
		System.out.println(calculadora1.soma(1, 2));
		System.out.println(calculadora1.soma(3.1, 2.3));
		System.out.println(calculadora1.multiplicacao(1, 2));
		System.out.println(calculadora1.multiplicacao(2.2, 3.3));
		System.out.println("--------------------");
		
		Estudante estudante1 = new Estudante();
		
		System.out.println(estudante1.nome);
		System.out.println(estudante1.curso);
		System.out.println(estudante1.idade);
		System.out.println("--------------------");

		}
	
}	

