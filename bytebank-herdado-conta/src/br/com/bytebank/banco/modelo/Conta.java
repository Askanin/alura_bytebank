package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author Felipe Lima
 *
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	//Tornar uma variavel private permite que ela só possa ser acessada por métodos fora da classe em que ela esteja.
	protected double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar uma conta a partir da agencia e numero.
	 * @param agencia
	 * @param numero
	 */
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		if(agencia <=0 || numero <=0) {
			System.out.println();
		}
		//System.out.println("Estou criando a conta " + numero + " na Agencia " + agencia);
		//System.out.println("Total de contas: " + total);
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if(this.saldo < valor ) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
			
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valor invalido");
			return;
		}
		this.numero=numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("Valor não permitido.");
			return;
		}
		this.agencia=agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Número: " + this.numero + ", Agencia: " + this.agencia + " , Saldo: " + this.saldo;
	}

}

