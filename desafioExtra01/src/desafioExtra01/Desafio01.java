package desafioExtra01;
import javax.swing.JOptionPane;

public class Desafio01 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Vamos conferir se o número é positivo, negativo ou neutro.");
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para conferirmos: "));
		
		if (numero == 0) {
			JOptionPane.showMessageDialog(null, "O número é neutro.");
		} else if (numero > 0) {
			JOptionPane.showMessageDialog(null, "O número é positivo.");
		} else if (numero < 0) {
			JOptionPane.showMessageDialog(null, "O número é negativo.");
		}
	}
}
