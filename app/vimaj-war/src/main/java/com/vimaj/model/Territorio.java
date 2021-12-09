package com.vimaj.model;

import java.util.ArrayList;

public class Territorio {
	private String nome;
	public Exercito ocupacao;
	ArrayList<Exercito> ListaExercitos = new ArrayList<>();
	
	public Territorio(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
