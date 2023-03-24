package view;

import java.util.concurrent.Semaphore;

import controller.Bilheteria;

public class MainBilheteria {

	public static void main(String[] args) {

		Semaphore semaforo = new Semaphore(1);

		for (int idUsuario = 1; idUsuario < 301; idUsuario++) {
			Thread bilheteria = new Bilheteria(semaforo);
			bilheteria.start();
		}

	}

}
