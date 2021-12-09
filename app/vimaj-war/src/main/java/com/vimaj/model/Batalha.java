package com.vimaj.model;

public class Batalha {
	public Territorio atacante;
	public Territorio Defensor;

	public boolean verificarContiguidade(Territorio atacante, Territorio defensor) {
		return false;
	}

	public boolean verificarQtdExercitos(Territorio atacante) {
		return false;
	}

	public boolean verificarAutoAtaque(Territorio atacante, Territorio defensor) {

		if (atacante.getOcupacao().getCor().equals(defensor.getOcupacao().getCor())) {
			return true;
		} else {
			return false;
		}
	}
}
