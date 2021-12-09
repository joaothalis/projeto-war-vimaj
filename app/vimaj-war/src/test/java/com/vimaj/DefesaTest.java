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
		
		this.vizinhosAtacante = new Contiguidade();
		this.vizinhosDefensor = new Contiguidade();
		this.vizinhosChile = new Contiguidade();
		
		this.vizinhosAtacante.addVertice(v1);
		this.vizinhosAtacante.addVertice(v2);
		this.vizinhosAtacante.addVertice(v3);
	}
	
	@Test
	public void test01EhContiguidade() {
		Contiguidade exemplo = new Contiguidade();
		boolean actual = exemplo.Verificarcontiguidade(chile, brasil);
		Assert.assertEquals(false, actual);		
	}
	
	@Test
	public void test02() {
		
	}
}
