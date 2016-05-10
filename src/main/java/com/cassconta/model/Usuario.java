package com.cassconta.model;

import javax.persistence.Entity;

@Entity
public class Usuario extends Entidade {

	private static final long serialVersionUID = -2992864606189400105L;

	private String nome;

	private String senha;

	private String dica;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

}
