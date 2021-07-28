package br.com.alura.teste;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {

		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo");

		/*Obtemos erro aqui, pois um conjunto destinado a ser
		 * vazio, não pode receber elementos*/
	}

}
