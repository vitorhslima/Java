import java.util.Scanner;

public class Sala extends Estrutura {
			
			 private boolean fliperama = false;
			
			 public void ligaFlp(String comodo, boolean liga) {
				 
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
						  System.out.println("Esse comando � invalido");
						  verifica = false;
					  }
				  }
				  
				  getLampada().ligandoHaLampada(comodo);
					
				  
				  
			 }		
			 
			 public boolean isfliperamaLigado() {
				 return fliperama;
			 }
			 
			 public void setFliperama(boolean fliperama) {
				this.fliperama = fliperama;
			 }
	 
}
