package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SteamController {

	public void media(String ano, String mes, Double avgEsperada) throws IOException {
		File arq = new File("C:\\Users\\FATEC ZONA LESTE\\eclipse-workspace\\ArquivosSteam", "SteamCharts.csv");

		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			linha = buffer.readLine();

			while (linha != null) {
				String[] separa = linha.split(",");
				String nome = separa[0];
				String anoLinha = separa[1];
				String mesLinha = separa[2];
				Double avgLinha = Double.parseDouble(separa[3]);

				if (anoLinha.equals(ano) && mesLinha.equals(mes) && avgLinha >= avgEsperada) {
					System.out.println(nome + " | " + avgLinha);
				}

				linha = buffer.readLine();
			}

			buffer.close();
			leitor.close();
			fluxo.close();

		} else {
			throw new IOException("Arquivo inválido");
		}

	}

	public void filtro(String ano, String mes, String path, String name) throws IOException {
		File arq = new File(path, name);

		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();

			while (linha != null) {
				String[] separa = linha.split(",");
				String nome = separa[0];
				String anoLinha = separa[1];
				String mesLinha = separa[2];
				String avg = separa[3];

				if (anoLinha.equals(ano) && mesLinha.equals(mes)) {
					System.out.println(nome + " ; " + avg);
				}

				linha = buffer.readLine();
			}

			buffer.close();
			leitor.close();
			fluxo.close();

		} else {
			throw new IOException("Arquivo inválido");
		}

	}
}
