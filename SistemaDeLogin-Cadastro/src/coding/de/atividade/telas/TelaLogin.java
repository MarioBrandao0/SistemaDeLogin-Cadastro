package coding.de.atividade.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import coding.de.atividade.auth.SistemaLogin;
import coding.de.atividade.utils.MensagemDeErro;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldEmail;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaLogin dialog = new TelaLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public TelaLogin() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(193, 60, 46, 14);
		contentPanel.add(lblNewLabel);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(169, 85, 86, 20);
		contentPanel.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblNewSenha = new JLabel("Senha:");
		lblNewSenha.setBounds(192, 119, 46, 14);
		contentPanel.add(lblNewSenha);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(169, 148, 86, 20);
		contentPanel.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setBounds(189, 32, 46, 14);
		contentPanel.add(lblNewLabel_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Login");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (textFieldEmail.getText().trim().isBlank() || textFieldSenha.getText().trim().isBlank()) {
							MensagemDeErro.mostrarMensagem("Por favor preencha todos os campos");
							return;
						}
						
						SistemaLogin loginAprovado = new SistemaLogin(textFieldEmail.getText(), textFieldSenha.getText());
						
						if (!loginAprovado.aprovado()) {
							MensagemDeErro.mostrarMensagem("Email ou Senha incorretos");
							return;
						}
						
						JOptionPane.showMessageDialog(null, "Seja bem vindo " + loginAprovado.getNome());
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
			JButton btnNewButton = new JButton("Cadastrar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaRegistro.main(null);
				}
			});
			buttonPane.add(btnNewButton);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
