package com.vimaj.model;

import java.util.ArrayList;
import java.util.List;

public class Contiguidade {
	List<Vertice> vertices;
    List<LinhaVizinhanca> arestas;

    public Contiguidade() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<LinhaVizinhanca>();
    }

    Vertice addVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    LinhaVizinhanca addAresta(Vertice origem, Vertice destino) {
    	LinhaVizinhanca e = new LinhaVizinhanca(origem, destino);
        origem.addAdj(e);
        arestas.add(e);
        return e;
    }

    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.nome + " -> ";
            for (LinhaVizinhanca e : u.adj) {
                Vertice v = e.destino;
                r += v.nome + ", ";
            }
            r += "\n";
        }
        return r;
}
}
