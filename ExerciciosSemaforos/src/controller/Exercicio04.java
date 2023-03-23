package controller;

import java.util.concurrent.Semaphore;

public class Exercicio04 extends Thread {

	private int idConta;
	private Semaphore semaforoSaque;
	private Semaphore semaforoDeposito;
	private int saldo;
	private int valor;

	public Exercicio04(int idConta, Semaphore semaforoSaque, Semaphore semaforoDeposito, int saldo, int valor) {
		this.idConta = idConta;
		this.semaforoSaque = semaforoSaque;
		this.semaforoDeposito = semaforoDeposito;
		this.saldo = saldo;
		this.valor = valor;
	}

	@Override
	public void run() {
		transacao();
	}

	private void transacao() {
		int tipo = (idConta % 2);
		switch (tipo) {
		case 0:
			try {
				semaforoSaque.acquire();
				saque();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoSaque.release();
			}
			break;
		case 1:
			try {
				semaforoDeposito.acquire();
				deposito();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoDeposito.release();
			}
			break;
		}
	}

	private void saque() {
		System.out.println("Conta: " + idConta + " Saldo: " + saldo + " Saque: " + valor+ " Processando...");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saldo atualizado: " + saldo);
		} else {
			System.out.println("Transação inválida, saldo insuficiente");
		}
	}

	private void deposito() {
		System.out.println("Conta: " + idConta + " Saldo: " + saldo + " Deposito: " + valor+ " Processando...");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		saldo += valor;
		System.out.println("Saldo atualizado: " + saldo);
	}

}
