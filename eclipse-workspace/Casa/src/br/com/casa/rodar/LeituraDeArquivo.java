package br.com.casa.rodar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.Charset;

public class LeituraDeArquivo {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:\\leitura\\arquivo.txt");
		Reader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();	
		
		System.out.println(linha);
		linha = br.readLine();	
		
		PrintWriter ps = new PrintWriter("C:\\leitura\\arquivo.txt",Charset.forName("UTF-8"));
		ps.println("O Tio Anderson que é :/ ");		
		
		ps.close();
		
		
		
		br.close();
		
	}

}
