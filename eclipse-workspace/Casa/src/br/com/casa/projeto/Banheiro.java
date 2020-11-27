package br.com.casa.projeto;
import java.util.Scanner;

public class Banheiro extends Estrutura {
	
	  public void ligandoLuzBanheiro(String comodo) {
		  getLampada().ligandoHaLampada(comodo);
		  ligandoChuveiro(comodo);
	  }
	  
	  private boolean chuveiro = false;
	  
	  public void ligandoChuveiro(String comodo) {
		  
		  Scanner sair = new Scanner(System.in);		  
		  
		  System.out.println("=====================================================================");
		  System.out.println("Quer tomar um banho ? | Para abri a �gua escreva 'abrir' ou 'fechar' ");
		  System.out.println("=====================================================================");
		  comodo = sair.next().toLowerCase();
		  
		  
		  boolean verificador = false;
		  
		if (verificador == false) {			
		
			  if (comodo.equals("abrir")) {
				 System.out.println("----------------------");
				 System.out.println("O chuveiro est� aberto");
				 System.out.println("----------------------");
				 setChuveiro(true);
				 verificador = true;
			  }	
			  
			  if (comodo.equals("fechar")) {
				System.out.println("----------------------");
				System.out.println("O chuveiro est� fechado");
				System.out.println("----------------------");
				setChuveiro(false);
				verificador = true;
			  }
			  
			  if (verificador == false) {
				System.out.println("-----------------------");
				System.out.println("Esse comando � invalido");
				System.out.println("-----------------------");				
			  }
		  
		  }			
		  
		  
	  }
	  
	  public boolean isChuveiroAberto() {			
			return chuveiro;
	  }

	

	  public void setChuveiro(boolean chuveiro) {
			this.chuveiro = chuveiro;
	  }
}
