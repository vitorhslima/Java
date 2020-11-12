import java.util.Scanner;

public class ProjetoBase {
	
	public static void main(String[] args) {	
		
		Scanner s = new Scanner(System.in);	
		
		String comodo = null;
		
		System.out.println("Para sair escreva 'sair' ");		
	
			do {			
		
			System.out.println("Para qual comodo voc� quer ir ?");
			comodo = s.next();
			
			boolean existeComando = false;			
			
			for(Comodo c: Comodo.values()) {
				if (comodo.equals(c.name())) {
					existeComando = true;
				}
			}
			
			if (existeComando == false) {
				System.out.println("Esse comodo � invalido");
			}else {		
				System.out.println("Voc� est� no " + comodo);			
			}
			
		} while (!comodo.equals("sair"));
	
	System.out.println("Saindo de Casa");
			
	}
}
