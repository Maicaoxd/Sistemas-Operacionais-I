package view;

import controller.Exercicio3;

public class Main3 {

	public static void main(String[] args) {
		int percurso = 100;
		int sapo;
		int[][] saltoMax = new int[5][1];

		for (sapo = 0; sapo < 5; sapo++) {
			saltoMax[sapo][0] = (int) ((Math.random() * 10) + 1);
			System.out.println("Sapo " + sapo + " ==> SaltoMax: " + saltoMax[sapo][0]);
		}

		for (sapo = 0; sapo < 5; sapo++) {
			Thread corrida = new Exercicio3(percurso, sapo, saltoMax);
			corrida.start();
		}
	}

}
