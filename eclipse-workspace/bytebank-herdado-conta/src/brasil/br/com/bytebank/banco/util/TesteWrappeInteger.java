package brasil.br.com.bytebank.banco.util;

import java.util.List;
import java.util.ArrayList;

public class TesteWrappeInteger {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		
		
		Integer idadeRef = Integer.valueOf(29); //new meta 
		//Integer idadeRef = new Integer(29); //metodo antigo de se fazer !
		int valor = idadeRef.intValue();
		
		System.out.println(idadeRef.doubleValue());
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s);
				
		
		System.out.println(numero);
		
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing
		
		
	}
}
