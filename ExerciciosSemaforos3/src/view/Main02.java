package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio02;

public class Main02 {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);

		for (int idPrato = 1; idPrato < 6; idPrato++) {
			Thread restaurante = new Exercicio02(idPrato, semaforo);
			restaurante.start();
		}
	}
}
