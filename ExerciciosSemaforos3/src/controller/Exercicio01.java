package controller;

import java.util.concurrent.Semaphore;

public class Exercicio01 extends Thread {

	private int idThread;
	private Semaphore semaforo;
	
	public Exercicio01(int idThread, Semaphore semaforo) {
		this.idThread = idThread;
		this.semaforo = semaforo;
	}
	
	
	@Override
	public void run() {
		if (idThread % 3 == 1) {
			for (int i =1;i<3;i++) {
			operacoes();
			System.out.println("idThread#" +idThread+" finalizou a transação# "+i);
			}
		}
		
		if (idThread % 3 == 2 || idThread % 3 == 0) {
			for (int i =1;i<4;i++) {
				operacoes();
				System.out.println("idThread#" +idThread+" finalizou a transação# "+i);}
		}
		
		System.out.println("*** idThread#" +idThread+" finalizou todas as transações ***");
	}

	private void operacoes() {
		System.out.println("idThread#" +idThread+" iniciou os cálculos");
		calculo();
		System.out.println("idThread#" +idThread+" finalizou os cálculos");
		try {
			System.out.println("idThread#" +idThread+" está aguardando na fila de transação");
			semaforo.acquire();
			System.out.println("idThread#" +idThread+" iniciou a transação");
			transacao();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}


	private void calculo() {
		
		if (idThread % 3 == 1) {
			int tempo = (int) ((Math.random()*801)+ 200);
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (idThread % 3 == 2) {
			int tempo = (int) ((Math.random()*1001)+ 500);
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (idThread % 3 == 0) {
			int tempo = (int) ((Math.random()*1001)+ 1000);
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}


	private void transacao() {
		
		if (idThread % 3 == 1) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (idThread % 3 == 2 || idThread % 3 == 0) {
			try {
				sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
