package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio01;

public class Main01 {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		
		for (int idThread = 1; idThread < 22; idThread ++) {
			Thread servidor = new Exercicio01(idThread, semaforo);
			servidor.start();
		}
	}

}
