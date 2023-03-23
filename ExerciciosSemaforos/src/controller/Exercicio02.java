package controller;

import java.util.concurrent.Semaphore;

public class Exercicio02 extends Thread {

	private int idPessoa;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;

	public Exercicio02(int idPessoa, Semaphore semaforo) {
		this.idPessoa = idPessoa;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		pessoaCaminhando();
		try {
			semaforo.acquire();
			cruzarPorta();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
			pessoaCruzou();
		}
	}

	private void pessoaCaminhando() {
		int corredor = 200;
		int distanciaPercorrida = 0;
		int deslocamento = (int) ((Math.random() * 3) + 4);
		int tempo = 1000;
		while (distanciaPercorrida < corredor) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Pessoa #" + idPessoa + " já andou " + distanciaPercorrida + "m.");
		}
		posChegada++;
		System.out.println("Pessoa #" + idPessoa + " foi o  " + posChegada + "º a chegar na porta");
	}

	private void cruzarPorta() {
		int tempo = (int) ((Math.random() * 1001) + 1000);
		System.out.println("Pessoa #" + idPessoa + " está abrindo a porta");
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void pessoaCruzou() {
		posSaida++;
		System.out.println("Pessoa #" + idPessoa + " foi o " + posSaida + "º a cruzar a porta");
	}
}
