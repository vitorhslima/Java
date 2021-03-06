package br.com.caelum.leilao.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class LeilaoTeste {
	
	@Test
	public void deveReceberUmLance() {
		Leilao leilao = new Leilao("Notebook pro prayer !"); 
		assertEquals(0, leilao.getLances().size());
		
		leilao.propoe(new Lance(new Usuario("Ninext"), 2000));
		
		assertEquals(1, leilao.getLances().size());
		assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0.00001);
	}
	
	@Test
	public void deveReceberVariosLances() {
		Leilao leilao = new Leilao("Teclado Mecanico gamer RGB");
		leilao.propoe(new Lance(new Usuario("Zigueira"), 3000));
		leilao.propoe(new Lance(new Usuario("Stolen"), 2500));
		assertEquals(2, leilao.getLances().size());
		assertEquals(3000, leilao.getLances().get(0).getValor(), 0.00001);
		assertEquals(2500, leilao.getLances().get(1).getValor(), 0.00001);
	}
	
	@Test
	public void NaoDeveAceidarDoisLancesSeguidosDoMesmoUsuario() {
		Leilao leilao = new Leilao("Mouse Ped");
		Usuario paranga = new Usuario("Paraganga");
		leilao.propoe(new Lance(paranga, 2000));
		leilao.propoe(new Lance(paranga, 3000));
		
		assertEquals(1, leilao.getLances().size(), 0.00001);
		assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);		
	}
	
	@Test
	public void NaoDeveAceitarMaisDoQue5LancesDoMesmoUsuario() {
		Leilao leilao = new Leilao("HeadSet HyperX Cloud || 7.1");
		Usuario FunkBlackCat = new Usuario("FunkBlackCat");
		Usuario Flakes = new Usuario("Flakes");
		
		leilao.propoe(new Lance(FunkBlackCat, 2000.0));
		leilao.propoe(new Lance(Flakes, 3000.0));
		
		leilao.propoe(new Lance(FunkBlackCat, 4000.0));
		leilao.propoe(new Lance(Flakes, 5000.0));
		
		leilao.propoe(new Lance(FunkBlackCat, 6000.0));
		leilao.propoe(new Lance(Flakes, 7000.0));
		
		leilao.propoe(new Lance(FunkBlackCat, 8000.0));
		leilao.propoe(new Lance(Flakes, 9000.0));
		
		leilao.propoe(new Lance(FunkBlackCat, 10000.0));
		leilao.propoe(new Lance(Flakes, 11000.0));
		
		// devaser ignorado
		leilao.propoe(new Lance(FunkBlackCat, 12000.0));
		
		assertEquals(10, leilao.getLances().size());
		assertEquals(11000.0, leilao.getLances().get(leilao.getLances().size()-1).getValor(), 0.00001);
		
	}

}
