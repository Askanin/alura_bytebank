/*Uma Interface � uma classe abstrata com m�todos abstratos.
 * A interface � um contrato que quem assina precisa implementar os m�todos que nela est�o*/
public abstract interface Autenticavel{
	
	public abstract void setSenha(int senha);
		
	public abstract boolean autentica(int senha);
	
}
