
public class TestaGetSet {
	
	public static void main(String[]args) {
		
		Conta conta = new Conta(1340, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
	}

}
