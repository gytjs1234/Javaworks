package net.hysoun.method;

public class method02A {
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

	
	public static String nation() {
		String strNation = null;

		return null;
	}


	public static boolean bYes() {
		boolean bYes = false;
		return false;
	}


	public static float floatNum() {
		float floatNum=0;
			return 0;
	}


	public static long longNum() {
		long longNum=0;
		return 0;
	}

	public static double doNum() {
		double doNum =0;
		return 0;
	}

	public static int num(){
		/**
		 * intNㅕm1 변수는 main()에서 선언하여 사용하고 있지만
		 * num()에서 intNum1 이름으로 변수를 선언하여도 된다
		 * main()에서 선언된 intNum1 과 num()에서 선언된 intNum1은 
		 * 부르는 이름만 같고 완전히 다른 변수다
		 * 
		 * main()에 선언된 intNum1 변수는 main()의 지역변수 (local var)라고 하고
		 * num()에 선언된 intNum1 변수는 num()의 지경변수 라고 한다
		 * 
		 * 지역변수는 서로다른 영역에서 접근할수 없다
		 * 
		 * 
		 */
		int intNum1=0;
		intNum1 =300 +400;
		
		//main()에서 intNum1 변수의 값을 사용할수 있도록
		//intNum1 변수의 값을  return 한다 
		return intNum1;
	}
	
	
	
	


}
