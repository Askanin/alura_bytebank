
public class TesteReferencias {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Caio");
		g1.setSalario(5000.0);
		
		Funcionario f = new Designer();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(f);
		controle.registro(ev);
		controle.registro(d);
		System.out.println(controle.getSoma());
		
	}

}
