package net.hyosun.score.Controller;

import net.hyosun.score.service.ScoreserviceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		
		String[]stNames = {"홍","길","동","성","춘"};
		
		ScoreserviceV2 scv2 =new ScoreserviceV2(stNames);
		 scv2.makeScore();
		 scv2.printScore();
	
	}
}
