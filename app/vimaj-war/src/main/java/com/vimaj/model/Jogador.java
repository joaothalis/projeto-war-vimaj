package com.vimaj.model;

import java.util.List;

public class Jogador {
	public String nome;
	public String cor;
	public int qtdExercitos;
	public int qtdExercitosBonus;
	public List<CartaTroca> cartas;
	public List<Territorio> territoriosPossuidos;
	public List<Continente> continentesPossuidos;
	
	private boolean winCheck(Territorio t) {return false;}
	private void receberExercitos(Jogador j, int qtdExer) {}
	private int bonusPorContinente(Continente c) {return 0;}
	
}
