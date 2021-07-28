/*Quando se usa classe abstrata, estas não podem mais instanciar objetos*/

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario; // variáveis protected estão visiveis somente para a propria classe e seus filhos
	
	/*Métodos abstratos -> sem corpo, sendo a implementação necessária nos filhos*/
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
