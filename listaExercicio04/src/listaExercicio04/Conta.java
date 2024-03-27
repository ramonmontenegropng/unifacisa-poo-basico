package listaExercicio04;

public class Conta {

	private int numeroConta;
	private String nome;
	private double saldo;

	public Conta() {
	}

	public Conta(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double depositar(double deposito) {
		return this.saldo = getSaldo() + deposito;
	}

	public double sacar(double saque) {
		return this.saldo = getSaldo() - saque;
	}

	public String toString() {
		return "Conta{" + "Conta: '" + numeroConta + ", Titular: " + nome + ", Balanço: " + saldo + '}';
	}

}
