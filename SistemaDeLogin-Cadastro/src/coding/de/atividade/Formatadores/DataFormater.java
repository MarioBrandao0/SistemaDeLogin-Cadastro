package coding.de.atividade.Formatadores;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class DataFormater {
	public static Date formatarData(String dataNascimentoTexto) {
		try {
			DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate data = LocalDate.parse(dataNascimentoTexto, formatadorData);
			
			return Date.valueOf(data);
		}
		catch(DateTimeParseException e) {
			JOptionPane.showMessageDialog(null, "Porfavor insira a data no modo DD/MM/YYYY", "ALERTA", JOptionPane.WARNING_MESSAGE);
			return null;
		}
		
	}
}
