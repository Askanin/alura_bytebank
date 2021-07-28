
public class Teste {

	public static void main(String[] args) {
		
		Prioridade pMim = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMim.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMim.getValor());
		System.out.println(pMax.getValor());
		
		/*System.out.println(Thread.MAX_PRIORITY);
		//Thread é uma linha de execução
		Thread t = new Thread(() -> System.out.println("Rodando"));
		
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();*/

	}

}
