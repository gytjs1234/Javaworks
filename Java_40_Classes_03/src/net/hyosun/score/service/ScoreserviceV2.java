package net.hyosun.score.service;

import net.hyosun.score.domain.ScoreV2VO;
import net.hyosun.score.utils.Line;

public class ScoreserviceV2 extends ScoreserviceV1 {


	public ScoreserviceV2() {
		this(10);
	}

	public ScoreserviceV2(int length) {
		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생이름 리스트를 배열로 받아서 초기화하기
	public ScoreserviceV2(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void printScore() {
		int KorTotal = 0;
		int engTotal = 0;
		int MathTotal = 0;
		int SumTotal = 0;
		float avgResult = 0;

		System.out.println(Line.dLine(50));
		System.out.println("빛나고 성적표");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%-3s\t", scores[i].getStName() + "\t");
			System.out.printf("%4d\t", scores[i].getIntKor());
			System.out.printf("%4d\t", scores[i].getIntENG());
			System.out.printf("%4d\t", scores[i].getIntMath());
			System.out.printf("%6d\t", scores[i].getIntSum());
			System.out.printf("%4+.2f\n", scores[i].getfAge());
			KorTotal += scores[i].getIntKor();
			engTotal += scores[i].getIntKor();
			MathTotal += scores[i].getIntKor();
			SumTotal += scores[i].getIntKor();

			avgResult += scores[i].getfAge();

		}
		System.out.print(Line.sLine(50));
		System.out.printf("%-6s\t", "총점");
		System.out.printf("%4d\t", KorTotal);
		System.out.printf("%4d\t", engTotal);
		System.out.printf("%4d\t", MathTotal);
		System.out.printf("%6d\t", SumTotal);
		System.out.printf("%4+.2f\n", avgResult/scores.length);

	}

}
