package com.vimaj.model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
	String nome;
    List<LinhaVizinhanca> adj;

   public Vertice(String nome) {
        this.nome = nome;
        this.adj = new ArrayList<LinhaVizinhanca>();
    }

    void addAdj(LinhaVizinhanca e) {
        getAdj().add(e);
    }

	public String getNome() {
		return nome;
	}

	public List<LinhaVizinhanca> getAdj() {
		return adj;
	}
    public void setAdj(List<LinhaVizinhanca> adj) {
		this.adj = adj;
	}
}
