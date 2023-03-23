package controller;

public class Exercicio2 extends Thread {

	private int[][] matriz;
	private int id;

	public Exercicio2(int[][] matriz, int id) {
		this.matriz = matriz;
		this.id = id;
	}

	@Override
	public void run() {
		Soma();
	}

	private void Soma() {
		int soma = 0;
		for (int coluna = 0; coluna < 5; coluna++) {
			soma += matriz[id][coluna];
		}
		System.out.println("TID #" + id + " ==> soma = " + soma);
	}
}
