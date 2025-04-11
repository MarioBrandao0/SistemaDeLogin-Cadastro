package coding.de.atividade.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import coding.de.atividade.Formatadores.CpfFormater;
import coding.de.atividade.Formatadores.DataFormater;
import coding.de.atividade.auth.RegistrarUsuario;
import coding.de.atividade.utils.ClearCampos;
import coding.de.atividade.utils.MensagemDeErro;
import coding.de.atividade.utils.VerificadorEmail;
import coding.de.atividade.utils.VerificadorSenha;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class TelaRegistro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldEmail;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNasc;
	private JTextField textFieldCidade;
	private JTextField textFieldSenha;
	private JTextField textFieldConfirmSenha;
	private JTextField textFieldNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaRegistro dialog = new TelaRegistro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private boolean Verification() {
		if(textFieldNome.getText().trim().isBlank() || textFieldEmail.getText().trim().isBlank()|| textFieldCPF.getText().trim().isBlank()|| textFieldDataNasc.getText().trim().isBlank()|| textFieldCidade.getText().trim().isBlank()|| textFieldSenha.getText().trim().isBlank()) {
			MensagemDeErro.mostrarMensagem("Preencha todos os dados");
			return false;
		}
		return true;
	}

	/**
	 * Create the dialog.
	 */
	public TelaRegistro() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(197, 22, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(337, 22, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data Nascimento:");
		lblNewLabel_2.setBounds(165, 105, 90, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade:");
		lblNewLabel_3.setBounds(329, 105, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:");
		lblNewLabel_4.setBounds(197, 172, 46, 14);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmar Senha:");
		lblNewLabel_5.setBounds(294, 172, 99, 14);
		contentPanel.add(lblNewLabel_5);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(158, 47, 110, 20);
		contentPanel.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(294, 47, 110, 20);
		contentPanel.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldDataNasc = new JTextField();
		textFieldDataNasc.setBounds(158, 130, 110, 20);
		contentPanel.add(textFieldDataNasc);
		textFieldDataNasc.setColumns(10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setBounds(294, 130, 110, 20);
		contentPanel.add(textFieldCidade);
		textFieldCidade.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(158, 197, 110, 20);
		contentPanel.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		textFieldConfirmSenha = new JTextField();
		textFieldConfirmSenha.setBounds(294, 197, 110, 20);
		contentPanel.add(textFieldConfirmSenha);
		textFieldConfirmSenha.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nome:");
		lblNewLabel_6.setBounds(58, 22, 46, 14);
		contentPanel.add(lblNewLabel_6);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(18, 47, 110, 20);
		contentPanel.add(textFieldNome);
		textFieldNome.setColumns(10);
		textFieldNome.requestFocus();
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Confirmar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Verification()) {
							String nome = textFieldNome.getText();
							String email = textFieldEmail.getText();
							String cpf = CpfFormater.formatarCPF(textFieldCPF.getText());
							Date dataNascimento = DataFormater.formatarData(textFieldDataNasc.getText());
							String cidade = textFieldCidade.getText();
							String senha = textFieldSenha.getText();
							String confirmarSenha = textFieldConfirmSenha.getText();
							
							boolean emailValido = VerificadorEmail.VerificarEmail(textFieldEmail.getText());
							boolean senhaVerificada = VerificadorSenha.ConfirmarSenha(senha, confirmarSenha);
							
							if(!senhaVerificada) {
								MensagemDeErro.mostrarMensagem("Senhas diferentes");
								return;
							}
							
							if (emailValido && cpf != null && dataNascimento != null) {
								RegistrarUsuario.Registrar(nome, email, cpf, dataNascimento, cidade, senha);
								
								ClearCampos.LimparCampos(Arrays.asList(textFieldNome, textFieldEmail, textFieldCPF, textFieldDataNasc, textFieldCidade, textFieldSenha, textFieldConfirmSenha));
								textFieldNome.requestFocus();
							}
							
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
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



