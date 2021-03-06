package br.com.casa.projeto;


public class DesligarTudo {

	private Lampada lampada = new Lampada();
	private Quarto quarto = new Quarto();
	private Banheiro banheiro = new Banheiro();
	private Cozinha cozinha = new Cozinha();
	private Sala sala = new Sala();
	private Escritorio escritorio = new Escritorio();
	
	
	public void desligar(Casa casa) {
		casa.getEscritorio().setPCgamer(false);
		casa.getEscritorio().getLampada().setAcessa(false);
		casa.getSala().setFliperama(false);
		casa.getQuarto().setTelevisao(false);
		casa.getQuarto().getLampada().setAcessa(false);
		casa.getSala().getLampada().setAcessa(false);
		casa.getBanheiro().getLampada().setAcessa(false);
		casa.getCozinha().getLampada().setAcessa(false);
		casa.getBanheiro().setChuveiro(false);
		casa.getCozinha().setFogao(false);
		
		System.out.println("--------------------");
		System.out.println("Tudo foi desligado !");
	}	
	
	
	
	public Lampada getLampada() {
		return lampada;
	}
	public void setLampada(Lampada lampada) {
		this.lampada = lampada;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public Banheiro getBanheiro() {
		return banheiro;
	}
	public void setBanheiro(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	public Cozinha getCozinha() {
		return cozinha;
	}
	public void setCozinha(Cozinha cozinha) {
		this.cozinha = cozinha;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	
	
}
