package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaandoLista {
	
	public static void main(String[] args) {
		
		String jogo1 = "Warzone";
		String jogo2 = "Cod Modern Wafare";
		String jogo3 = "Rainbow Six Siege";
		
		ArrayList<String> jogos = new ArrayList<>(); 
		jogos.add(jogo1);
		jogos.add(jogo2);
		jogos.add(jogo3);
		
		for (String jogo : jogos) {
			System.out.println("Jogo: " + jogo);
		}
		
		//jogos.remove(1);
		
		System.out.println("-- Os melhores jogos --");
		
		jogos.forEach(jogo -> {
			System.out.println("jogo: " + jogo);			
		});
		
		System.out.println("==========================================");
		System.out.println(" O primeiro jogo da lista � " + jogos.get(0));
		System.out.println("==========================================");
		
		System.out.println("==========================================");
		System.out.println("Os jogos em Ordem alfabetica:");
		System.out.println("==========================================");
		Collections.sort(jogos);
		System.out.println(jogos);
	}

}
