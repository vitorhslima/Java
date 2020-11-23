package brasil.br.com.bytebank.banco.teste;

import brasil.br.com.bytebank.banco.modelo.Conta;
import brasil.br.com.bytebank.banco.modelo.ContaCorrente;
import brasil.br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciana(cc);
		
		Conta cc2 = new ContaCorrente(33, 13);
		guardador.adiciana(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println("O numero da conta � " + ref.getNumero());
		
	}
}
