import java.util.Scanner;

public class Casa {
	
	private Quarto quarto = new Quarto();
	private Sala sala = new Sala();
	private Estrutura estrutura = new Estrutura();	

	public Estrutura getEstrutura() {
		return estrutura;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public void gerenciaCasa() {
		
		Casa casa = new Casa();

		Scanner s = new Scanner(System.in);

		String comodo = "";

		boolean primeiraVez = true;
		casa.getSala().setFliperama(true);
		casa.getQuarto().setTelevisao(true);
		casa.getQuarto().getLampada().setAcessa(true);
		casa.getSala().getLampada().setAcessa(true);

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");  
		System.out.println("Para sair escreva 'sair' ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");

		 
			
		
				
		while ((!comodo.equals("sair")) 
				|| (casa.getSala().isfliperamaLigado()) 
				|| (casa.getQuarto().isTvLigada())
				|| (casa.getSala().getLampada().isAcessa())
				|| (casa.getQuarto().getLampada().isAcessa())) {

			try {
			if (primeiraVez) {
				casa.getSala().setFliperama(false);
				casa.getQuarto().setTelevisao(false);
				casa.getQuarto().getLampada().setAcessa(false);
				casa.getSala().getLampada().setAcessa(false);
				primeiraVez = false;
			}

			System.out.println("--------------------------");
			System.out.println("Qual comodo voc� quer ir ?");
			System.out.println("--------------------------");
			comodo = s.next().toLowerCase();

			boolean existeComando = false;

			for (ComodoEnum c : ComodoEnum.values()) {
				if (comodo.equals(c.name())) {
					existeComando = true;
				}
			}

			if (existeComando == true) {
				if (!comodo.equals("sair")) {
					System.out.println("----------------------");
					System.out.println("Voc� est� no " + comodo);
					System.out.println("----------------------");
				}

			} else {
				if (!comodo.equals("sair")) {
					throw new ComodoInvalidoExcption("Esse comodo � invalido");					
				}
			}

			if (comodo.equals("quarto")) {
				casa.getQuarto().ligaTv(comodo, true);
			}

			if (comodo.equals("sala")) {
				casa.getSala().ligaFlp(comodo, true);
			}

			if (comodo.equals("sair") && (casa.getQuarto().isTvLigada())) {
				System.out.println("Desligue a televis�o para sair");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getSala().isfliperamaLigado())) {
				System.out.println("Desligue o Fliperama para sair");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getQuarto().getLampada().isAcessa())) {
				System.out.println("Apague a lampada do Quarto");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getSala().getLampada().isAcessa())) {
				System.out.println("Apague a lampada da Sala");
				System.out.println("------------------------------");
			}
			
			}catch (ComodoInvalidoExcption ex) {
				String msg = ex.getMessage();
				System.out.println("-----------------------");  
				System.out.println(ex.getMessage());
				System.out.println("-----------------------");
			}				

		}

		
		System.out.println("|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|");
		System.out.println("voc� est� saindo de casa, at� a proxima :)");
		System.out.println("|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|�.�|");
		
	}	
	

}
