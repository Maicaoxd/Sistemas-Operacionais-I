package controller;

import java.util.concurrent.Semaphore;

public class Bilheteria extends Thread {

	private Semaphore semaforoValidacao;
	private static int capacidade = 100;
	private static int ingressosVendidos;

	public Bilheteria(Semaphore semaforoValidacao) {
		this.semaforoValidacao = semaforoValidacao;
	}

	@Override
	public void run() {
		login();
	}

	private void login() {
		int tempo = (int) ((Math.random() * 1951) + 50);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (tempo > 1000) {
			System.out.println("timeout! não poderá fazer a compra");
		} else {
			processoCompra();
		}

	}

	private void processoCompra() {
		int tempo = (int) ((Math.random() * 2001) + 1000);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (tempo > 2500) {
			System.out.println("estouro de tempo de sessão, não poderá fazer a compra");
		} else {
			try {
				semaforoValidacao.acquire();
				validacaoCompra();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoValidacao.release();
			}
		}
	}

	private void validacaoCompra() {
		int ingressosSolicitados = (int) ((Math.random() * 4) + 1);
		if ((ingressosVendidos + ingressosSolicitados) <= capacidade) {
			ingressosVendidos += ingressosSolicitados;
			System.out.println("Compra de: " + ingressosSolicitados + " ingressos realizada");
		} else {
			System.out.println("indisponibilidade de ingressos, não poderá fazer a compra");
		}
		System.out.println("Ingressos disponíveis: " + (capacidade - ingressosVendidos));
	}

}
