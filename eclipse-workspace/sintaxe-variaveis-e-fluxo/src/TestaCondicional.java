
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadeDePessoas = 1;

		if (idade >= 18) {
			System.out.println("Voce tem mais que 18 anos");
			System.out.println("Tu j� pode ser preso hahah");
		}else{
			if(quantidadeDePessoas >= 2) {
				System.out.println("Tu n�o tem 18, por�m est� acompanhado");
			}else {
			System.out.println("Tu n�o pode entrar ! :/");
			}
		}
	}
}
