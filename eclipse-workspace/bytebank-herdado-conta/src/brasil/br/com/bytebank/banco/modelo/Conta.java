package brasil.br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Zinho
 *
 */


public abstract class Conta implements Comparable<Conta>,Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		total++;
		//System.out.println("O toal de contas abertas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);		
 
	/**
	 * valor precisa ser maior que o saldo 
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
 	public void saca(double valor) throws SaldoInsuficienteException {	
 		
 		if (this.saldo < valor)  {
 			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);				
		}
 		this.saldo -= valor;
    }
 	
 	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
 		this.saca(valor);			
		destino.deposita(valor);			
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
 			System.out.println("Não pode numero menor do que 0");
			return;
		}
 		this.numero = novoNumero;
 		}
 	
 	public int getAgencia() {
		return this.agencia;
	}
 	
 	public void setAgencia(int agencia) {
 		if (agencia <= 0) {
			System.out.println("Não pode agencia menor que 0");
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
 	
 	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " +  this.agencia +  ", Saldo: " + this.saldo;
	}
 	
 	@Override
 	public boolean equals(Object ref) {
 		
 		Conta outra = (Conta) ref;
 		
 		if (this.agencia != outra.agencia) {
			return false;
		}
 		
 		if (this.numero != outra.numero) {
			
		}
 		
 		return true;
 	}
 	
 	@Override
 	public int compareTo(Conta outra) { 		
 		return Double.compare(this.saldo, outra.saldo);
 	}
}

