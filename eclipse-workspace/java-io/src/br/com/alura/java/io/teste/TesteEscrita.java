package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com um arquivo
		
		OutputStream fos = new FileOutputStream("metodosVistos1.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Ganha novas armas funcionais, compete pela gloria no recem-aberto estadio em Warzone");
		bw.newLine();		
		bw.write("desbloqueia Skins de Operacional gratuitas, diagramas de armas, por regioes e tokens de XP");
		bw.newLine();
		bw.write("e prepara-te para a viagem da tua vida num comboio em movimento em Verdansk.");
		
		bw.close(); // to close Buffer
	}

}
