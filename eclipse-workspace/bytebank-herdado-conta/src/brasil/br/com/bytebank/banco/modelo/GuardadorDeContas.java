package brasil.br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Object[] referencia; 
	private int posicaoLivre;
	
	public GuardadorDeContas( ) {
		this.referencia = new Object[10];
		this.posicaoLivre = 0;
	}

	
	public void adiciana (Object ref) {
		this.referencia[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}


	public int getQuantidadeDeElementos() {		
		return this.posicaoLivre;
	}


	public Object getReferencia(int pos) {		
	return (Object) this.referencia[pos];
	}
	
}
