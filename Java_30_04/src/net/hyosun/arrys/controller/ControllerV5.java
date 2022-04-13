package net.hyosun.arrys.controller;

import net.hyosun.arrys.service.ScoreServiceV5;

public class ControllerV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreServiceV5 sv5 =new ScoreServiceV5();
		sv5.makeScore();
		sv5.printScore();
		sv5.sumScore();
	}

}
