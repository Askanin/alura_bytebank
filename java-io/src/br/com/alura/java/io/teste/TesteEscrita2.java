package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osr);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter (fw);
		bw.write("Lorem adghajdgjad jdhjajjabdjab ujeteakdb kcjkbcjsbcj");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("Opa, tudo bem? Vamos começar a festa");
		bw.write(System.lineSeparator()); // O métod newLine(); não existe em FileWriter
		bw.write("totothkckscksksks");
		bw.close();
	}

}
