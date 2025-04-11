package coding.de.atividade.utils;

import javax.swing.JOptionPane;

public class VerificadorEmail {
	public static boolean VerificarEmail(String email) {
		String[] arrayEmailValidos = {"@gmail", "@hotmail", "@outlook"};
		String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
		if (email.matches(regex)) {
			
			for (String dominio : arrayEmailValidos)
				if (email.contains(dominio)) {
					return true;
				}
		}
		JOptionPane.showMessageDialog(null, "Email invalido", "ALERTA", JOptionPane.WARNING_MESSAGE);
		return false;
	}
}
