package com.vimaj;

import org.junit.Assert;
import org.junit.Test;
import com.vimaj.control.*;
import com.vimaj.model.*;

public class DefesaTest {
	
	private Contiguidade vizinhosAtacante;
	private Contiguidade vizinhosDefensor;
	private Contiguidade vizinhosChile;
	private Territorio brasil;
	private Territorio peru;
	private Territorio chile;
	private JogadorController jControl;
	private Vertice v1;
	private Vertice v2;
	private Vertice v3;
	private LinhaVizinhanca l1;
	private LinhaVizinhanca l2;
	
	
	public DefesaTest() {
		initializeClass();
		initializeVizinhos();
	}
	
	private void initializeClass() {
		this.brasil = new Territorio("Brazil");
		this.peru = new Territorio("Peru");
		this.chile = new Territorio("Chile");
		
		this.jControl = new JogadorController();
	}
	
	private void initializeVizinhos() {
		this.v1 = new Vertice("Brazil");
		this.v2 = new Vertice("Peru");
		this.v3 = new Vertice("Chile");
		
		this.l1 = new LinhaVizinhanca(this.v1, this.v2);
		this.l2 = new LinhaVizinhanca(this.v2, this.v1);
		
		this.v1.addAdj(l1);
		this.v2.addAdj(l2);
		
		this.vizinhosAtacante = new Contiguidade();
		this.vizinhosDefensor = new Contiguidade();
		this.vizinhosChile = new Contiguidade();
		
		this.vizinhosAtacante.addVertice(v2);
		
		this.brasil.setContiguidade(vizinhosAtacante);
		
		this.vizinhosDefensor.addVertice(v1);
		
		this.peru.setContiguidade(vizinhosDefensor);
		
		this.vizinhosAtacante.addAresta(this.v1, this.v2);
		this.vizinhosDefensor.addAresta(this.v2, this.v1);
		
	}
	
	@Test
	public void test01EhContiguidade() {
		boolean actual = this.vizinhosAtacante.Verificarcontiguidade(peru, brasil);
		Assert.assertEquals(false, actual);		
	}
	
	@Test
	public void test02QtdDados() {
		
	}
}
