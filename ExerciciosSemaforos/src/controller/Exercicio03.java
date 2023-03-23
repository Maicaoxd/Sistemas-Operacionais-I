package controller;

import java.util.concurrent.Semaphore;

import br.edu.fateczl.ordenacao.Ordenacao;

public class Exercicio03 extends Thread {

	private int idEscuderia;
	private Semaphore semaforoEscuderia;
	private Semaphore semaforoPista;
	private static int[] grid = new int[14];
	private static int carroFinalizado;

	public Exercicio03(int idEscuderia, Semaphore semaforoEscuderia, Semaphore semaforoPista) {
		this.idEscuderia = idEscuderia;
		this.semaforoEscuderia = semaforoEscuderia;
		this.semaforoPista = semaforoPista;
	}

	@Override
	public void run() {
		try {
			semaforoPista.acquire();

			for (int i = 1; i < 3; i++) {

				try {
					semaforoEscuderia.acquire();
					carroNaPista(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					semaforoEscuderia.release();
					semaforoPista.release();
					carroFinalizado++;
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (carroFinalizado == 14) {
			Ordenacao ordernar = new Ordenacao();
			grid = ordernar.quickSort(grid, 0, grid.length - 1);
			System.out.println("Grid ordenado: ");
			for (int valor : grid) {
				System.out.print(valor + " ");
			}
		}
	}

	private void carroNaPista(int carro) {
		System.out.println("O carro " + carro + " da escuderia " + idEscuderia + " entrou na pista");

		for (int volta = 1; volta < 4; volta++) {

			int tempoVolta = (int) ((Math.random() * 41) + 20);
			try {
				sleep(tempoVolta * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Carro: " + carro + " da escuderia: " + idEscuderia + " Volta: " + volta + " Tempo: "
					+ tempoVolta + " segundos");

			if (carro == 1) {
				if (tempoVolta < grid[idEscuderia * 2 - carro - 1] || grid[idEscuderia * 2 - carro - 1] == 0) {
					grid[idEscuderia * 2 - carro - 1] = tempoVolta;
				}
			}

			else if (carro == 2) {
				if (tempoVolta < grid[idEscuderia * 2 - carro + 1] || grid[idEscuderia * 2 - carro + 1] == 0) {
					grid[idEscuderia * 2 - carro + 1] = tempoVolta;
				}
			}
		}

//		for (int t : grid) {
//			System.out.print(t + " ");
//		}

	}
}