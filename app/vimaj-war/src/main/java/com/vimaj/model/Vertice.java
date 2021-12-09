package com.vimaj.model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
	String nome;
    List<LinhaVizinhanca> adj;

    Vertice(String nome) {
        this.nome = nome;
        this.adj = new ArrayList<LinhaVizinhanca>();
    }

    void addAdj(LinhaVizinhanca e) {
        adj.add(e);
    }
}
