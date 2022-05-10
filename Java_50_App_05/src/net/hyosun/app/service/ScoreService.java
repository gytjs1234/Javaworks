package net.hyosun.app.service;

import java.util.ArrayList;
import java.util.List;

import net.hyosun.app.ScoreVO;

public class ScoreService {

	private List<ScoreVO> scList;

	public ScoreService() {
		scList = new ArrayList<>();

	}
	public void makeScore() {
		for (int i = 0; i < 20; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + 1);
			int kor = (int) (Math.random() * 50) + 51;
			int eng = (int) (Math.random() * 50) + 51;
			int math = (int) (Math.random() * 50) + 51;
			int total=kor+eng+math;
			int average=total/3;
			
			scVO.setAverage(average);
			scVO.setTotal(total);
			scVO.setIntKor(kor);
			scVO.setIntEng(eng);
			scVO.setIntMath(math);
			scList.add(scVO);

		}
	}

	public void printScore() {
		for (ScoreVO scVO : scList) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", scVO.getStNum(), scVO.getIntKor(), scVO.getIntEng(),
					scVO.getIntMath(),scVO.getTotal(),scVO.getAverage());

		}

	}

}
