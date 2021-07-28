
public class TesteConexao {
	
	public static void main(String[] args) throws Exception {
		
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		
		//-----------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		} finally { //Com ou sem erro o finally é sempre executado
//			con.close();
//		}
	}
}
