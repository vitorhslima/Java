package br.com.casa.projeto;
import java.util.Scanner;

import br.com.casa.rodar.ComodoInvalidoExcption;

public class Quarto extends Estrutura {	

		private boolean televisao = false;
	
			public void ligaTv(String comodo, boolean liga) {
				
			  try {
				boolean Verificador = false;
				
				Scanner sair = new Scanner(System.in);	
		
				System.out.println("Você quer ligar a televisão | 'liga' ou 'desliga'");
				
				comodo = sair.next().toLowerCase();
				
				if(Verificador == false) { 
						if (comodo.equals("liga")) {
							System.out.println("A televisão foi ligada");
							setTelevisao(true);
							Verificador = true;
						}
						
						if(comodo.equals("desliga")) {
						System.out.println("A televisão está desligada");
						setTelevisao(false);
						Verificador = true;	
						}
							
						if(Verificador == false) {
							throw new ComodoInvalidoExcption("Esse comando é invalido");						
						}									
				}		
				
				getLampada().ligandoHaLampada(comodo);
						
				
			  }catch(ComodoInvalidoExcption ex) {
				  String msg = ex.getMessage();
				  System.out.println("---------------------");
				  System.out.println(ex.getMessage());
				  System.out.println("---------------------");
			  }
				
			}
				
		
		public boolean isTvLigada() {		
			return televisao;
		}
		
		public void setTelevisao(boolean televisao) {
			this.televisao = televisao;
		}
		
}
