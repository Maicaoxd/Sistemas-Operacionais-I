package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio03;

public class Principal03 {

	public static void main(String[] args) {
		Semaphore semaforoEscuderia = new Semaphore(1);
		Semaphore semaforoPista = new Semaphore(5);

		for (int idEscuderia = 1; idEscuderia < 8; idEscuderia++) {
			Thread formula1 = new Exercicio03(idEscuderia, semaforoEscuderia, semaforoPista);
			formula1.start();
		}
	}
}
