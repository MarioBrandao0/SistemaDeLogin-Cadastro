package coding.de.aula.utils;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Operacoes {
	public static void operacao(String metodoOperacao, JTextField Valor1, JTextField Valor2, JLabel resultado) {
		
		try {
			int valor1Inteiro = Integer.parseInt(Valor1.getText());
			int valor2Inteiro = Integer.parseInt(Valor2.getText());
			
			
			switch (metodoOperacao) {
			case "/":
				if (valor2Inteiro == 0) {
					JOptionPane.showMessageDialog(null, "Não pode divisão por zero", "ERRO", JOptionPane.ERROR_MESSAGE);
					break;
				}
				double valor1Double = (double) valor1Inteiro;
				double valor2Double = (double) valor2Inteiro;
				resultado.setText(String.format("%.2f", valor1Double / valor2Double));
				break;
				
			case "+":
				resultado.setText(String.format("%d", valor1Inteiro + valor2Inteiro));
				break;
				
			case "-":
				resultado.setText(String.format("%d", valor1Inteiro - valor2Inteiro));
				break;
				
			case "*":
				resultado.setText(String.format("%d", valor1Inteiro * valor2Inteiro));
				break;
				
			default:
				break;
			}

		}
		catch (NumberFormatException e) {
			if (Valor1.getText().isBlank() && Valor2.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			else if (Valor2.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Insira o valor 2", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			else if(Valor1.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Insira o valor 1", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
            
        }
	}
}





