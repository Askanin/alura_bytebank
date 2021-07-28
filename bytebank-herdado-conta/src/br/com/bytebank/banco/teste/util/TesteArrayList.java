package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics é a forma de evitar casts excessivos ao fazer o casting na própria lista
		LinkedList<Conta> lista = new LinkedList<Conta>(); //A lista só pode aceitar elementos do tipo Conta
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println(lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		for(int i=0; i< lista.size();i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef); 
			
		}
		
		System.out.println("---------------- *** ----------------");
		/*Outra forma de fazer um for de forma mais pratica:
		 * Coloca a variavel : o ArrayList*/
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		

	}

}
