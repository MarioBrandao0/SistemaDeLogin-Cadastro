package coding.de.atividade.utils;



import java.util.List;

import javax.swing.JTextField;

public class ClearCampos {
	public static void LimparCampos(List<JTextField> campos) {
		for (JTextField campo : campos) {
			campo.setText("");
			
		}
	}
}
