
public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("Abrindo conex�o");
		throw new IllegalStateException();
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Fechando conex�o");
		
	}

}
