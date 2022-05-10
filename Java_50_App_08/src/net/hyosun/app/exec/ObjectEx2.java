package net.hyosun.app.exec;

import net.hyosun.app.model.ScoreVO;

public class ObjectEx2 {
	public static void main(String[] args) {
		// ScoreVO를 5개의 배열 객체로 선언
		ScoreVO[] scVos = new ScoreVO[5];

		// 배열객체를 makeScore()메서드에 매개변수로 전달
		// 매개변수로 scVOs를 makeScore()메서드에 전달하고
		// makeScore메서드에서 배열의 요소를 각각 변경(setting)하면 main()메서드에서
		// 선언된 scVOs배열의 값들이 변경된다
		// 이런한 성질을 갖는 변수를 "참조형변수"라고한다.
		// 참조형 변수의 성질을 잘 이용하면 method가 실행된 후 결과를 return하지않아도 된다.

		makeScore(scVos);
		printScore(scVos);
	}// end main

	private static void makeScore(ScoreVO[] scVos1) {
		// 배열의 갯수만큼 반복
		for (int i = 0; i < scVos1.length; i++) {
			scVos1[i] = new ScoreVO();
			scVos1[i].setStNum(i + 1);
			scVos1[i].setIntKor(getScore(50, 51));
			scVos1[i].setIntEng(getScore(50, 51));
			scVos1[i].setIntMath(getScore(50, 51));

		}

	}

	private static int getScore(int start, int end) {
		int num = (int) (Math.random() * start) + end;
		return num;
	}

	private static void printScore(ScoreVO[] scVos) {
		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("-".repeat(50));
		for (ScoreVO scVO : scVos) {
			System.out.print(scVO.getStNum() + "\t");
			System.out.print(scVO.getIntKor() + "\t");
			System.out.print(scVO.getIntEng() + "\t");
			System.out.println(scVO.getIntMath() + "\t");

		}
		System.out.print("=".repeat(50));
	}

}
