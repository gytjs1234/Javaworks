package net.hyosun.classes.exec;

import net.hyosun.classes.utls.LIne;

public class String2IntV1 {
	public static void main(String[] args) {

		String strAge = "";

		strAge = "33";
		int intAge = 33;

		// 숫자를 문자열로 형변환시키는법
		// 숫자형 변수에 +""; 위치는 상관없음.
		strAge = intAge + "";

		// Integer.toString();
		// Integer클래스에 선언된 toString static method 에게 정수값을
		// arg로 전달하여 문자열로 return 받는다

		// Integer.toString()메서드를 사용하여
		// 정수형 숫자를 문자열형 숫자로 바꾼다
		strAge = Integer.toString(intAge);

		strAge = "55";
		// Integer.valueof()메서드를 사용하여
		// 문자열형 숫자를 정수형 숫자로 바꾼다.
		intAge = Integer.valueOf(strAge);
		// 이거두개가 많이쓰임

		System.out.println(Integer.toBinaryString(33));

		int num1 = 33;
		int num2 = 55;

		String strbinNum1 = Integer.toBinaryString(num1);
		String strbinNum2 = Integer.toBinaryString(num2);

		int intSum = num1 + num2;
		String strSum = Integer.toBinaryString(intSum);

		System.out.println(LIne.dLine(20));
		System.out.printf(" %s\n", strbinNum1);
		System.out.printf("+ %s\n", strbinNum2);
		System.out.println(LIne.dLine(20));
		System.out.println("-".repeat(20));
		System.out.printf(" %s\n", strSum);

	}
}
