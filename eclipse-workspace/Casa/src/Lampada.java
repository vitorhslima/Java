import java.util.Scanner;

public class Lampada {
	
	protected boolean acessa = false;
	
	public void ligandoHaLampada(String lampada) {		
		
		try {
		boolean verifica = false;
		
		Scanner a = new Scanner(System.in);
		System.out.println("====================================================================================");
		System.out.println("Quer acender a lampada ? | Para acender digite 'acesso' Para apagar digite 'apagado' ");
		System.out.println("====================================================================================");
		lampada = a.next().toLowerCase();
		
		
		if(verifica == false) {
			if (lampada.equals("acesso")) {
				System.out.println("--------------------");
				System.out.println("A lampada foi acessa");
				System.out.println("--------------------");
				verifica = true;
				setAcessa(true);
			}
			
			if (lampada.equals("apagado")) {
				System.out.println("---------------------");
				System.out.println("A lampado foi apagada");
				System.out.println("---------------------");
				verifica = true;
				setAcessa(false);
			}
			
			if(verifica == false) {
				throw new ComodoInvalidoExcption("Esse comando � invalido");
			}
		}	
		
		}catch(ComodoInvalidoExcption ex) {
			String msg = ex.getMessage() ;
			System.out.println("---------------------");
			System.out.println(ex.getMessage());
			System.out.println("---------------------");
			
		}
		
	}
	
	public void setAcessa(boolean acessa) {
		this.acessa = acessa;
	}
	
	public boolean isAcessa() {
		return acessa;
	}
	

}
