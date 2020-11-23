package brasil.br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.LinkedList;

import brasil.br.com.bytebank.banco.modelo.Conta;
import brasil.br.com.bytebank.banco.modelo.ContaCorrente;

public class Testearraylist {

	public static void main(String[] args) {
		
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);		
		boolean existe = lista.contains(cc3);
		
		
		System.out.println("já existe " + existe);
		
		System.out.println("-------//---------");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}

	}

}
