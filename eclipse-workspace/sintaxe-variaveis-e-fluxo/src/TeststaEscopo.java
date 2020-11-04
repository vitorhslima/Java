
public class TeststaEscopo {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		
		boolean acompanhado = true;

		if (idade >= 18 && acompanhado) {			
				System.out.println("Seja bem vindo");			
		}else{			
			System.out.println("infelizmente você não pode entrar");
		}
	}
}


