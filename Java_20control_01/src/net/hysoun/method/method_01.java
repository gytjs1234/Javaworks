package net.hysoun.method;

public class method_01 {

	public static void main(String[] args){
	
		/**
		 * num()메소드 를 실행하고 그결과를 console 에 출력
		 * num()는 main()과 같은 class 내에 선언되어 있어야 한다.
		 * 
		 * int num() {} :num method 의   return type을 int로 정하겠다
		 * return 정수;명령이 나타난다.
		 * int add(){}:return type int
		 * return 정수;명령이 온다라고 표현
		 * 
		 * 이명령을 실행한 결과를 변수에 저장ㅇ하려면
		 * 변수의 type 도 반듯이 int 형 이어야 한다
.		 */
		System.out.println(num());
		/**
		 * add()를 실행하고 그 결과를 console 에 출력
		 */
		System.out.println(add());
	
		System.out.println(Math.random());
		
	double doNum1 =doNum();
		
		
	}//end main()
	/**
	 * num method 선언
	 * num():num method 라고 읽는다
	 * num()를 선언할때는 public static int 키워드가 선행된다
	 * num()의 이름은 변소 이름짓기 규칙과 동일하다
	 * 
	 */
	public static int num(){

		
		return 100;
}
	public static int add( ){
		int num1 =200;
		int num2 =300;
		return num1 +num2;
	}
	public static double doNum() {
		return 100.0;
	}
	
}