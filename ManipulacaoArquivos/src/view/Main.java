package view;

import java.io.IOException;

import controller.Exercicio01;

public class Main {

	public static void main(String[] args) {
		Exercicio01 food = new Exercicio01();
		String dir = "C:\\TEMP";
		String name = "generic_food";
		String extensao = ".csv";
		try {
			food.readFile(dir, name, extensao);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
