package com.vimaj.model;

import java.util.List;

public class Defesa {
	public String cor;
	public Territorio defensor;
	public int tropasDisp;

	public List<Integer> rolarDados(String cor, int qtdExercitos) {
<<<<<<< Updated upstream
		Rolagem a = new Rolagem(cor, qtdExercitos);
		 a.rolarDados(cor, qtdExercitos);
		 
		return a;
	}

	public boolean verificarQtdExercitos(Territorio defensor) {
		int quantidade;
		quantidade = defensor.QtdExercitos(defensor);
		if (quantidade > 0) {
			return true;
		} else {
			return false;
		}
=======
		return null;
	}

	public boolean verificarQtdExercitos(Territorio atacante) {
		return false;
>>>>>>> Stashed changes
	}
}
