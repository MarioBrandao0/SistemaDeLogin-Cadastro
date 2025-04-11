package coding.de.atividade.utils;

import javax.swing.JOptionPane;

public class MensagemDeErro {
	public static void mostrarMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "ALERTA", JOptionPane.WARNING_MESSAGE);
	}
}
