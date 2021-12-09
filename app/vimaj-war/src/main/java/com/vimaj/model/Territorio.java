package com.vimaj.model;

import java.util.ArrayList;

public class Territorio {
	private String nome;
	private Contiguidade fronteira;
	public Exercito ocupacao;
	ArrayList<Exercito> ListaExercitos = new ArrayList<>();
	
	public Territorio(String nome, Contiguidade fronteira) {
		this.nome = nome;
		this.fronteira = fronteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contiguidade getFronteira() {
		return fronteira;
	}

	public void setFronteira(Contiguidade fronteira) {
		this.fronteira = fronteira;
	}

}
