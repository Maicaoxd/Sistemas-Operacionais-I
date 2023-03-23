package view;

import controller.OperacoesController;

public class Principal {
	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		op.Vetor1000();
		op.Vetor10000();
		op.Vetor100000();	
	}
}
