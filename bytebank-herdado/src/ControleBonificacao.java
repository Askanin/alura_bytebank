
public class ControleBonificacao {
	
	private double soma;
	
	//A vantagem do Polimorfismo é poder criar um método génerico que possa atender a várias classes filhas
	public void registro(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
