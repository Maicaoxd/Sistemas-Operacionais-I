package view;

import javax.swing.JOptionPane;

import controller.KillController;
import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		RedesController rc = new RedesController();
		KillController kc = new KillController();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"\n Insira 1 para IP \n Insira 2 para PING \n Insira 3 para Listar Processos \n Insira 4 para Encerrar Processo por PID \n Insira 5 para Encerrar Processor por NOME \n Insira 9 para SAIR"));
			switch (opc) {
			case 1:
				rc.ip();
				break;
			case 2:
				rc.ping();
				break;
			case 3:
				kc.listaProcessos();
				break;
			case 4:
				int pid;
				pid = Integer.parseInt(JOptionPane.showInputDialog("Insira o PID"));
				kc.mataPid(pid);
				break;
			case 5:
				String nome;
				nome = JOptionPane.showInputDialog("Insira o nome do processo");
				kc.mataNome(nome);
			default:
				break;
			}
		}
	}

}
