import java.util.Scanner;

public class Sala {
			
			 private boolean fliperama = false;
			
			 public void ligaFlp(String comodo, boolean liga) {

				  System.out.println("Voc� quer ligar a fliperama | 'liga' ou 'desliga'");
					
				  if(comodo.equals("liga")) {
					  System.out.println("O fliperama foi ligada");
					  setFliperama(true);
				  }
				  if(!comodo.equals("desliga")) {
					  System.out.println("O fliperama est� desligada");
					  setFliperama(true);
				  }
				  
			 }		
			 
			 public boolean isflipeLigada() {
				 return fliperama;
			 }
			 
			 public void setFliperama(boolean fliperama) {
				this.fliperama = fliperama;
			 }
	 
}
