
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaCris = new Conta();
		System.out.println(contaDaCris.getSaldo());
		
		contaDaCris.titular = new Cliente();
		System.out.println(contaDaCris.titular);
		
		contaDaCris.titular.nome ="Cristiane";		 
		System.out.println(contaDaCris.titular.nome);
	}
}
  