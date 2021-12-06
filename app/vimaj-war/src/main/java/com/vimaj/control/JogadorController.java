package com.vimaj.control;

import java.util.List;

import com.vimaj.model.CartaTroca;
import com.vimaj.model.Jogador;
import com.vimaj.model.Territorio;

public class JogadorController {
	private List<Jogador> jogadorService;
	
	public void posicionarExercito(Territorio t) {}
	public void batalhar(Territorio atacante, Territorio defensor) {}
	public void trocar(CartaTroca c, Territorio t) {}
	public void realizarTransferencia(int numExercitos, Territorio inicio, Territorio fim) {}
}
