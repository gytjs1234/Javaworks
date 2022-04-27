package net.hyosun.app.exec;

public class Exec2 {
	public static void main(String[] args) {
		/*
		 * 정수형 배열 10개를 생성하고 각 요소에1~100까지 임의정수를 생성하여 저장하고 배열에 저장된 용소의 값을 모드 합산하여 출력
		 */

		int intNums[] = new int[10];

		int intSum = 0;

		for (int i = 0; i < intNums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intNums[i] = num;

		}

		for (int i = 0; i < intNums.length; i++) {
			intSum += intNums[i];
		}
		System.out.println("총합계:" + intSum);

	}

}
