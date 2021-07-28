package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteConta {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc  = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaCorrente cp = new ContaCorrente(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo na CC: " + cc.getSaldo());
		System.out.println("Saldo na CP: " + cp.getSaldo());
	}

}
