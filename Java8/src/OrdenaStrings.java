import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		
		//Collections.sort(palavras);
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);
		System.out.println("-------------------");
		palavras.sort(Comparator.comparing(String::length));
		
		
		System.out.println(palavras);
		
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);
		
		
		
		/*O lambda reduz varias linhas de código em uma só.
		 * Por exemplo na linha abaixo, como o forEach implementa o
		 * método accept da classe Consumer (que é o único método 
		 * existente lá, ele consegue elimin*/
		palavras.forEach(s -> System.out.println(s));

	}

}



