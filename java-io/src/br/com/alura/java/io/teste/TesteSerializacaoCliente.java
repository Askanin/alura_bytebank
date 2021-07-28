package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Nico");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("234113131");
//		
//		String nome = "Nico Steppot";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));  //Criando um arquivo bin�rio para receber conte�do das v�riaveis;
//		oos.writeObject(nome); //Transportando o conte�do da String para um arquivo bin�rio
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin")); //Abrindo um arquivo bin�rio
		Cliente cliente = (Cliente) ois.readObject(); // lendo o conte�do do arquivo
		ois.close();
		System.out.println(cliente.getNome()); 


	}

}
