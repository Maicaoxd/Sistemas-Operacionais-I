package controller;

public class ThreadCalc extends Thread {

	private int a, b, op;

	public ThreadCalc(int a, int b, int op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() {
		int tempo = 1; // tempo em mS
		
		try {
			sleep(op * tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int res = 0;
		String operacao = null;
		switch (op) {
		case 0:
			res = a + b;
			operacao = "+";
			break;
		case 1:
			res = a - b;
			operacao = "-";
			break;
		case 2:
			res = a * b;
			operacao = "*";
			break;
		case 3:
			res = a / b;
			operacao = "/";
			break;
		}
		System.out.println("TID #" + getId() + " ==> " + a + " " + operacao + " " + b + " = " + res);
	}
}
