package com.callor.app.controller;

import com.callor.service.ScoreService;
import com.callor.service.impl.ScoreServiceImplV2;

public class ScoreControllerV2 {
	public static void main(String[] args) {
		
		ScoreService scV2=new ScoreServiceImplV2();
		scV2.inputScore();
	}

}

