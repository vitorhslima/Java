package br.com.casa.projeto;
import java.util.Scanner;

	public class Escritorio extends Estrutura {
		
		 private boolean PCgamer = false;
		
		public void LigaPcGamer(String comodo) {
			
			boolean verifica = false;
			
			Scanner o = new Scanner(System.in);
			
			System.out.println("===================================================");
			System.out.println("Quer jogar no PC gamer ? | 'jogar' ou 'depois' ");
			System.out.println("===================================================");
			
			comodo = o.next().toLowerCase();
			
			if(verifica == false) {				
				if(comodo.equals("jogar")) {
					System.out.println("O PC gamer foi ligado ");
					setPCgamer(true);
					verifica = true;					
				}
			}	
			
			if(verifica == false) {
				if(comodo.equals("depois")) {
					System.out.println("O PC gamer Está desligado ");
					setPCgamer(false);
					verifica = true;
				}
			}	
			
			if(verifica == false) {
				System.out.println("Esse comando é invalido :/");
			}
			
			getLampada().ligandoHaLampada(comodo);
			
			
		}
		
		public boolean isPCgamerLigado() {
			return PCgamer;
		}

		public void setPCgamer(boolean PCgamer) {
			this.PCgamer = PCgamer;
		}
				
	}
	
	
