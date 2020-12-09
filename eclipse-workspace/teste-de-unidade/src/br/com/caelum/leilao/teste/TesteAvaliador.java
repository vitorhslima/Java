package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.caelum.leilao.biulder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import junit.framework.Assert;

public class TesteAvaliador {
	
	private Avaliador leiloeiro;
	private Usuario jose;
	private Usuario maria;
	
	@Before
	public void criaAvaliador() { 
		this.leiloeiro = new Avaliador();  // chama o metoto antes de todods os testes. 
		System.out.println("cria avaliador"); 
		
		this.jose = new Usuario("Jose");
		this.maria = new Usuario("Maria");
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAvaliarSemlances() {
				
			Leilao leilao = new CriadorDeLeilao().para("Placa de video GTX 1.060").constroi();
			leiloeiro.avalia(leilao);
			Assert.fail();	
		
	}
	
//	@Test
//	public void deveEntenderLanceEmOrdemCrecente() {		
//		Leilao leilao = new Leilao("PC gamer Roda tudo");
//		leiloeiro.avalia(leilao);
//	}
//	
	
	
	@Test 	
	public void deveEntenderleilaoComApenasumlance() {
		Usuario paula = new Usuario("Paula");
		Leilao leilao = new Leilao("ps5 novinho");
		
		leilao.propoe(new Lance(paula, 1000.0));
		
		leiloeiro.avalia(leilao);
		
		assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(1000.0, leiloeiro.getMenorLance(), 0.00001);
	}
	
	@Test
	public void deveEncootrarOstResMaioresLances() {			
		
		Leilao leilao = new CriadorDeLeilao().para("Monitor 144 Hz")
				.lance(jose, 100)
				.lance(maria, 200)
				.lance(jose, 300)
				.lance(maria, 400)
				.constroi();
		
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		assertEquals(3, maiores.size());	
	}
	
	@BeforeClass
	public static void testandoBeforeClass() {
	  System.out.println("before class");
	}
							//		Esses etodos s�o executados apenas uma vez 
	@AfterClass
	public static void testandoAfterClass() {
	  System.out.println("after class");
	}
	
//	@After
//	public void finaliza() {
//	  System.out.println("fim"); // Esse metodo executa toda vez que acaba um metodo !
//	}
	

}
