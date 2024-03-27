package listaExercicio03;

public class SobrecargaTeste {

	public String mensagem;
	public int numeroInt;
	public double numeroDouble;
	
	public SobrecargaTeste(){
		this.mensagem = "";
		this.numeroInt = 0;
		this.numeroDouble = 0.0;
	}

	public SobrecargaTeste(String mensagem, int numeroInt, double numeroDouble) {
		this.mensagem = mensagem;
		this.numeroInt = numeroInt;
		this.numeroDouble = numeroDouble;
	}

	public String imprimir(String mensagem) {
		return mensagem;
	}
	
	public int imprimir(int numeroInt) {
		return numeroInt;
	}

	public double imprimir(double numeroDouble) {
		return numeroDouble;
	}
	
	public String toString() {
		return "SobrecargaTeste{" +
				"mensagem = " + mensagem +
				"número inteiro = " + numeroInt +
				"número flutuante = " + numeroDouble +
				"}";
	}
}
