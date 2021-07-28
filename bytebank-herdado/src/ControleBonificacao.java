
public class ControleBonificacao {
	
	private double soma;
	
	//A vantagem do Polimorfismo � poder criar um m�todo g�nerico que possa atender a v�rias classes filhas
	public void registro(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
