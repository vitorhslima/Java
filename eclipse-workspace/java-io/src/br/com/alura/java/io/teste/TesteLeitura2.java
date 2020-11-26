package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));		
		while(scanner.hasNextLine()) {  // Para ver se tem proxima linha
			String linha = scanner.nextLine(); // ir para proxima linha
		//	System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt"),"%s - %d-%d, %s: %s %n", tipoConta, agencia, numero, titular, saldo);
			
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[4]);
			
		}		
		
		scanner.close();
		
	}

}
