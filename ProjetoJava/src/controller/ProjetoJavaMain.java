package controller;
import view.TelaCadastroPessoa;

import javax.swing.JOptionPane;

import model.Pessoa;

public class ProjetoJavaMain implements IOuvinteBtn{

	public static void main(String[] args) {
		TelaCadastroPessoa tela = new TelaCadastroPessoa(new ProjetoJavaMain());
		tela.setVisible(true);
	}
	
	public void gravaPessoa (Pessoa p) {
		JOptionPane.showMessageDialog(null, "A pessoa " + p.getNome() + " de número " + p.getTelefone() + " foi cadastrada com sucesso.");
	}
}
