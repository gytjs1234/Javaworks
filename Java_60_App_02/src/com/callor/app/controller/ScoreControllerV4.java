package com.callor.app.controller;

import com.callor.service.ScoreService;
import com.callor.service.impl.ScoreServiceImplV4;

public class ScoreControllerV4 {
	public static void main(String[] args) {
		
		ScoreService scV4=new ScoreServiceImplV4();
		scV4.inputScore();
		scV4.saveScore();
	}

}

