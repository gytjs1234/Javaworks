/*
 * var_o1.java 파일이 src/com/callor/var 폴더에 저장되어 있다 라는표식
 */

package com.callor.var;

//class 선언문, class prototype
public class Var_01 {
	// 여기서부터 실제 명령문 코드가 작성되는 곳
	public static void main(String[] args) {

		// 코드에서 사용되는 수의 체계
		// 정수, 실수(소수점)
		// 정수형(int type), 실수형(float type)
		/*
		 * int:정수형 데이터를 저장할 기억장소를 예약해달라 num1:예약한 기억장소에 쉬운 num1이라는 이름을붙여라 =30:예약된
		 * num1기억장소에 30을 저장(할당)
		 * 
		 * 정수형 변수 num1을 선언하고 정수 255 값으로 초기화하라 
		 * 정수형 변수 num2를 선언하고 정수 88 값으로 초기화하라
		 * 
		 */
		int num1 = 255;
		int num2 = 88;

		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		System.out.println(40.0 / 30.0);
		// 연산된결과를 데이터
		//정수형 변수 num3를 선언"만"하기
		int num3;
		//정수형 변수 num4를 선언"만"하기
		int num4;
		
		//선언된 정수형변수 num3 에 정수 40을 대입하기
		//대입,할당,저장
		num3=40;
		//선언된 정수형변수 num4에 정수 100을 대입하기
		num4=100;
		/*
		 * 선언 만 된 변수에서는 값을 읽을수 없다
		 * 반듯이 앞에서 어떤값이라도 저장, 할당을해야만
		 * 이후에 읽을 수 있다 
		 */
		
		
		System.out.println(num3+num4);
	
		//변수에 어떤 값을 저장해야할지 아직 정해지지 않았을떄는 
		//숫자일 경우는 0으로 초기화를 해 둔다
		int num5=0; 
		System.out.println(num5);
		
		int num11=0;
		
		/*
		 * 변수 명명규칙과 패턴
		 * 1.첫글자 무조건 소문자
		 * 2.이후에는 대소문,숫자,_를 조합할수 있다
		 * 3.두개 이상의 단어를 조합하여 만드는것이 좋다
		 * 4.두개 이상의 단어를 조합할떄 두번째 단어부터 대문자
		 * =>camel case
		 * 5.두개 이상의 단어를 조합할때 첫번쨰 단어는
		 *  변수의 type으로 만드는 것이 좋다
		 *  =>헝가리언 표기법
		 */
		int intNum1=0;
		
		/*
		 *좋은 변수 이름짓기 
		 *변수명이 길어지더라도 2개 이상의 단어를 조합하자 
		 *변수명만 보고 어떤 데이터가 담겨있는지 유추하자
		 *
		 */
		
		int intStnum=20150436;
		int intTelNum=333333;
		int intStAge=33;
		
		
		
		System.out.println(intTelNum + intStnum);
		

		
		
		
		

	}

}
