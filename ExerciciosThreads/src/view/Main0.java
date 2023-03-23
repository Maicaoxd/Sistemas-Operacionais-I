package view;

import controller.Exercicio0;

public class Main0 {

	public static void main(String[] args) {

		int[] vetor = new int[1000];
		int n;

		for (int i = 0; i < 1000; i++) {
			vetor[i] = (int) (Math.random() * 101);
		}

		for (n = 1; n < 3; n++) {
			Thread ThreadVet = new Exercicio0(n, vetor);
			ThreadVet.start();
		}

	}
}
