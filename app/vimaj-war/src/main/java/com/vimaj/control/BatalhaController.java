package com.vimaj.control;

import java.util.List;

import com.vimaj.model.Ataque;
import com.vimaj.model.Batalha;
import com.vimaj.model.Defesa;
import com.vimaj.model.Territorio;

public class BatalhaController extends Batalha {

	List<Integer> dadosAtacante;
	List<Integer> dadosDefensor;

	public BatalhaController(Ataque jogadorAtacante, Defesa jogadorDefensor) {
		this.dadosAtacante = atacar(jogadorAtacante.atacante);
		this.dadosDefensor = defender(jogadorDefensor.defensor);
		this.embateDados(jogadorAtacante.atacante, jogadorDefensor.defensor, dadosAtacante, dadosDefensor);
	}

	public List<Integer> atacar(Territorio atacante) {
		return this.jogadorAtacante.rolarDados(this.jogadorAtacante.cor, this.jogadorAtacante.tropasDisp);
	}

	public List<Integer> defender(Territorio defensor) {
		return this.jogadorDefensor.rolarDados(this.jogadorDefensor.cor, this.jogadorDefensor.tropasDisp);
	}

	public int embateDados(Territorio atacante, Territorio defensor, List<Integer> atqRolagem, List<Integer> defRolagem) {
		atqRolagem.stream().sorted();
		int tamAtq = atqRolagem.size();
		defRolagem.stream().sorted();
		int tamDef = defRolagem.size();
		int aux1 = 0;
		int aux2 = 0;
		int dadosVencidos=0;
		int dadosPerdidos=0;
		
		
		if(tamAtq>tamDef) {
			
			for (int i = 0; i < tamDef; i++) {
				
				aux1 = defRolagem.get(i).intValue();
				aux2 = atqRolagem.get(i).intValue();
				
				if(aux2>aux1) {
					
					dadosVencidos++;
					
				}else {
					
					dadosPerdidos++;
					
				}
			}
			
		} else if(tamDef>tamAtq){
			for (int i = 0; i < tamAtq; i++) {
				
				aux1 = defRolagem.get(i).intValue();
				aux2 = atqRolagem.get(i).intValue();
				
				if(aux1>aux2) {
					
					dadosVencidos++;
					
				}else {
					
					dadosPerdidos++;
					
				}
			}
			
		}
		else{
			for (int i = 0; i < tamDef; i++) {
				
				aux1 = defRolagem.get(i).intValue();
				aux2 = atqRolagem.get(i).intValue();
				
				if(aux2>aux1) {
					
					dadosVencidos++;
					
				}else {
					
					dadosPerdidos++;
					
				}
			}
		}
		
		return 0;

	}

	public boolean verificarConquista(Territorio defensor) {
		return false;
	}

	public void conquista(Territorio atacante, Territorio defensor) {

	}

	public void perdasBatalha() {
	}
}
