package net.hyosun.arrays.service;

public class ServiceV2 {
	public ServiceV2() {
		
	}
	
	public int scoreKorSum(){
		
		//int[] intKor이름으로 정수형 배열 선언
		//new int[100]개의 요소()저장공간을 생성하라
		//정수형 이기 때문에 모두 0으로 clear된다
		int[] intKor = new int[100] ;
		
		//정수형 배열 intKor 의 3번 요소의 값을 console 에 출력
		//이때 3의 숫자를 "첨자"라고 부른다
		//정수형 intKor의 첨자 3의 값을 console 에 출력
		System.out.println(intKor[3]);
		
		//정수형 intㅏKor의 3번 요소에 100을 대입(저장 할당)
		intKor[3]= 100;
		
		//정수형 intKor 3번 요소의 값을 console 에 출력
		System.out.println(intKor[3]);
		
		return 0;
		
	}
	
	
}
