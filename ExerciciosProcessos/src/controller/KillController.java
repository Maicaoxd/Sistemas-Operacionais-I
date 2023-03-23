package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {
	public KillController() {
		super();
	}

	private String os() {
		String os = System.getProperty("os.name");
		return os;
	}

	public void listaProcessos() {
		String os = os();
		String process = null;
		if (os.contains("Windows")) {
			process = "TASKLIST /FO TABLE";
		} else if (os.contains("Linux")) {
			process = "ps -ef";
		}
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void mataPid(int pid) {
		String os = os();
		String process = null;
		StringBuffer buffer = new StringBuffer();
		if (os.contains("Windows")) {
			process = "TASKKILL /PID ";
			buffer.append(process);
			buffer.append(pid);
		} else if (os.contains("Linux")) {
			process = "kill -9 ";
			buffer.append(process);
			buffer.append(pid);
		}
		try {
			Runtime.getRuntime().exec(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void mataNome(String nome) {
		String os = os();
		String process = null;
		StringBuffer buffer = new StringBuffer();
		if (os.contains("Windows")) {
			process = "TASKKILL /IM ";
			buffer.append(process);
			buffer.append(nome);
		} else if (os.contains("Linux")) {
			process = "pkill -f ";
			buffer.append(process);
			buffer.append(nome);
		}
		try {
			Runtime.getRuntime().exec(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
