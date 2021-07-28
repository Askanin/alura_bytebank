
public class TestaContaComExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();
		try {
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento ....");
		}
	}

}
