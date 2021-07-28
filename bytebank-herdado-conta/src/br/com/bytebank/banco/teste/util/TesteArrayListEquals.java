package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics é a forma de evitar casts excessivos ao fazer o casting na própria lista
		ArrayList<Conta> lista = new ArrayList<Conta>(); //A lista só pode aceitar elementos do tipo Conta
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		

	}

}
