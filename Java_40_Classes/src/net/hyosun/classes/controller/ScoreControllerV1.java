package net.hyosun.classes.controller;

import net.hyosun.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {
public static void main(String[] args) {
	ScoreServiceV1 sv1= new ScoreServiceV1(3);
	sv1.input();
	sv1.print();
	
	
}
}
