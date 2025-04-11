package coding.de.atividade.auth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import coding.de.atividade.banco.ConexaoMysql;

public class SistemaLogin {
	private boolean sucesso;
	private String nome;
	
	private static Connection conexao = ConexaoMysql.getConnection();
	
	public SistemaLogin(String email, String senha) {
		String QuerrySql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
		try (PreparedStatement stmt = conexao.prepareStatement(QuerrySql)) {
			stmt.setString(1, email);
			stmt.setString(2, senha);
			
			ResultSet resultado = stmt.executeQuery();
			if(resultado.next()) {
				this.sucesso = true;
				this.nome = resultado.getString("Nome");
			}
			else {
				this.sucesso = false;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			this.sucesso = false;
		}
		
	}
	
	public boolean aprovado() {
		return sucesso;
	}
	
	public String getNome() {
		return nome;
	}
	
}
