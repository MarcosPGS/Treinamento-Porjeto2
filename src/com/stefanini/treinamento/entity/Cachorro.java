package com.stefanini.treinamento.entity;

public class Cachorro {
	private String nome;
	private Integer idade;
	
	public Cachorro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cachorro(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Cachorro (Nome: "+ this.nome+ "  Idade: " + this.idade +")\n";
	}

}
