package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio02;

public class Principal02 {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idPessoa = 0; idPessoa < 4; idPessoa++) {
			Thread tPessoa = new Exercicio02(idPessoa, semaforo);
			tPessoa.start();
		}
	}

}
