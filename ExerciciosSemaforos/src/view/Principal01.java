package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio01;

public class Principal01 {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idCarro = 0; idCarro < 4; idCarro++) {
			Thread tPessoa = new Exercicio01(idCarro, semaforo);
			tPessoa.start();
		}
	}

}
