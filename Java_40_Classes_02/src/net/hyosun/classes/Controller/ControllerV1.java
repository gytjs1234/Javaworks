package net.hyosun.classes.Controller;

import net.hyosun.classes.service.ScoreServiceV2;

public class ControllerV1 {
	public static void main(String[] args) {
		ScoreServiceV2 sv2 =new ScoreServiceV2(3);
		int intresult =sv2.input();
		if(intresult<0) {
			System.out.println("입력을 중단했습니다");
			
		}else {
			System.out.println("입력을 모두 완료하였습니다");
		}
		
		
		
		
		
	}
	

}
