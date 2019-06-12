package com;

import java.io.IOException;

public class DrillScript {

	public static void main(String[] args) throws IOException {
		String command="C:\\apache-drill-1.9.0\\bin\\sqlline.bat -u ";
				String add= "jdbc:drill:zk=local";
		//			"C:\\Users\\ekta.narender.sharma\\Desktop\\Scripts\\startDrill.bat"
		Runtime.getRuntime().load("C:\\Users\\ekta.narender.sharma\\Desktop\\Scripts\\startDrill.bat");
//			Runtime.getRuntime().exec("C:\\Users\\ekta.narender.sharma\\Desktop\\Scripts\\startDrill.bat");

	}

}
