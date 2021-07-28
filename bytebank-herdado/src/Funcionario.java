/*Quando se usa classe abstrata, estas n�o podem mais instanciar objetos*/

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario; // vari�veis protected est�o visiveis somente para a propria classe e seus filhos
	
	/*M�todos abstratos -> sem corpo, sendo a implementa��o necess�ria nos filhos*/
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
