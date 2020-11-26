package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWrite {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com um arquivo
		
//		OutputStream fos = new FileOutputStream("metodosVistos1.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);		
//		FileWriter fw = new FileWriter("metodosVistos1.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		
		//PrintStream ps = new PrintStream("metodosVistos.txt");
		
		PrintWriter ps = new PrintWriter("metodosVistos.txt");
		
		ps.println("tu que é");
		ps.println();
		ps.println("desbloqueia Skins de Operacional gratuitas, diagramas de armas, por regioes e tokens de XP");
		ps.println();
		ps.println("e prepara-te para a viagem da tua vida num comboio em movimento em Verdansk.");		
		
		ps.close(); // to close Buffer
	}

}
