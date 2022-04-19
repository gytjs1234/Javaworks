package net.hyosun.score.Controller;

import net.hyosun.score.service.ScoreserviceV1;

public class ControllerV1 {
	public static void main(String[] args) {
		String[]stNames = {"홍길동","이몽룡","성춘향","임꺽정","장영자"};
	
		ScoreserviceV1 scv1 =new ScoreserviceV1(stNames);
		scv1.makeScore();
		scv1.printScore();
	}
}
