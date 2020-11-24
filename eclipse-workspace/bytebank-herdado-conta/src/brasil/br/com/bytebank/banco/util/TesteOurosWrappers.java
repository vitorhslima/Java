package brasil.br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOurosWrappers {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // autoboxin
		System.out.println(idadeRef.intValue());	// unboxing
		
		Double dRef = Double.valueOf(3.2); // autoboxin
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bref = Boolean.FALSE;
		System.out.println(bref.booleanValue());
		
		Number refNumero = Float.valueOf(29.9f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
		
		
	}

}
