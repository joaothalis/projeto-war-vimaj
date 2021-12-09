package com.vimaj.model;

public class Exercito {
	public int valor = 1;
	private String cor;
	public Exercito(String cor) {
		this.setCor(cor);
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
