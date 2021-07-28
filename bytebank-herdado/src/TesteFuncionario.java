public class TesteFuncionario {
	
	public static void main(String[]args) {
		
		Cliente cliente = new Cliente();
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppot");
		nico.setCpf("2223654-58");
		nico.setSalario(2500.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
	
	
}


