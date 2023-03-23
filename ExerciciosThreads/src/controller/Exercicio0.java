package controller;

public class Exercicio0 extends Thread {

	private int n;
	private int[] vetor;

	public Exercicio0(int n, int[] vetor) {
		this.n = n;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		ThreadVetor();
	}

	private void ThreadVetor() {
		if (n % 2 == 0) {

			double tempoInicial = System.nanoTime();

			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = vetor[i];
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal /= Math.pow(10, 9);
			System.out.println("TID #" + getId() + " ==> " + tempoTotal + " S.");

		} else {

			double tempoInicial = System.nanoTime();

			for (int v : vetor) {
				vetor[v] = vetor[v];
			}

			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal /= Math.pow(10, 9);
			System.out.println("TID #" + getId() + " ==> " + tempoTotal + " S.");

		}
	}
}
