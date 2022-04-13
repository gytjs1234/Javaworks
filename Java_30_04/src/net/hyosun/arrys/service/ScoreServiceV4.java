package net.hyosun.arrys.service;

import net.hyosun.arrys.utils.Line;

public class ScoreServiceV4 {
/*
 * 인스턴스 변수(클래스 영역에 선언된 변수)
 * 인스턴스변수는 선언문만 있고 초기화 코드는 없다.
 * 인스턴스 변수는 클래스의 생성자 메서드에서 변수를 초기화 한다.
 * 인스턴스변수가 배열일 경우
 * 정수형 매개변수가 있는 생성자를 선언하여
 * 생성되는 배열의 개수를 Controller 에서 임의로 설정할수 있다.
 * 
 * 이러한 패턴은 Service 클래스의 코드 변경을 최소화 하여
 * 잠재적인 문제를 방지 할수 있다.
 */
	private int[]intKor;
	public ScoreServiceV4() {
		intKor =new int[100];
		
	}
	public ScoreServiceV4(int length){
		intKor = new int[length];
	}
	public void makeScore() {
		for (int i = 0; i < intKor.length; i++){
			/*
			 * random()*50을 연산하면 0~49까지 범위의 임의 수가 생성된다 여기에 +51을 하면 0일떄는51, 49일떄는 100의 결과가
			 * 생성된다 그래서 51~100까지의 범위에서 임의 수를 생성하는 코드
			 */
			intKor[i] = (int) (Math.random() * 50) + 51;// 51~100점까지범위
		}
	}
	public void printSocre() {
		/*
		 * 
		 * ,Line line =new Line();
		 * system.out.println(line.dLine();
		 */
		/*
		 * Line 클래스에 static 으로 선언된 dLine()에게
		 * 정수 값을 전달하고,정수 개수만큼 라인 문자열을
		 * return 받는다
		 */
		System.out.println(Line.dLine(70));
		System.out.println("국어 성적 일람표");
		System.out.println(Line.sLine(70));
		
		for(int i =0;i<intKor.length;i++){
			System.out.printf("%d:%d\t\t",(i+1),intKor[i]);
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		System.out.println(Line.dLine(70));
	}
}
