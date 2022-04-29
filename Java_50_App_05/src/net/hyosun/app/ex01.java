package net.hyosun.app;

public class ex01 {
	public static void main(String[] args) {
		// 25~50까지 정수 생성하기
		int num = (int) (Math.random() * 25) + 5;
		int pizza=6;
		
		//피자가 한판에 6조각
		//인원수/피자수로 나누었을때
		//그 결과가0이거나 최소1이상 이어야한다.

		if(num%pizza==0) {
			System.out.printf("인원%d는%d의 피자가 필요",num,num/pizza);
		}else {
			int pan=(num/pizza)+1;
			System.out.printf("인원%d는%d의 피자가 필요",num,pan);
		}
	}

}
