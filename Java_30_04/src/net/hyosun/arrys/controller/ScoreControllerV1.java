package net.hyosun.arrys.controller;

import net.hyosun.arrys.service.ScoreServiceV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		ScoreServiceV1 sv1 = new ScoreServiceV1();
		sv1.makeScore();
		sv1.printSocre();
		
		
	}
}
