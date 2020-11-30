package br.com.casa.projeto;
import java.awt.dnd.DropTargetListener;
import java.util.Scanner;

import br.com.casa.rodar.ComodoEnum;
import br.com.casa.rodar.ComodoInvalidoExcption;

public class Casa {
	
	private Quarto quarto = new Quarto();
	private Sala sala = new Sala();
	private Estrutura estrutura = new Estrutura();
	private Banheiro banheiro = new Banheiro();
	private Cozinha cozinha = new Cozinha();
	private DesligarTudo desligar = new DesligarTudo();
	private LigaTudo liga = new LigaTudo();
	
	public LigaTudo getLiga() {
		return liga;
	}
	
	public DesligarTudo getDesligarTudo() {
		return desligar;
	}
	
	public Cozinha getCozinha() {
		return cozinha;
	}
	
	public Banheiro getBanheiro() {
		return banheiro;
	}

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
		casa.getBanheiro().getLampada().setAcessa(true);
		casa.getCozinha().getLampada().setAcessa(true);
		casa.getBanheiro().setChuveiro(true);
		casa.getCozinha().setFogao(true);

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");  
		System.out.println("Para sair escreva 'sair' ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("===================ATEN��O==================");
		System.out.println("Para desligar tudo basta escrever 'desligar'");
		System.out.println("============================================");

		 
			
		
				
		while ((!comodo.equals("sair")) 
				|| (casa.getSala().isfliperamaLigado()) 
				|| (casa.getQuarto().isTvLigada())
				|| (casa.getSala().getLampada().isAcesa())
				|| (casa.getQuarto().getLampada().isAcesa())
				|| (casa.getBanheiro().getLampada().isAcesa())
				|| (casa.getCozinha().getLampada().isAcesa())
		        || (casa.getBanheiro().isChuveiroAberto())
				|| (casa.getCozinha().isFogaoLigado()))	{

			try {
			if (primeiraVez) {
				casa.getSala().setFliperama(false);
				casa.getQuarto().setTelevisao(false);
				casa.getQuarto().getLampada().setAcessa(false);
				casa.getSala().getLampada().setAcessa(false);
				casa.getBanheiro().getLampada().setAcessa(false);
				casa.getCozinha().getLampada().setAcessa(false);
				casa.getBanheiro().setChuveiro(false);
				casa.getCozinha().setFogao(false);
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
				if (!comodo.equals("sair")) {}
			} else {
				if (!comodo.equals("sair")) {
					throw new ComodoInvalidoExcption("Esse comodo � invalido");					
				}
			}

			if (comodo.equals("quarto")) {
				System.out.println("-------------------");
				System.out.println("Voc� est� no Quarto");
				System.out.println("-------------------");
				casa.getQuarto().ligaTv(comodo, true);
			}

			if (comodo.equals("sala")) {
				System.out.println("-------------------");
				System.out.println("Voc� est� na Sala");
				System.out.println("-------------------");
				casa.getSala().ligaFlp(comodo, true);
			}
			
			if (comodo.equals("banheiro")) {
				System.out.println("-------------------");
				System.out.println("Voc� est� no Banheiro");
				System.out.println("-------------------");
				casa.getBanheiro().ligandoLuzBanheiro(comodo);
			}
			
			if(comodo.equals("cozinha")) {
				System.out.println("-------------------");
				System.out.println("Voc� est� na Cozinha");
				System.out.println("-------------------");
				casa.getCozinha().ligandoLuzCozinha(comodo);
			}
			
			if (comodo.equals("desligar")) {
				getDesligarTudo().desligar(casa);
			}
			
			if (comodo.equals("ligart")) {
				getLiga().ligar(casa);
			}
				

			if (comodo.equals("sair") && (casa.getQuarto().isTvLigada())) {
				System.out.println("Desligue a televis�o para sair");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getSala().isfliperamaLigado())) {
				System.out.println("Desligue o Fliperama para sair");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getQuarto().getLampada().isAcesa())) {
				System.out.println("Apague a luz do Quarto");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getSala().getLampada().isAcesa())) {
				System.out.println("Apague a luz da Sala");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getBanheiro().getLampada().isAcesa())) {
				System.out.println("Apague a luz do Banheiro");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getCozinha().getLampada().isAcesa())) {
				System.out.println("Apague a luz da Cozinha");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getBanheiro().isChuveiroAberto() )) {
				System.out.println("Feche o chuveiro");
				System.out.println("------------------------------");
			}
			
			if (comodo.equals("sair") && (casa.getCozinha().isFogaoLigado() )) {
				System.out.println("Desligue o fog�o primeiro");
				System.out.println("------------------------------");
			}
			
			} catch (ComodoInvalidoExcption ex) {
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
