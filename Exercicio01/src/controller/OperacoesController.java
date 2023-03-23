package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	
	public void Vetor1000() {
		int vetor[] = new int[1000];
		double tempoInicial = System.nanoTime();
		for (int i=0;i<1000;i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor com 1000 ==> "+tempoTotal+ " nS. ou " +tempoTotalEmS+ " S.");
	}
	
	public void Vetor10000() {
		int vetor[] = new int[10000];
		double tempoInicial = System.nanoTime();
		for (int i=0;i<10000;i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor com 10000 ==> "+tempoTotal+ " nS. ou " +tempoTotalEmS+ " S.");
	}
	
	public void Vetor100000() {
		int vetor[] = new int[100000];
		double tempoInicial = System.nanoTime();
		for (int i=0;i<100000;i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor com 100000 ==> "+tempoTotal+ " nS. ou " +tempoTotalEmS+ " S.");
	}
}
	