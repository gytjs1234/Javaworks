package net.hysoun.method;

public class method_02 {
	public static void main(String[] args) {

		/*
		 * 다음코드가 오류 없이 완성하시오
		 */

		
		/**
		 * 명령문 해석
		 * 1.num()를 실행하여 =>num() 를 호출하여 실행하고
		 * 2.num()가 return 하는 데이터를 intNum 변수에 저장하라.
		 */
		int intNum1 = num();
		double douNum1 = doNum();
		long longNum1 = longNum();
		float fNum1 = floatNum();
		boolean bYes = bYes();

		String str = nation();

		System.out.println(num());
		System.out.println(doNum());
		System.out.println(longNum());
		System.out.println(floatNum());
		System.out.println(bYes());

	}// main

	public static int num() {
		return 100;

	}

	public static double doNum() {
		return 100.0;
	}

	public static long longNum() {
		return 100_100_100_100L;
	}

	public static float floatNum() {
		return 100.0f;
	}

	public static boolean bYes() {
		return true;
	}

	public static String nation() {
		return "안녕";
	}

}
