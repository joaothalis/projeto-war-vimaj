package com.vimaj.control;

import java.util.ArrayList;
import java.util.List;

import com.vimaj.model.Exercito;
import com.vimaj.model.Rolagem;
import com.vimaj.model.Territorio;

public class BatalhaController {
	ArrayList<Integer> Atacante = new ArrayList<>();
	ArrayList<Integer> Defensor = new ArrayList<>();

	public List<Integer> atacar(Territorio atacante) {
		return null;
	}

	public List<Integer> defender(Territorio defensor) {
		return null;
	}

	public void embateDados(Territorio atacante, Territorio defensor, Rolagem atqRolagem, Rolagem defRolagem) {
	}

	public boolean verificarConquista(Territorio defensor) {
		return false;
	}

	public void conquista(Territorio atacante, Territorio defensor) {
	}

	public void perdasBatalha() {
	}
}
