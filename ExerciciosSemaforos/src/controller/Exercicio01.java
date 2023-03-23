package controller;

import java.util.concurrent.Semaphore;

public class Exercicio01 extends Thread {

	private int idCarro;
	private static int posSaida;
	private Semaphore semaforo;

	public Exercicio01(int idCarro, Semaphore semaforo) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
			semaforo.acquire();
			carroAndando();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
			carroCruzou();
		}

	}

	private void carroAndando() {
		int distanciaTotal = 100;
		int distanciaPercorrida = 0;
		int deslocamento = 50;
		int tempo = 1000;
		while (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		switch (idCarro) {
		case 0:
			System.out.println("Carro #" + idCarro + " cruzou do oeste a leste");
			break;
		case 1:
			System.out.println("Carro #" + idCarro + " cruzou do leste a oeste");
			break;
		case 2:
			System.out.println("Carro #" + idCarro + " cruzou do sul a norte");
			break;
		case 3:
			System.out.println("Carro #" + idCarro + " cruzou do norte a sul");
			break;
		}
	}

	private void carroCruzou() {
		posSaida++;
		System.out.println("#" + idCarro + " foi o " + posSaida + "º a cruzar o cruzamento");
	}

}
