package com.vimaj.control;

import java.util.List;

import com.vimaj.model.CartaTroca;
import com.vimaj.model.Jogador;
import com.vimaj.model.Territorio;
import com.vimaj.model.WarException;

public class JogadorController {
	
	private List<Jogador> jogadorService;
	public Jogador jogador; // criei esse atributo
	
	public JogadorController(Jogador j) {
		this.jogador = j; //criei o construtor, pq sem o objeto não é possivel efetuar a troca no outro controller
	}
	public void posicionarExercito(Territorio t) {}
	public void batalhar(Territorio atacante, Territorio defensor) {}
	public void trocar(CartaTroca c, Territorio t)  {
		CardController cd = new CardController();
		try {
		cd.trocar(c, jogador); //alterei a assinatura passando o jogador
		}catch(WarException e) {
			e.printStackTrace();
		}
	}
	public void realizarTransferencia(int numExercitos, Territorio inicio, Territorio fim) {}
}
