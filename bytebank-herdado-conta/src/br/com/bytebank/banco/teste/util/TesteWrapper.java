package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {
		
		/*Existem dois tipos de array: Primitivo (que guarda a informação) e de Referencia (que guarda a referencia para encontrar o objeto. Contudo, só existem Listas de referencia.*/
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); //unboxing
		String s = args[0]; //"10"
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //autoboxing
		
		

	}

}
