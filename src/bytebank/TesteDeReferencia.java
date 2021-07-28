package bytebank;

public class TesteDeReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println(segundaConta.saldo);
		
		if(primeiraConta.saldo == segundaConta.saldo) {
			System.out.println("Mesmo Saldo.");
		} else {
			System.out.println("Saldos diferentes.");
		}
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma Conta.");
		} else {
			System.out.println("Contas diferentes.");
		}
	}

}
