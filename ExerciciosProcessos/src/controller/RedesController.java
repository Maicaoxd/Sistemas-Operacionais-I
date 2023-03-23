package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController() {
		super();
	}

	private String os() {
		String os = System.getProperty("os.name");
		return os;
	}

	public void ip() {
		String os = os();
		String process = null;
		String adaptador = null;
		if (os.contains("Windows")) {
			process = "IPCONFIG";
		} else if (os.contains("Linux")) {
			process = "IFCONFIG";
		}
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if (linha.contains("Adaptador")) {
					adaptador = linha;
				}
				if (linha.contains("IPv4")) {
					System.out.println(adaptador);
					System.out.println(linha);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ping() {
		String os = os();
		String process = null;
		if (os.contains("Windows")) {
			process = "PING -4 -n 10 www.google.com.br";
		} else if (os.contains("Linux")) {
			process = "PING -4 -c 10 www.google.com.br";
		}
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if (linha.contains("M�dia")) {
					String[] palavras = linha.split(" ");
					System.out.print("Media = " + palavras[12]);
					break;
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
