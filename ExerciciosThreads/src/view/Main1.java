package view;

import controller.Exercicio1;

public class Main1 {

	public static void main(String[] args) {

		for (int id = 0; id < 5; id++) {
			Thread threadId = new Exercicio1(id);
			threadId.start();
		}
	}

}
