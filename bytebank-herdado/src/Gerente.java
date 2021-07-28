
public class Gerente extends Funcionario implements Autenticavel{
	
private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	
	//Reescrita � quando um classe filha reutiliza uma assinatura da classe m�e
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de Bonifica��o do Gerente:");
		return getBonificacao() + super.salario ;
		//SUPER significa que esse atributo foi definido na classe m�e.
	}

	
	
	
}
