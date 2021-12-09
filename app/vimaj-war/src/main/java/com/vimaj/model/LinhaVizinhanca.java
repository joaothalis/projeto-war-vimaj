package com.vimaj.model;

public class LinhaVizinhanca {
	 Vertice origem;
     Vertice destino;

     LinhaVizinhanca(Vertice origem, Vertice destino) {
         this.origem = origem;
         this.destino = destino;
     }

	public Vertice getOrigem() {
		return origem;
	}

	public Vertice getDestino() {
		return destino;
	}
}
