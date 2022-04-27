package net.hyosun.score.service;

import net.hyosun.score.domain.ScoreV2VO;
import net.hyosun.score.utils.Line;

public class ScoreserviceV1 {
	int KorSum;
	int mathSum;
	int totalSum;
	float avgSum;

	public ScoreserviceV1() {
		this(10);
	}

	protected  ScoreV2VO[] scores;

	public ScoreserviceV1(int length) {
		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생이름 리스트를 배열로 받아서 초기화하기
	public ScoreserviceV1(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {
		for (int i = 0; i < scores.length; i++) {
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			scores[i].setIntKor(intKor);
			scores[i].setIntENG(intEng);
			scores[i].setIntMath(intMath);

		}
	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고 성적표");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntENG() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n",scores[i].getfAge());
			
			KorSum+=scores[i].getIntKor();
			mathSum+=scores[i].getIntMath();
			totalSum+=scores[i].getIntSum();
			avgSum+=scores[i].getfAge();
			
		}
		System.out.print(Line.sLine(50));
		System.out.print(" \n\t");
		System.out.print(KorSum+"\t");
		System.out.print(mathSum+"\t");
		System.out.print( totalSum+"\t");
		System.out.print(avgSum+"\t");
	}
	


}
