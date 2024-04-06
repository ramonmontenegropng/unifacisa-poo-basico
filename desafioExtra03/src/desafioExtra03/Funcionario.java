package desafioExtra03;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
    public Funcionario(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }
	
    public double obterSalarioLiquido() {
        return salarioBruto * (1 - taxa);
    }

    public void aumentoSalario(double percentage) {
        salarioBruto *= (1 + percentage / 100);
    }

    public String toString() {
        return "Nome=" + nome + ", Salário Bruto=" + salarioBruto + ", Salário Líquido=" + obterSalarioLiquido();
    }
    
}
