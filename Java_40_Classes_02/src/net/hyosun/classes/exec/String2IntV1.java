package net.hyosun.classes.exec;

public class String2IntV1 {
public static void main(String[] args) {
	
	/*
	 * 문자열형 숫자를 정수형 숫자로 형변환하기
	 */
	String strNum ="33";
	int intNum =Integer.valueOf(strNum);
	
	/*
	 * 문자열형 숫자를 실수형(float) 숫자로 형변환 하기
	 */
	strNum ="33.2";
	float fNum =Float.valueOf(strNum);
	
	float fSum =intNum+fNum;
	System.out.println(fSum);
}
}
