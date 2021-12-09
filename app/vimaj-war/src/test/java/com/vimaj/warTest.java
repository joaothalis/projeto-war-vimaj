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
		Transferencia T = new Transferencia();

		Territorio t1 = new Territorio("China");
		Territorio t2 = new Territorio("Japao");
		Territorio t3 = new Territorio("India");
		Territorio t4 = new Territorio("Brasil");
		Territorio t5 = new Territorio("Argentina");

		Vertice v1 = new Vertice("China");
		Vertice v2 = new Vertice("Japao");
		Vertice v3 = new Vertice("India");
		Vertice v4 = new Vertice("Brasil");
		Vertice v5 = new Vertice("Argentina");
		
		LinhaVizinhanca l1 = new LinhaVizinhanca(v1, v2);
		LinhaVizinhanca l2 = new LinhaVizinhanca(v1, v3);
		LinhaVizinhanca l3 = new LinhaVizinhanca(v2, v1);
		LinhaVizinhanca l4 = new LinhaVizinhanca(v3, v1);
		LinhaVizinhanca l5 = new LinhaVizinhanca(v4, v5);
		LinhaVizinhanca l6 = new LinhaVizinhanca(v5, v4);
		v1.addAdj(l1);
		v1.addAdj(l2);
		v2.addAdj(l3);
		v3.addAdj(l4);
		v4.addAdj(l5);
		v5.addAdj(l6);

	}
}
