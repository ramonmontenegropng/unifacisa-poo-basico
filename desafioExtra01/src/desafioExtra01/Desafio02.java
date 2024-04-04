package desafioExtra01;
import javax.swing.JOptionPane;

public class Desafio02 {
	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para conferirmos: "));
	
		switch (opcao) {	
		case DiasdaSemana.domingo:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
			
		case DiasdaSemana.segunda:
			JOptionPane.showMessageDialog(null, "Segunda");
			break;
			
		case DiasdaSemana.terca:
			JOptionPane.showMessageDialog(null, "Terça");
			break;
			
		case DiasdaSemana.quarta:
			JOptionPane.showMessageDialog(null, "Quarta");
			break;
			
		case DiasdaSemana.quinta:
			JOptionPane.showMessageDialog(null, "Quinta");
			break;
			
		case DiasdaSemana.sexta:
			JOptionPane.showMessageDialog(null, "Sexta");
			break;
			
		case DiasdaSemana.sabado:
			JOptionPane.showMessageDialog(null, "Sábado");
			break;
			
		}
	}
}
