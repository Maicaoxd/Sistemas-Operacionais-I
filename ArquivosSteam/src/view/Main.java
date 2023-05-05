package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.SteamController;

public class Main {

	public static void main(String[] args) {
		SteamController steam = new SteamController();
		String dir = "C:\\Users\\FATEC ZONA LESTE\\eclipse-workspace\\ArquivosSteam";
		String name = "SteamCharts.csv";
		String ano = JOptionPane.showInputDialog("Insira ano");
		String mes = JOptionPane.showInputDialog("Insira mes");
		Double avg = Double.parseDouble(JOptionPane.showInputDialog("Insira avg"));
		try {
			steam.filtro(ano, mes, dir, name);
			steam.media(ano, mes, avg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
