package br.com.bytebank.banco.teste;

public class TesteArrayDefinitivos {

	public static void main(String[] args) {
		//Um Array também é um objeto
		int[] idades = new int[5];
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade = idades[40];
		
		System.out.println(idade);
		
		System.out.println(idades.length);

	}

}
