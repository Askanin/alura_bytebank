package br.com.java8.exercicio;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroExercicio {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		for (String s1 : palavras) {
			System.out.println(s1);
		}

	}

}
