package net.hyosun.app.controller;

import net.hyosun.app.service.ScoreService;

public class ControllerV1 {
	public static void main(String[] args) {
		ScoreService sv1=new ScoreService();
		System.out.print("학번\t"+"국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균\t\n");
		System.out.println("============================================");
		sv1.makeScore();
		 sv1.printScore();
		 
		
	}

}
