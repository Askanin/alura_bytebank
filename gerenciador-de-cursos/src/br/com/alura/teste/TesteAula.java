package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.Aula;

public class TesteAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas); //Ordenar minha lista, por�m preciso implementar a classe Comparable na classe do objeto que ser� organizado, para poder tamb�m add os m�todos da classe Comparable
		
		System.out.println(aulas);
		
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); abaixo o mesmo c�digo de uma forma mais compacta.
		aulas.sort((Comparator.comparing(Aula::getTempo)));
		System.out.println(aulas);

	}

}
