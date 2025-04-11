package coding.de.atividade.Formatadores;

import javax.swing.JOptionPane;

public class CpfFormater {
	public static String formatarCPF(String cpf) {
		cpf = cpf.replaceAll("[^\\d]", "");
		
		if (cpf.length() != 11) {
			JOptionPane.showMessageDialog(null, "CPF INVALIDO. INSIRA UM CPF VALIDO", "ALERTA", JOptionPane.WARNING_MESSAGE);
	        return null;
	    }
		return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
	}
}
