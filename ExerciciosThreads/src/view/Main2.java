package view;

import controller.Exercicio2;

public class Main2 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				matriz[linha][coluna] = (int) (Math.random() * 11);
			}
		}

		System.out.println("MATRIZ: ");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("");
		}
		System.out.println("");

		for (int id = 0; id < 3; id++) {
			Thread somaMatriz = new Exercicio2(matriz, id);
			somaMatriz.start();
		}

	}
}
