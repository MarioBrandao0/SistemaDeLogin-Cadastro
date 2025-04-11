package coding.de.atividade.auth;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

import coding.de.atividade.banco.ConexaoMysql;
import coding.de.atividade.utils.VerificadorEmail;


public class RegistrarUsuario {
	private static final Connection CONEXAO = ConexaoMysql.getConnection();
	public static void Registrar(String nome, String email, String cpf, Date dataNascimento, String cidade, String senha) {
		String QuerrySQL = "INSERT INTO usuarios(nome, email, cpf, dataNascimento, cidade, senha) VALUES(?, ?, ?, ?, ?, ?)";
		
		try (PreparedStatement stmt = CONEXAO.prepareStatement(QuerrySQL)) {
			stmt.setString(1, nome);
			stmt.setString(2, email);
			stmt.setString(3, cpf);
			stmt.setDate(4, dataNascimento);
			stmt.setString(5, cidade);
			stmt.setString(6, senha);
			
			int resultado = stmt.executeUpdate();
			
			if (resultado > 0) {
				JOptionPane.showMessageDialog(null, "Usuario Cadastrado com Sucesso");
			}
		}
		
		catch(SQLException e) {}
	}
}
	

