package coding.de.aula.utils;


import javax.swing.JButton;
import javax.swing.JTextField;

public class AdicionarValores {
	public static void adicionandoValores(boolean primeiroCampoSelecionado, JButton botao,JTextField txtValor1, JTextField textValor2) {
		String valor1Guardado = txtValor1.getText();
		String valor2Guardado = textValor2.getText();
		if(primeiroCampoSelecionado) {
			valor1Guardado = valor1Guardado + botao.getText();
			txtValor1.setText(valor1Guardado);
			
		}
		
		else {
			valor2Guardado = valor2Guardado + botao.getText();
			textValor2.setText(valor2Guardado);
		}
		
		
	}

}
