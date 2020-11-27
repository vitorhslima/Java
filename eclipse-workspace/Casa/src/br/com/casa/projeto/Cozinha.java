package br.com.casa.projeto;

import java.util.Scanner;

public class Cozinha extends Estrutura {
	
	public void ligandoLuzCozinha(String comodo) {
		getLampada().ligandoHaLampada(comodo);
		ligaFogao(comodo);
	}
	
	private boolean fogao = false;

	public void ligaFogao(String comodo) {		

		boolean verifica = false;
		
		Scanner sair = new Scanner(System.in);		  
		
		System.out.println("=================================================================");
		System.out.println("Voc� quer ligar o Fog�o ? | Para liga escreva 'liga' ou 'desliga'");
		System.out.println("=================================================================");
		comodo = sair.next().toLowerCase();
		
		
		if (verifica == false) {
					
				if(comodo.equals("liga")) {
					System.out.println("---------");
					System.out.println("ta ligado");
					System.out.println("---------");					
					verifica = true;
					setFogao(true);
				}				
				
				if (comodo.equals("desliga")) {
					System.out.println("----------------");
					System.out.println("desligou o fog�o");
					System.out.println("-----------------");
					verifica = true;
					setFogao(false);
				}
				
				if (verifica == false) {
					System.out.println("-----------------------");
					System.out.println("Esse comando � invalido");
					System.out.println("-----------------------");
					
				}		
		}
		
		
	}
	
	public boolean isFogaoLigado() {		
		return fogao;
	}
	
	public void setFogao(boolean fogao) {
		this.fogao = fogao;
	}
	
	
}
