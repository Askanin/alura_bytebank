package bytebank;

public class CriarConta {

		public static void main(String[]args) {
			
			Conta primeiraConta = new Conta ();
			primeiraConta.saldo = 200;
			
			System.out.println(primeiraConta.saldo);
			primeiraConta.saldo += 100;
			
			System.out.println(primeiraConta.saldo);
			
			Conta segundaConta = new Conta ();
			segundaConta.saldo = 300;
			
			
			System.out.println("Primeira conta tem: " + primeiraConta.saldo + "\nSegunda Conta tem: " + segundaConta.saldo);
			
			primeiraConta.agencia = 146;
			segundaConta.agencia = 146;
			
			if(primeiraConta.saldo == segundaConta.saldo) {
				System.out.println("Mesmo Saldo.");
			} else {
				System.out.println("Saldos diferentes.");
			}
			
			if(primeiraConta.agencia == segundaConta.agencia) {
				System.out.println("As contas estão na mesma agência");
			} else {
				System.out.println("As contas estão em agências diferentes.");
			}
			
			if(primeiraConta == segundaConta) {
				System.out.println("Mesma Conta.");
			} else {
				System.out.println("Contas diferentes.");
			}
		}
}
