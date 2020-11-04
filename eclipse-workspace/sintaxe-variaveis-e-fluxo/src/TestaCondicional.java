
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadeDePessoas = 1;

		if (idade >= 18) {
			System.out.println("Voce tem mais que 18 anos");
			System.out.println("Tu já pode ser preso hahah");
		}else{
			if(quantidadeDePessoas >= 2) {
				System.out.println("Tu não tem 18, porém está acompanhado");
			}else {
			System.out.println("Tu não pode entrar ! :/");
			}
		}
	}
}
