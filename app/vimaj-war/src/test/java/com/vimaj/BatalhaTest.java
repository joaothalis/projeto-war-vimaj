package com.vimaj;

import static org.junit.Assert.fail;


import java.util.ArrayList;
import java.util.List;
import com.vimaj.model.Rolagem;
import com.vimaj.model.Territorio;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matcher.*;
import static org.junit.Assert.*;
public class BatalhaTest {

	static int min = 1;
	static int max = 6;
	private static List<Integer> resultadoRolagem = new ArrayList<>();

	public static List<Integer> rolarDados(String cor, int qtdExercitos) { // TODO: Condição para exercito defensor
		if (qtdExercitos > 3)
			qtdExercitos = 4;
		for (int i = 1; i < qtdExercitos; i++) {
			resultadoRolagem.add((int) Math.floor(Math.random() * (max) + min));
		}
		return resultadoRolagem;
	}

	@Test
	public void test01MaximoDeDados() {
		int expected = 3;
		try {
			List<Integer> result = rolarDados("x", 30);
			int actual = result.size();
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test02MinimoDeDados() {
		int expected = 1;
		resultadoRolagem.clear();
		try {
			List<Integer> result = rolarDados("x", 2);
			int actual = result.size();
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	// pré condições, desenvolver para teste
	public boolean verificarContiguidade(Territorio atacante, Territorio defensor) {
		boolean resp;
		resp = c.Verificarcontiguidade(atacante, defensor);
		try {
			List<Integer> result = rolarDados("x", 2);
			int actual = result.size();
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public boolean verificarQtdExercitos(Territorio atacante) {
		int actual = atacante.QtdExercitos(atacante);
		int expected = 2;
		try {
			List<Integer> result = rolarDados("x", 2);
			int actual = result.size();
			assertThat(expected, greaterhan(1));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public boolean verificarAutoAtaque(Territorio atacante, Territorio defensor) {

		if (atacante.getOcupacao().getCor().equals(defensor.getOcupacao().getCor())) {
			return true;
		} else {
			return false;
		}
		try {
			List<Integer> result = rolarDados("x", 2);
			int actual = result.size();
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
