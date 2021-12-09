package com.vimaj.model;

import java.util.List;

public class Ataque {
	public String Cor = "Vermelho";
	public Territorio atacante;
	public int tropasDisp;

	public Ataque() {
	//	this.atacante = atacante;
	}

	public List<Integer> rolarDados(String cor, int qtdExercitos) {
		return null;
	}

	public boolean verificarQtdExercitos(Territorio atacante) {
		int quantidade;
		quantidade = atacante.QtdExercitos(atacante);
		if (quantidade > 1) {
			return true;
		} else {
			return false;
		}
	}
}
