package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio04;

public class Principal04 {

	public static void main(String[] args) {

		Semaphore semaforoSaque = new Semaphore(1);
		Semaphore semaforoDeposito = new Semaphore(1);

		for (int i = 1; i < 21; i++) {
			int idConta = (int) ((Math.random() * 101) + 1);
			int saldo = (int) ((Math.random() * 9001) + 1000);
			int valor = (int) ((Math.random() * 9001) + 500);
			Thread transacao = new Exercicio04(idConta, semaforoSaque, semaforoDeposito, saldo, valor);
			transacao.start();
		}
	}

}
