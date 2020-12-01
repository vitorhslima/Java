package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class testaAlunos {
	
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>(); 
		alunos.add("Thalita Souza");
		alunos.add("Cristiane lima");
		alunos.add("Vitor Hugo");
		alunos.add("Gleice  Aureliano");
		alunos.add("Marcelo Torres");
		alunos.add("Cabeça Silva");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos); 
		
		System.out.println(alunos.size());
	}

}
