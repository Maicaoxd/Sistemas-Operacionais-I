package controller;

import java.util.concurrent.Semaphore;

public class Exercicio02 extends Thread {

	private int idPrato;
	private Semaphore semaforo;

	public Exercicio02(int idPrato, Semaphore semaforo) {
		this.idPrato = idPrato;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		int prato = idPrato % 2;
		switch (prato) {
		case 0:
			LasanhaBolonhesa();
			break;
		case 1:
			SopaDeCebola();
		}
		try {
			System.out.println("prato#" +idPrato+" aguardando para ser entregue");
			semaforo.acquire();
			entrega();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
			System.out.println("Entrega do prato#" +idPrato+" realizada");
		}
	}

	private void LasanhaBolonhesa() {
		int tempoTotal = (int) ((Math.random() * 601) + 600);
		double tempoPercorrido = 0;
		double percentual = 0;
		System.out.println("O prato#" + idPrato + " de lasanha a bolonhesa começou a cozinhar");

		while (tempoPercorrido <= tempoTotal) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tempoPercorrido += 100;
			percentual = tempoPercorrido / tempoTotal;
			System.out
					.println("O prato#" + idPrato + " de lasanha a bolonhesa está " + (percentual * 100) + "% cozido");
		}
		System.out.println("O prato#" + idPrato + " de lasanha a bolonhesa está finalizado");

	}

	private void SopaDeCebola() {
		int tempoTotal = (int) ((Math.random() * 301) + 500);
		double tempoPercorrido = 0;
		double percentual = 0;
		System.out.println("O prato#" + idPrato + " de sopa de cebola começou a cozinhar");

		while (tempoPercorrido <= tempoTotal) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tempoPercorrido += 100;
			percentual = tempoPercorrido / tempoTotal;
			System.out.println("O prato#" + idPrato + " de sopa de cebola está " + (percentual * 100) + "% cozido");
		}
		System.out.println("O prato#" + idPrato + " de sopa de cebola está finalizado");

	}
	
	private void entrega() {
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
