package com.vimaj;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import com.vimaj.model.Rolagem;

import org.junit.Assert;
import org.junit.Test;

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
}
