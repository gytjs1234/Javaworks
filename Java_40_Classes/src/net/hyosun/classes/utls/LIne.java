package net.hyosun.classes.utls;

public class LIne {
	public static String dLine(int length) {
		String dLine = "="; // 문자열 변수dLine선언하고 "="문자열저장
		return dLine.repeat(length);// length개수만큼 생성하고 반복한다

	}

	public static String sLine(int length) {
		return "-".repeat(length);
	}

}
