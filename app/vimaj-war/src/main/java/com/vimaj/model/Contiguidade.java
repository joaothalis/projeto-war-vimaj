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

	boolean Verificarcontiguidade(Territorio a, Territorio b) {
		String inicial = a.getNome();
		String fronteira = b.getNome();
		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).getNome().equals(inicial)) {
				for (int j = 0; j < arestas.size(); j++) {
					if (vertices.get(i).getAdj().get(j).getDestino().getNome().equals(fronteira)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public String toString() {
		String r = "";
		for (Vertice u : vertices) {
			r += u.getNome() + " -> ";
			for (LinhaVizinhanca e : u.getAdj()) {
				Vertice v = e.getDestino();
				r += v.getNome() + ", ";
			}
			r += "\n";
		}
		return r;
	}
}
