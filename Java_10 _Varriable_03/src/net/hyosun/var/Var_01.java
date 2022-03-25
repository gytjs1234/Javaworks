package net.hyosun.var;
//호명:Var_01 클래스
public class Var_01 {
	
	/*
	 *호명: main()  main method(메소드)
	 *표기: main()
	 *main() 는 static void main  키워드와 한 그룹으로 사용되면 마피 키워드 처럼 작동된다
	 *pulic static void main(){} :Java 시작점 ,진입점 method 명령 그룹이라고 한다. 
	 *   
	 *   초기에 Java project 를 시작할때는 
	 *   반듯이 main(){}블럭에서 부터 코드가 시작되어야 한다.
	 */

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//숫자형 변수는 선언할때 최소한 0 으로 값을 할당하자
		// '변수의 선언과 초기화를 한다'  라고한다
		int intNum1= 0;
		int intNum2 = 0;
		
		
		
		//변수를 선언만 한다 라고한다
		//선언만 된 변수는 어떤 값이든 먼저 할당(저장,대입)해야만
		//이후에 문제를 일으키지 않는다.
		int intSum;
		intSum = 0;

		
		//변수가 초기화(대입,할당) 되어야만 변수를 읽을수 있다.
		System.out.println(intSum); //intSum 변수의 값을 읽어서 Console 에 출력
		
		
		
		
	}

}
