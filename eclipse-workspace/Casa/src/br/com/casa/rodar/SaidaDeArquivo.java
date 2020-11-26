package br.com.casa.rodar;

import java.io.IOException;
import java.io.PrintWriter;

public class SaidaDeArquivo {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter ps = new PrintWriter("arquivo1.txt");
		
		ps.println("O Tio Anderson que é :/ ");		
		
		ps.close(); 
		
	}

}
