package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

	private String descricao;
	private List<Lance> lances;
	
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		qtdDelancesDo(lance.getUsuario());
		
		
		if (lances.isEmpty() || podeDarlance(lance.getUsuario())) {
			lances.add(lance);			
		}
	}

	private boolean podeDarlance(Usuario usuario) {
		return !UltimolanceDado().getUsuario().equals(usuario) && qtdDelancesDo(usuario) < 5;
	}

	private int qtdDelancesDo(Usuario usuario) {
		int total = 0;		
		for (Lance l : lances) {
			if(l.getUsuario().equals(usuario))  total++;
		}
		return total;
	}

	private Lance UltimolanceDado() {
		return lances.get(lances.size()-1);
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

	
	
}
