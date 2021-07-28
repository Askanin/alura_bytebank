package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.saldo = 100;
		
		contaDoFelipe.deposita(50);
		
		System.out.println(contaDoFelipe.saldo);
		
		boolean conseguiuRetirar = contaDoFelipe.saca(20);
		System.out.println(contaDoFelipe.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.saldo);
		if(contaDaMarcela.transfere(3000, contaDoFelipe)) {
			System.out.println("Transferencia feita com sucesso.");
		} else {
			System.out.println("Operação não realizada.");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoFelipe.saldo);
		
	}

}
