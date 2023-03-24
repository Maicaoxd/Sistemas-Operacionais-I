package view;

import java.util.concurrent.Semaphore;

import controller.Aeroporto;

public class MainAeroporto {

	public static void main(String[] args) {

		Semaphore semaforoNorte = new Semaphore(1);
		Semaphore semaforoSul = new Semaphore(1);

		for (int idAviao = 1; idAviao < 13; idAviao++) {
			int pista = (int) ((Math.random()*100)+1);
			Thread aeroporto = new Aeroporto(pista, idAviao, semaforoNorte, semaforoSul);
			aeroporto.start();
		}
	}

}
