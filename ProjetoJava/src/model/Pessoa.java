package model;

public class Pessoa {
	
	//atributos
	private String nome;
	private long telefone;
	
	
	//métodos acessores
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(!nome.equals(" ")) {
			this.nome = nome;
		}
		else {
			throw new IllegalArgumentException("'Nome' não pode ser nulo.");
		}
	}
	
	
	public long getTelefone() {
		return telefone;
	}
	
	public void setTelefone (long telefone) {
		if(telefone <= 99999999999l && telefone >= 1000000000l) {
			this.telefone = telefone;
		}
		else {
			throw new IllegalArgumentException("Número inválido. Favor incluir DDD e inserir um telefone celular válido.");
		}
	}
	
	
	//construtores
	public Pessoa (String nome, long telefone) {
		setNome(nome);
		setTelefone(telefone);
	}
}
