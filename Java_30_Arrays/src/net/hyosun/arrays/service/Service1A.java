package net.hyosun.arrays.service;

public class Service1A {
	
	private int makeScore() {
		/*
		 * private 으로 선언된 makeScore()는 
		 * ServiceV1A 클래스 블럭({})에서만 접근 호출 할수있다
		 * local method(지역 메소드)라고 한다
		 */
		return (int)(Math.random()*100)+1;
	}
	
	/*
	 * public 으로 선언된 scoreKoreSum()은 이 프로젝트의 어디에서나
	 * 클래스의 인스턴스를 생성하고 인스턴스를 통하여 접근(호출)할수 있다
	 */
	/*V1에서 Math.random() 를 사용하여 점수를 생성하는 코드를 
	 * makeScore()로 이전하고, 점수 생성이 필요한 경우
	 * makeScore()를 호출하여 결과를 사용한다
	 * 
	 */
	public int scoreKoreSum(){
	
		int intNum1=makeScore();
		int intNum2=makeScore();
		int intNum3=makeScore();
		int intNum4=makeScore();
		int intNum5=makeScore();
		
		int intSum= intNum1;
			intSum=+intNum2;
			intSum=+intNum3;
			intSum=+intNum4;
			intSum=+intNum5;
		
			return intSum;
			
	}
}
