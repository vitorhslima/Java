
public class TestaGetHeSet {

	public static void main(String[] args) {
		Conta conta = new Conta(4446, 01);
		// conta.numero = 1337; Antigamente era assim 
		conta.setNumero(1337);
		System.out.println("O numero da conta � " + conta.getNumero());	
		
		Cliente cabeca = new Cliente();
		//conta.titular = paulo; Era assim
		cabeca.setNome("Cabe�a zika");
		
		conta.setTitular(cabeca); // para vincular uma conta na outra basta 
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println("A profiss�o do " + conta.getTitular().getNome() + 
				" � " + conta.getTitular().getProfissao());
		
		
	}
}
