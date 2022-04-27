package net.hyosun.score.exec;

public class VarEx2 {
	public static void main(String[] args) {
		//형변화 캐스팅이라고도 부른다.
		int num1 = 100;
		/*
		 * int형 변수에 담긴 데이터를 Integer형 변수에 복사
		 * 
		 * int형 데이터에 box를 씌워서 Integer 형으로 변환한 후 저장한다
		 * boxing
		 * 
		 * 
		 */
		//int보다 기능이많음 
		Integer intNum1 = num1; //박싱
		
		/*
		 * Integer 형 변수에 담긴 데이터를 int 형 변수에 복사하기
		 * 
		 * Integer box에 담긴 데이터를 box를 풀어해쳐 내용물만 int 형 변수에 저장
		 * 
		 * unboxing
		 */
		num1 = intNum1;  //언박싱
	}

}
