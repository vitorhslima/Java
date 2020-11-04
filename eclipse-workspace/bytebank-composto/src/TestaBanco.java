
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente vitor = new Cliente();
		vitor.nome = "Vitor Hugo";
		vitor.cpf = "465.513.198-58";
		vitor.profissao = "programador";
		
		Conta contaDoVitor = new Conta();
		contaDoVitor.deposita(100);
				
		// associa o cliente vitor a conta contaDoVitor
		contaDoVitor.titular = vitor;		
		System.out.println(contaDoVitor.titular.nome);
	}

}
