package com.vimaj.control;

import java.util.LinkedList;
import java.util.List;

import com.vimaj.model.CartaTroca;
import com.vimaj.model.Jogador;
import com.vimaj.model.Territorio;

public class JogadorController {
	private List<Jogador> jogadorService;
	
	public JogadorController() {
		this.jogadorService = new LinkedList<Jogador>();
	}
	
	public void setJogador(Jogador j) {
		this.jogadorService.add(j);
	}
	
	public void posicionarExercito(Territorio t) {}
	public void batalhar(Territorio atacante, Territorio defensor) {}
	public void trocar(CartaTroca c, Territorio t) {}
	public void realizarTransferencia(int numExercitos, Territorio inicio, Territorio fim) {}
}
