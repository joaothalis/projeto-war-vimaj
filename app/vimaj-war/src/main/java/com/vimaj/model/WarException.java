package com.vimaj.model;

import java.util.List;

public class WarException extends RuntimeException{

	
	public WarException(String string) {
		// TODO Auto-generated constructor stub
	}

	public void verificarCartas(List<CartaTroca> c) {
		
		boolean resp = false;
		String simbolo = c.get(0).simbolo;
	
		int cont=0;
		
		boolean r = false;
		if((c.get(0).simbolo.compareToIgnoreCase(c.get(1).simbolo)) ==0) {
			if((c.get(0).simbolo.compareToIgnoreCase(c.get(2).simbolo)) !=0){
				resp = false;
			}else {
				for(CartaTroca carta : c) {
					if(simbolo.compareToIgnoreCase(c.get(cont).simbolo) == 0){
						r= true;
						cont++;
					}else {
						r= false;
						}
					}
				if(r == false) {
					resp = false;
				}else {
					resp = true;
				}
			}
		}
			if(resp == false) {
				throw new WarException("Simbolos fora do padrão.");
			}
			
			}
	
	public void quantidadeCartas(List<CartaTroca> c) {
		
		int contador=0;
	
		for(CartaTroca carta : c) {
			contador++;
	}
		
		if(contador < 3) {
			throw new WarException("Cartas insuficientes para a troca.");
		}else if(contador == 0) {
			throw new WarException("Jogador não possui cartas.");
		}
	}
		
}
