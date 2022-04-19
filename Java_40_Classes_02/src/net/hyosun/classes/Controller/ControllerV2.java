package net.hyosun.classes.Controller;

import net.hyosun.classes.service.ScoreServiceV1;

public class ControllerV2 {
	public static void main(String[] args) {
		ScoreServiceV1 sv1 =new ScoreServiceV1(3);
		int intresult =sv1.input();
		if(intresult<0) {
			System.out.println("입력 도중 중단함");
			
		}else {
			System.out.println("입력을 모두 마침");
		}
		
		
		
		
		
	}
	

}
