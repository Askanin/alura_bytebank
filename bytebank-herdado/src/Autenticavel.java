/*Uma Interface é uma classe abstrata com métodos abstratos.
 * A interface é um contrato que quem assina precisa implementar os métodos que nela estão*/
public abstract interface Autenticavel{
	
	public abstract void setSenha(int senha);
		
	public abstract boolean autentica(int senha);
	
}
