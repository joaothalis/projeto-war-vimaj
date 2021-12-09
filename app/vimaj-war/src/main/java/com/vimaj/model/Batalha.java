package com.vimaj.model;

public class Batalha {
	public Territorio atacante;
	public Territorio Defensor;
	public Contiguidade c;

	public Batalha(Contiguidade C) {
		this.c = C;
	}


	
	protected Ataque jogadorAtacante = new Ataque();
	protected Defesa jogadorDefensor = new Defesa();
	
	public boolean verificarContiguidade(Territorio atacante, Territorio defensor) {
		boolean resp;
		resp = c.verificarContiguidade(atacante, defensor);
		return resp;
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

	public boolean verificarAutoAtaque(Territorio atacante, Territorio defensor) {

		if (atacante.getOcupacao().getCor().equals(defensor.getOcupacao().getCor())) {
			return true;
		} else {
			return false;
		}
	}
}
