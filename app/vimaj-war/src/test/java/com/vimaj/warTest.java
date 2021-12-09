package com.vimaj;

import org.junit.Assert;
import org.junit.Test;
import com.vimaj.model.*;
import com.vimaj.control.*;

public class warTest {

	@Test
	public void test01Batalha() {
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Batalha b = new Batalha();
		BatalhaController B = new BatalhaController();
		Contiguidade C = new Contiguidade();
		Ataque a = new Ataque();
		Defesa d = new Defesa();
		EmbateDados E = new EmbateDados();
		Transferencia T = new Tranferencia();

		double actual = resultComponent.getResult();
		double expected = 3;
		Assert.assertEquals(expected, actual, 0.001);
	}
}
