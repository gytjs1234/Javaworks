package com.callor.app.exec;

import java.io.InputStream;
import java.util.Scanner;

public class Exec7 {
	public static void main(String[] args) {
		String fileName = "data.txt";
		InputStream is = Exec7.class.getResourceAsStream(fileName);

		Scanner scan = new Scanner(is);
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
	}
}
