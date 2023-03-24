package controller;

import java.util.concurrent.Semaphore;

public class Aeroporto extends Thread {
	
	private int pista;
	private int idAviao;
	private Semaphore semaforoNorte;
	private Semaphore semaforoSul;

	public Aeroporto(int pista, int idAviao, Semaphore semaforoNorte, Semaphore semaforoSul) {
		this.pista = pista;
		this.idAviao = idAviao;
		this.semaforoNorte = semaforoNorte;
		this.semaforoSul = semaforoSul;
	}

	@Override
	public void run() {
		manobra();
		taxiar();
		semaforo();
		afastamentoDaArea();
	}

	private void semaforo() {
		int p = (pista % 2);
		switch (p) {
		case 0:
			try {
				System.out.println("Avião "+idAviao+ " Aguardando para decolagem na pista norte");
				semaforoNorte.acquire();
				decolagem();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoNorte.release();
				System.out.println("Avião "+idAviao+ " Finalizou a decolagem na pista norte");
			}
			break;
		case 1:
			try {
				System.out.println("Avião "+idAviao+ " Aguardando para decolagem na pista sul");
				semaforoSul.acquire();
				decolagem();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoSul.release();
				System.out.println("Avião "+idAviao+ " Finalizou a decolagem na pista sul");
			}
			break;
		}
	}

	private void manobra() {
		int tempo = (int) ((Math.random() * 4001) + 3000);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Avião "+idAviao+ " Finalizou a manobra");
	}

	private void taxiar() {
		int tempo = (int) ((Math.random() * 5001) + 5000);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Avião "+idAviao+ " Finalizou o taxiamento");
	}

	private void decolagem() {
		System.out.println("Avião "+idAviao+ " iniciou a decolagem");
		int tempo = (int) ((Math.random() * 3001) + 1000);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void afastamentoDaArea() {
		int tempo = (int) ((Math.random() * 5001) + 3000);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Avião "+idAviao+ " Finalizou o afastamento da área");
	}

}
