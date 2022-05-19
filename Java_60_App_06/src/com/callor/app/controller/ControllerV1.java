package com.callor.app.controller;

import com.callor.app.service.impl.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class ControllerV1 {
	public static void main(String[] args) {
		ScoreService sv1 =new ScoreServiceImplV1();
		
		sv1.makeScore();
	}
	
}
