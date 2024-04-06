package desafioExtra03;

public class Main {
    public static void main(String[] args) {
    	
        Funcionario funcionario1 = new Funcionario("Ramon", 1000, 0.12);
        Funcionario funcionario2 = new Funcionario("Arthur", 15000, 0.1);
        
        System.out.println("GERENCIADOR DE FUNCIONÁRIOS");
        
        System.out.println("Detalhes dos funcionários antes do aumento:");
        
        System.out.println("Funcionário 1 é " + funcionario1);
        System.out.println("Funcionário 2 é " + funcionario2);

        funcionario1.aumentoSalario(7);

        System.out.println("Detalhes dos funcionários após o aumento:");
        
        System.out.println("Funcionário 1 é " + funcionario1);
        System.out.println("Funcionário 2 é " + funcionario2);

        System.out.println("Salários líquidos dos funcionários:");
        
        System.out.println("Funcionário 1 é " + funcionario1.obterSalarioLiquido());
        System.out.println("Funcionário 2 é " + funcionario2.obterSalarioLiquido());
    }
}
