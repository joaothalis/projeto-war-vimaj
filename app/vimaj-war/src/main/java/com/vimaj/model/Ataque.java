package com.vimaj.model;

import java.util.List;

public class Ataque {
	public String Cor = "Vermelho";
	public Territorio atacante;
	public int tropasDisp;

	public Ataque(Territorio atacante) {
		this.atacante = atacante;
	}

	private List<Rolagem> rolarDados(String cor, int qtdExercitos) {
		return null;
	}

	private boolean verificarQtdExercitos(Territorio atacante) {
		return false;
	}
}
