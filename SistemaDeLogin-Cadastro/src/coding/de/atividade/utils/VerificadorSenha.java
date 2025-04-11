package coding.de.atividade.utils;

public class VerificadorSenha {
	public static boolean ConfirmarSenha(String senha, String confirmarSenha) {
		
		if (senha.equals(confirmarSenha)) {
			return true;
		}
		
		return false;
	}
}
