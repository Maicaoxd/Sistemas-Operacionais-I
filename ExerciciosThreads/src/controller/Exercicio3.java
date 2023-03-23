package controller;

public class Exercicio3 extends Thread {

	private int percurso;
	private int sapo;
	private int[][] saltoMax;
	private static int pos = 1;

	public Exercicio3(int percurso, int sapo, int[][] saltoMax) {
		this.percurso = percurso;
		this.sapo = sapo;
		this.saltoMax = saltoMax;
	}

	@Override
	public void run() {
		Corrida();
	}

	private void Corrida() {
		int distanciaPercorrida = 0;
		int salto = 0;
		while (distanciaPercorrida < percurso) {
			salto = (int) (Math.random() * (saltoMax[sapo][0] + 1));
			distanciaPercorrida += salto;
			System.out.println("Sapo " + (sapo + 1) + " ==> saltou " + salto + "m Distancia percorrida total: "
					+ distanciaPercorrida + "m de " + percurso + "m");
		}
		System.out.println("Sapo " + (sapo + 1) + " ***Chegou em " + pos + "° ***");
		pos++;
	}
}
