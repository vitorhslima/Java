import java.util.Scanner;

public class ProjetoBase {
	
	
	
		public static void main(String[] args) {	
		
		Scanner s = new Scanner(System.in);	
		System.out.println("Para qual comodo voc� quer ir ?");
		String comodo = s.next();
		
		boolean existeComando = false;
		
		for(Comodo c: Comodo.values()) {
			if (comodo == (c.name())) {
				existeComando = true;
			}
		}
		
		if (existeComando == false) {
			System.out.println("Esse comodo � invalido");
		}else {		
			System.out.println("Voc� est� no " + comodo);			
		}	
	
	
	}

}
