package com.callor.app.controller;

import com.callor.service.ScoreService;
import com.callor.service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {
	public static void main(String[] args) {
		
		ScoreService scV3=new ScoreServiceImplV3();
		scV3.inputScore();
		scV3.saveScore();
	}

}

