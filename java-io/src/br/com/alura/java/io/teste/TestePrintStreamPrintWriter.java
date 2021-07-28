package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TestePrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osr);
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		long ini = System.currentTimeMillis();
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		ps.println("Lorem adghajdgjad jdhjajjabdjab ujeteakdb kcjkbcjsbcj");
		ps.println();
		ps.println("totothkckscksksks");
		ps.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - ini) + " segundos.");
	}

}
