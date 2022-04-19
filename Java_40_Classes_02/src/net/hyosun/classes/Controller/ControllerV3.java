package net.hyosun.classes.Controller;

import net.hyosun.classes.service.ScoreServiceV3;

public class ControllerV3 {
	public static void main(String[] args) {
		ScoreServiceV3 scv3 =new ScoreServiceV3();
		scv3 =new ScoreServiceV3(20);
		//String[]strNames=new String[5];
		//strNames[0]="홍길동";
		//strNames[1]="이몽룡";
		//strNames[2]="춘향";
		//strNames[3]="장보고";
		String[]strNames ={"홍길동","이몽룡","춘향","장보고"};
		scv3 = new ScoreServiceV3(strNames);
	}

}
