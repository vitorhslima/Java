

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		//System.out.println("O toal de contas abertas � " + total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);		
 
 	public boolean saca(double valor) {	 
 		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo indisponivel");
			return false;
		}
    }
 	
 	public boolean transfere(double valor, Conta destino) {
 		if (this.saca(valor)) {			
			destino.deposita(valor);
			return true;
		}else {
				System.out.println("Saldo indisponivel");
			return false;
		 	  }
 	} 
 	
 	
 	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
 	
 	public double getSaldo() {
 		return this.saldo;
 	}
 	
 	public int getNumero() {
 		return this.numero;
 	}
 	
 	public void setNumero(int novoNumero) {
 		if (numero <= 0) {
 			System.out.println("N�o pode numero menor do que 0");
			return;
		}
 		this.numero = novoNumero;
 		}
 	
 	public int getAgencia() {
		return this.agencia;
	}
 	
 	public void setAgencia(int agencia) {
 		if (agencia <= 0) {
			System.out.println("N�o pode agencia menor que 0");
			return;
		}
		this.agencia = agencia;
	}
 	
 	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
 	
 	public Cliente getTitular() {
		return titular;
	}
 	
 	public static int getTotal() {
 		return total;
 	}
}
