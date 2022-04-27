package net.hyosun.score.exec;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] intNums = new int[10];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			System.out.printf("%d\t", intNums[i]);
		}
		System.out.println();

		// 자바에서만 있는코드
		// forEach:확장된 for() 명령,새로운 for()명령
		// 배열의 0부터 끝까지(전체 요소)에 대하여 연속적으로 연산을 수행하기
		// 위한 simple한 for()명령어

		// int num 배열을 펼친다음 0번부터 배열의 개수만큼
		// int num =intNums[0]~[9]열번 실행하라.

		// 이코드는 전페 배열에 연산을 하고자 할때 배열요소에 값을 저장할떄는 사용할 수 없다.
		// 배열 요소 전체를 개별적으로 읽어서 연산을 수행하고자 할때만 쓸수있다.
		for (int num : intNums) {
			System.out.printf("%d\t", num);
		}
	}

}
