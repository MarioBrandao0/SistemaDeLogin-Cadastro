package coding.de.aula.TelaCalculadora;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import coding.de.aula.utils.AdicionarValores;
import coding.de.aula.utils.Operacoes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TelaCalculadora extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField TxtValor1;
	private JTextField textValor2;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		try {
			TelaCalculadora dialog = new TelaCalculadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean primeiroCampoSelecionado = true;
	private String metodoOperacao;
	/**
	 * Create the dialog.
	 */
	public TelaCalculadora() {
		setBounds(100, 100, 450, 545);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel TextoCalculadora = new JLabel("Calculadora");
			TextoCalculadora.setBounds(181, 11, 72, 14);
			contentPanel.add(TextoCalculadora);
		}
		
		JLabel LabelValor1 = new JLabel("Valor 1");
		LabelValor1.setBounds(74, 60, 46, 14);
		contentPanel.add(LabelValor1);
		
		TxtValor1 = new JTextField();
		TxtValor1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				primeiroCampoSelecionado = true;
			}
		});
		TxtValor1.setEditable(false);
		TxtValor1.setBounds(74, 86, 305, 20);
		contentPanel.add(TxtValor1);
		TxtValor1.setColumns(10);
		TxtValor1.requestFocus();
		
		
		JLabel labelValor2 = new JLabel("Valor 2");
		labelValor2.setBounds(74, 131, 46, 14);
		contentPanel.add(labelValor2);
		
		textValor2 = new JTextField();
		textValor2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				primeiroCampoSelecionado = false;
			}
		});
		textValor2.setEditable(false);
		textValor2.setBounds(74, 156, 305, 20);
		contentPanel.add(textValor2);
		textValor2.setColumns(10);
		
		JLabel ExebicaoResultado = new JLabel("Resultado");
		ExebicaoResultado.setBounds(190, 207, 63, 14);
		contentPanel.add(ExebicaoResultado);
		
		JLabel resultado = new JLabel("0");
		resultado.setBounds(189, 226, 46, 14);
		contentPanel.add(resultado);
		
		JButton Button9 = new JButton("9");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button9, TxtValor1, textValor2);
			}
		});
		Button9.setBounds(152, 312, 56, 23);
		contentPanel.add(Button9);
		
		JButton Button8 = new JButton("8");
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button8, TxtValor1, textValor2);
			}
		});
		Button8.setBounds(82, 312, 60, 23);
		contentPanel.add(Button8);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, button7, TxtValor1, textValor2);
			}
		});
		button7.setBounds(10, 312, 63, 23);
		contentPanel.add(button7);
		
		JButton Button4 = new JButton("4");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button4, TxtValor1, textValor2);
			}
		});
		Button4.setBounds(10, 346, 63, 23);
		contentPanel.add(Button4);
		
		JButton Button5 = new JButton("5");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button5, TxtValor1, textValor2);
			}
		});
		Button5.setBounds(81, 346, 61, 23);
		contentPanel.add(Button5);
		
		JButton Button6 = new JButton("6");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button6, TxtValor1, textValor2);
			}
		});
		Button6.setBounds(152, 346, 56, 23);
		contentPanel.add(Button6);
		
		JButton Button1 = new JButton("1");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button1, TxtValor1, textValor2);
			}
		});
		Button1.setBounds(10, 380, 63, 23);
		contentPanel.add(Button1);
		
		JButton Button2 = new JButton("2");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button2, TxtValor1, textValor2);
			}
		});
		Button2.setBounds(82, 380, 61, 23);
		contentPanel.add(Button2);
		
		JButton Button3 = new JButton("3");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button3, TxtValor1, textValor2);
			}
		});
		Button3.setBounds(153, 380, 56, 23);
		contentPanel.add(Button3);
		
		JButton Button0 = new JButton("0");
		Button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarValores.adicionandoValores(primeiroCampoSelecionado, Button0, TxtValor1, textValor2);
			}
		});
		Button0.setBounds(84, 422, 54, 23);
		contentPanel.add(Button0);
		
		JButton ButtonDivisao = new JButton("/");
		ButtonDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodoOperacao = ButtonDivisao.getText();
			}
		});
		ButtonDivisao.setBounds(241, 312, 67, 23);
		contentPanel.add(ButtonDivisao);
		
		JButton ButtonMult = new JButton("*");
		ButtonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodoOperacao = ButtonMult.getText();
			}
		});
		ButtonMult.setBounds(241, 346, 67, 23);
		contentPanel.add(ButtonMult);
		
		JButton ButtonSub = new JButton("-");
		ButtonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodoOperacao = ButtonSub.getText();
			}
		});
		ButtonSub.setBounds(241, 380, 67, 23);
		contentPanel.add(ButtonSub);
		
		JButton ButtonSum = new JButton("+");
		ButtonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodoOperacao = ButtonSum.getText();
			}
		});
		ButtonSum.setBounds(241, 416, 67, 23);
		contentPanel.add(ButtonSum);
		
		JButton ButtonIgualdade = new JButton("=");
		ButtonIgualdade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operacoes.operacao(metodoOperacao, TxtValor1, textValor2, resultado);
			}
		});
		ButtonIgualdade.setBounds(152, 422, 63, 23);
		contentPanel.add(ButtonIgualdade);
		
		JButton ButtonClear = new JButton("CE");
		ButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtValor1.setText("");
				textValor2.setText("");
			}
		});
		ButtonClear.setBounds(10, 422, 63, 23);
		contentPanel.add(ButtonClear);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
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
