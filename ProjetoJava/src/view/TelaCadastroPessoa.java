package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controller.IOuvinteBtn;
import model.Pessoa;

public class TelaCadastroPessoa extends JFrame {

	//atr para armazenar dados no bd
	private IOuvinteBtn btnOuvinte;
	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa frame = new TelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	private TelaCadastroPessoa() {
		setTitle("Cadastro de pessoa");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 159);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 50, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 23, 63, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 48, 63, 20);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(83, 22, 301, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(83, 50, 301, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastra();
			}
		});
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setBackground(new Color(102, 0, 153));
		btnCadastrar.setFont(new Font("Unispace", Font.PLAIN, 14));
		btnCadastrar.setBounds(255, 81, 129, 23);
		contentPane.add(btnCadastrar);
	}
	
	public TelaCadastroPessoa(IOuvinteBtn bntOuvinte) {
		this(); //chamando o outro contrutor sem parâmetros
		this.btnOuvinte = bntOuvinte;
	}
	
	private void cadastra() {
		String nome = txtNome.getText();
		long telefone = Long.parseLong(txtTelefone.getText());
		Pessoa p = new Pessoa (nome, telefone);
		btnOuvinte.gravaPessoa(p);
	}
}
