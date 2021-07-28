package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; //objeto literal
		
		String vazio = "   Alura    ";
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		System.out.println(outroVazio.contains("Alu"));
		
		//String outro = nome.toUpperCase();
		String outro = nome.replace("Al", "aL");
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		nome.toUpperCase();
		System.out.println(nome);
		System.out.println(outro);
	}

}
