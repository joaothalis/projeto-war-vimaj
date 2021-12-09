package com.vimaj;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.vimaj.control.JogadorController;
import com.vimaj.model.CartaTroca;
import com.vimaj.model.Exercito;
import com.vimaj.model.Jogador;
import com.vimaj.model.Territorio;



public class TrocaTest {
	
	public Jogador jogador;
		
	@Test
	public void trocarRealizada() {
		
		List<CartaTroca> listCartaTroca = new ArrayList();
		List<Territorio> listTerritorio = new ArrayList();
		
		CartaTroca c = new CartaTroca();
		c.nome = "teste";
		c.simbolo = "Circulo";
		
		
		CartaTroca c2 = new CartaTroca();
		c2.nome = "teste2";
		c2.simbolo = "Triangulo";
		
		CartaTroca c3 = new CartaTroca();
		c3.nome = "teste2";
		c3.simbolo = "Quadrado";
		
		
		Exercito exercito = new Exercito("vermelho");
		exercito.valor = 3;
				
		
		Territorio t = new Territorio("Brasil");
		t.ocupacao = exercito; 
		
		
		listCartaTroca.add(c);
		listCartaTroca.add(c2);
		listCartaTroca.add(c3);
		jogador = new Jogador();
		
		jogador.cartas = listCartaTroca;
		
		
		JogadorController jc = new JogadorController();
		
		String mensagem = "";
		
		try {
			jc.trocar(c,t);
			Assert.fail();
		}catch (Exception e) {
			Assert.assertEquals(mensagem, e.getMessage());
		}
		
	}
	
	@Test
	public void trocaNegadaCartasInsuficientes() {
		
		List<CartaTroca> listCartaTroca = new ArrayList();
		List<Territorio> listTerritorio = new ArrayList();
		
		CartaTroca c = new CartaTroca();
		c.nome = "teste";
		c.simbolo = "Quadrado";
		
		Exercito exercito = new Exercito("vermelho");
		exercito.valor = 3;
				
		
		Territorio t = new Territorio("Brasil");
		t.ocupacao = exercito; 
		
		
		listCartaTroca.add(c);
	
		jogador = new Jogador();
		
		jogador.cartas = listCartaTroca;
		
		
		JogadorController jc = new JogadorController();
		
		String mensagem = "Cartas insuficientes para a troca.";
		
		try {
			jc.trocar(c, t);
			fail(mensagem);
		}catch (Exception e) {
			Assert.assertEquals(mensagem, e.getMessage());
		}
		
	}
	
	@Test
	public void trocaNegadaSemCarta() {
		
		List<CartaTroca> listCartaTroca = new ArrayList();
		List<Territorio> listTerritorio = new ArrayList();
		
		CartaTroca c = new CartaTroca();
		
		
		Exercito exercito = new Exercito("vermelho");
		exercito.valor = 3;
				
		
		Territorio t = new Territorio("Brasil");
		t.ocupacao = exercito; 
		
		
		listCartaTroca.add(c);
		jogador = new Jogador();
		
		jogador.cartas = listCartaTroca;
		
		
		JogadorController jc = new JogadorController();
		
		String mensagem = "Jogador não possui cartas.";
		try {
			jc.trocar(c, t);
			fail(mensagem);
		}catch (Exception e) {
			Assert.assertEquals(mensagem, e.getMessage());
		}
		
	}
	
	
	@Test 
	public void testePadraoSimbolosIguais() {
		
				List<CartaTroca> listCartaTroca = new ArrayList();
				List<Territorio> listTerritorio = new ArrayList();
				
				CartaTroca c = new CartaTroca();
				c.nome = "teste";
				c.simbolo = "Circulo";
				
				
				CartaTroca c2 = new CartaTroca();
				c2.nome = "teste2";
				c2.simbolo = "Circulo";
				
				CartaTroca c3 = new CartaTroca();
				c3.nome = "teste2";
				c3.simbolo = "Circulo";
				
				
				Exercito exercito = new Exercito("vermelho");
				exercito.valor = 3;
						
				
				Territorio t = new Territorio("Brasil");
				t.ocupacao = exercito; 
				
				
				listCartaTroca.add(c);
				listCartaTroca.add(c2);
				listCartaTroca.add(c3);
				jogador = new Jogador();
				
				jogador.cartas = listCartaTroca;
				
				JogadorController jc = new JogadorController();
				
				String mensagem = "";
				
				try {
					jc.trocar(c, t);
					fail(mensagem);
				}catch (Exception e) {
					Assert.assertEquals(mensagem, e.getMessage());
				}
	
			}
	
	@Test
	public void testePadraoDosSimbolos() {
		List<CartaTroca> listCartaTroca = new ArrayList();
		List<Territorio> listTerritorio = new ArrayList();
		
		CartaTroca c = new CartaTroca();
		c.nome = "teste";
		c.simbolo = "Circulo";
		
		
		CartaTroca c2 = new CartaTroca();
		c2.nome = "teste2";
		c2.simbolo = "Circulo";
		
		CartaTroca c3 = new CartaTroca();
		c3.nome = "teste2";
		c3.simbolo = "Triangulo";
		
		
		Exercito exercito = new Exercito("vermelho");
		exercito.valor = 3;
				
		
		Territorio t = new Territorio("Brasil");
		t.ocupacao = exercito; 
		
		
		listCartaTroca.add(c);
		listCartaTroca.add(c2);
		listCartaTroca.add(c3);
		jogador = new Jogador();
		
		jogador.cartas = listCartaTroca;
		
		JogadorController jc = new JogadorController();
		
		String mensagem = "";
		
		try {
			jc.trocar(c, t);
			fail(mensagem);
		}catch (Exception e) {
			Assert.assertEquals(mensagem, e.getMessage());
		}
		}
	
	public void trocaDeTurno() {
		//TODO
	}
		
	}
