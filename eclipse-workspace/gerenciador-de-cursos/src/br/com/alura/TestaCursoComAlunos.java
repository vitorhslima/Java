package br.com.alura;

public class TestaCursoComAlunos {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Vitor Hugo");		

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		Aluno a1 = new Aluno("Vitor Hugo", 1001);
		Aluno a2 = new Aluno("Larissa Martins", 1010);
		Aluno a3 = new Aluno("Allan Vinicius", 2020);
		Aluno a4 = new Aluno("Yuji", 3030);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		
		System.out.println("Todos ps alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
//		 while(it.hasNext()) { 					utilizando a moda antiga
//			 System.out.println(it.next());
//		 }
			
		
		System.out.println("O aluno " + a1 + "est� matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno Larissa = new Aluno("Larissa Martins", 1011);
		System.out.println("E essa Larissa, est� matriculada ? ");
		System.out.println(javaColecoes.estaMatriculado(Larissa));
		
		System.out.println("O a2 � equals a larissa");
		System.out.println(a2.equals(Larissa));
		
	}
}
