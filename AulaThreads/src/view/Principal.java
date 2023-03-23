package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {

		for (int idThread = 0; idThread <= 20; idThread++) {
			Thread threadId = new ThreadId(idThread);
			threadId.start();
		}

	}

}
