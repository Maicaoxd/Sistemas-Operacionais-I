package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		ProcessosController pc = new ProcessosController();
//		String os = pc.os();
//		System.out.println(os);
//		
//		String process = "C://windows//regedit.exe";
//		pc.callProcess(process);
//		
		String process = "TASKLIST /FO TABLE";
		pc.readProcess(process);
		
		String param = "regedit.exe";
		pc.killProcess(param);
	}

}
