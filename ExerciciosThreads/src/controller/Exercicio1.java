package controller;

public class Exercicio1 extends Thread {

	private int id;

	public Exercicio1(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		Print();
	}

	private void Print() {
		System.out.println(id);
	}
}
