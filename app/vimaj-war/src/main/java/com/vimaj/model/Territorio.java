package com.vimaj.model;

import java.util.ArrayList;

public class Territorio {
	private String nome;
	private Contiguidade fronteira;
	public Exercito ocupacao;

	ArrayList<Exercito> ListaExercitos = new ArrayList<>();

	public Territorio(String nome) {
		this.nome = nome;
	}

	public int QtdExercitos(Territorio a) {
		int cont = 0;
		for (int i = 0; i < ListaExercitos.size(); i++) {
			cont++;
		}
		return cont;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Exercito getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Exercito ocupacao) {
		this.ocupacao = ocupacao;
	}

	public void setContiguidade(Contiguidade fronteira) {
		this.fronteira = fronteira;
	}
}
