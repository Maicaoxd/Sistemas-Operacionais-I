package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public void concatenaString() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 32768; i++) {
			cadeia = cadeia + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String ==> "+tempoTotal+ "s.");
	}

	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 32768; i++) {
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer ==> "+tempoTotal+ "s.");
	}
	
	public void divideFrase(String frase) {
		String[] vetorPalavras = frase.split(" ");
		for (String palavra : vetorPalavras) {
			System.out.println(palavra);
		}
	}
}