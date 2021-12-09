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
		
		Vertice v1 = new Vertice("China");
		Vertice v2 = new Vertice("Japao");
		Vertice v3 = new Vertice("India");
		Vertice v4 = new Vertice("Brasil");
		Vertice v5 = new Vertice("Argentina");
		LinhaVizinhanca l1 = new LinhaVizinhanca(v1,v2);
		LinhaVizinhanca l2 = new LinhaVizinhanca(v1,v3);
		LinhaVizinhanca l3 = new LinhaVizinhanca(v4,v5);
		v1.setAdj(l1);
		
		Territorio China;
		Territorio Japao;
		Territorio India;
		Territorio Brasil;
		
	}
}
