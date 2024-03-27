package anotacoesAula01;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Criando coleção
		
		ArrayList<String> nomes = new ArrayList<>();
		
		//Criando scanner para pegar nome de usuários
		
		Scanner sc = new Scanner(System.in);
		
		//Solicitando dados do usuário
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite o segundo nome: ");
		String segundoNome = sc.next();
		
		//Criando sistema para usuário navegar
		
		boolean sair = false;
		
				//Enquanto sair for FALSO, não vai sair do while
				//(!sair) inverte o valor da condição booleana, se era falsa, isso quer dizer que vira true
				//While é para o sistema rodar até o usuário desejar sair
		
		while (!sair) {
			
			//Iniciando o programa
			
			System.out.println("1. Cadastrar nome");
			System.out.println("\n2. Sair");
			
			//Pedindo para o usuário manipular
			
			System.out.println("\nDigite a opção: ");
			int opcao = sc.nextInt();
			
			//Recebendo o nome e adicionando na lista
			
			if (opcao == 1) {
				System.out.println("\n2.Digite seu nome: ");
				String nome1 = sc.next();
				nomes.add(nome1);
				
			//Imprimindo que deu certo
				
				System.out.println("O nome foi cadastrado.");

			}else if (opcao == 2) {
				sair = true;
				
			}	
		}
		
		//Adicionando os dados na lista
		
		nomes.add(nome);
		nomes.add(segundoNome);
		
		// UTILIZANDO O FOR PARA IMPRIMIR OS DADOS FORMATADOS //
			//Int "i" é o nome padrão para variável necessária pro laço for
			//i+1 é para a lista começar em 1
			//nomes get(i) é pra ele puxar a varíavel e ir passando pelo for até terminar
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println((i+1) + ". " + nomes.get(i));
		}
		
	}

}