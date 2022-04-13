package net.hyosun.arrys.controller;

import net.hyosun.arrys.service.ScoreServiceV2;

public class ScoreControllerV2 {
public static void main(String[] args) {
	
	ScoreServiceV2 sv2 = new ScoreServiceV2();
	sv2.makeScore();
	sv2.printSocre();
}
}
