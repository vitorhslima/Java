package brasil.br.com.bytebank.banco.teste;

import brasil.br.com.bytebank.banco.modelo.Cliente;
import brasil.br.com.bytebank.banco.modelo.Conta;
import brasil.br.com.bytebank.banco.modelo.ContaCorrente;
import brasil.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		Object[] referencias = new Conta[5];
		
		ContaCorrente cc0 = new ContaCorrente(22, 11);		
		referencias[0] = cc0;
		
		ContaPoupanca cc1 = new ContaPoupanca(22,22);
		referencias[1] = cc1;
		
		Cliente cliente = new Cliente();
		referencias[2] =cliente;
		
//		Object referenciaGenerica = contas[1];
//		System.out.println(referenciaGenerica.getNumero());
		
		//System.out.println(cc1.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		System.out.println(cc1.getNumero());
		System.out.println(ref.getNumero());

	}

}
