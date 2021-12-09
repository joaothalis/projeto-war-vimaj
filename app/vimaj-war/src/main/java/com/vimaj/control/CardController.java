package com.vimaj.control;

import java.util.List;

import com.vimaj.model.CartaTroca;
import com.vimaj.model.Jogador;
import com.vimaj.model.Objetivo;

public class CardController {
	public List<CartaTroca> deckCarta;
	public List<Objetivo> deckObjetivo;
	
	private boolean distribuirObjetivos(Jogador j) {return false;}
	private boolean verificarCartas(List<CartaTroca> c) {return false;}
		
	public void trocar(CartaTroca c, Jogador j) {
	
			j.qtdExercitos += 1;
			j.cartas.clear();
		
	}
	private void decrementarCartas(CartaTroca c) {}
	private void receberExercitos(Jogador j, int bonus) {}
	private void darCarta(Jogador j, CartaTroca c) {}
	private void devolverCarta(Jogador j, CartaTroca c) {}
}
