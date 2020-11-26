package br.com.casa.projeto;
import java.util.Scanner;

import br.com.casa.rodar.ComodoInvalidoExcption;

public class Sala extends Estrutura {
			
			 private boolean fliperama = false;
			
			 public void ligaFlp(String comodo, boolean liga) {
				
				 try {					 
				 
				 boolean verifica = false;
				 
				 Scanner sai = new Scanner(System.in);

				  System.out.println("Voc� quer ligar o fliperama | 'liga' ou 'desliga'");
				  
				  comodo = sai.next().toLowerCase();		
				  
				  if(verifica == false) {
					  if(comodo.equals("liga")) {
						  System.out.println("O fliperama foi ligada");
						  setFliperama(true);
						  verifica = true;
					  }
					  if(comodo.equals("desliga")) {
						  System.out.println("O fliperama est� desligada");
						  setFliperama(false);
						  verifica = true;
					  }
			      if(verifica == false) {
			    	  	  throw new ComodoInvalidoExcption("Esse comando � invalido");					  
					  }
				  }
				  
				  getLampada().ligandoHaLampada(comodo);
					
			 	}catch (ComodoInvalidoExcption ex) {
			 		String msg = ex.getMessage();
			 		System.out.println("----------------------");
			 		System.out.println(ex.getMessage());
			 		System.out.println("----------------------");
			 	}
				  
			 }		
			 
			 public boolean isfliperamaLigado() {
				 return fliperama;
			 }
			 
			 public void setFliperama(boolean fliperama) {
				this.fliperama = fliperama;
			 }		 
			
	 
}
