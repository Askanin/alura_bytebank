

public class Conta {
	//Tornar uma variavel private permite que ela s� possa ser acessada por m�todos fora da classe em que ela esteja.
	private double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
		System.out.println("Estou criando a conta " + numero + " na Agencia " + agencia);
		System.out.println("Total de contas: " + total);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Valor insuficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
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
			System.out.println("Valor n�o permitido.");
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

}

