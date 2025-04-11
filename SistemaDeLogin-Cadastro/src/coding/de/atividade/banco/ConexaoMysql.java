package coding.de.atividade.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoMysql {
	private static final String URL = "jdbc:mysql://localhost:3306/registro";
	private static final String USER = "root";
	private static final String PASSWORD = "teste";
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Houve um erro ao se conectar ao banco de dados", "ERRO SERVIDOR", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}

}
