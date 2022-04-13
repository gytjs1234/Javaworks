package net.hyosun.arrys.controller;

import net.hyosun.arrys.service.ScoreServiceV4;

public class ScorecontrollerV4 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreServiceV4 sv4 = new ScoreServiceV4(150);
		sv4.makeScore();
		sv4.printSocre();
		
	}

}
