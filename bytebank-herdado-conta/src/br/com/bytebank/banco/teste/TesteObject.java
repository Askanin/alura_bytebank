package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
public class TesteObject {

	public static void main(String[] args) {

		//System.out.println("x");
		//System.out.println(3);
		//System.out.println(false);
		
		
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cliente);

	}
	
	static void println() {
		
	}
	
	static void pintln(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	static void println(Object conta) {
		
	}

}
