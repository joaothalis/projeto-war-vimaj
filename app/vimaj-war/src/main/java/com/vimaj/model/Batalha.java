package com.vimaj.model;

public class Batalha {
	public Territorio atacante;
	public Territorio Defensor;
	
	private boolean verificarContiguidade(Territorio atacante, Territorio defensor) {return false;}
	private boolean verificarQtdExercitos(Territorio atacante) {return false;}
	private boolean verificarAutoAtaque(Territorio atacante, Territorio defensor) {return false;}
}
