import java.util.Scanner;

public class ProjetoBase {		
	
	
	public static void main(String[] args) {	
		
		Casa casa = new Casa();
		
		Scanner s = new Scanner(System.in);	
		
		String comodo = null;		
		
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-="); 
		System.out.println("Para sair escreva 'sair' ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-="); 
	
		do {			
			    System.out.println("--------------------------");
				System.out.println("Qual comodo voc� quer ir ?");
				System.out.println("--------------------------");
				comodo = s.next().toLowerCase();
				
				boolean existeComando = false;			
				
				for(ComodoEnum c: ComodoEnum.values()) {
					if (comodo.equals(c.name())) {
						existeComando = true;
					}
				}
				
				if(comodo.equals("quarto")) {
					casa.getQuarto().ligaTv(comodo, true);
				}
				
				if(comodo.equals("sala")) {
					casa.getSala().ligaFlp(comodo, true);
				}
				
				
				
				if (existeComando == true) {
					System.out.println("----------------------");
					System.out.println("Voc� est� no " + comodo);
					System.out.println("----------------------");
				}else {		
					System.out.println("-----------------------");
					System.out.println("Esse comodo � invalido");						
					System.out.println("-----------------------");
				}
				
				
				
				if(comodo.equals("sair") 
						&& (casa.getQuarto().isTvLigada() || casa.getSala().isflipeLigada())) {
					System.out.println("Desligue a Televis�o primeiro");
				}
				return;
			
		} while (!comodo.equals("sair"));
			
			
	
	}
}
