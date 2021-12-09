package com.vimaj.model;

import java.util.ArrayList;
import java.util.List;

public class Rolagem {

	static int min = 1;
	static int max = 6;
	private static List<Integer> resultadoRolagem = new ArrayList<>();

	public Rolagem(String cor, int qtdExercitos) {
		resultadoRolagem.clear();
	}

	public static List<Integer> rolarDados(String cor, int qtdExercitos) { // TODO: Condição para exercito defensor
		if (qtdExercitos > 3)
			qtdExercitos = 4;
		for (int i = 1; i < qtdExercitos; i++) {
			resultadoRolagem.add((int) Math.floor(Math.random() * (max) + min));
		}
		return resultadoRolagem;
	}
}