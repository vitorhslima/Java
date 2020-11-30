package br.com.casa.projeto;

public class LigaTudo {

	private Lampada lampada = new Lampada();
	private Quarto quarto = new Quarto();
	private Banheiro banheiro = new Banheiro();
	private Cozinha cozinha = new Cozinha();
	private Sala sala = new Sala();


public void ligar(Casa casa) {
	casa.getSala().setFliperama(true);
	casa.getQuarto().setTelevisao(true);
	casa.getQuarto().getLampada().setAcessa(true);
	casa.getSala().getLampada().setAcessa(true);
	casa.getBanheiro().getLampada().setAcessa(true);
	casa.getCozinha().getLampada().setAcessa(true);
	casa.getBanheiro().setChuveiro(true);
	casa.getCozinha().setFogao(true);
	
	System.out.println("--------------------");
	System.out.println("Tudo foi ligado !");
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
