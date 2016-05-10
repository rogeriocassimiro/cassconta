package com.cassconta.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Contato extends Entidade{

	private static final long serialVersionUID = -1898613822320743612L;
	
	private String nome;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Usuario usuario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
