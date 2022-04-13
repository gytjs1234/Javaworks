package net.hyosun.arrys.controller;

import net.hyosun.arrys.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreServiceV3 sv3 =new ScoreServiceV3();
		sv3.printNo1Score();
		//ScoreServiceV3에 선언된 intKor배열은
		//private 접근 제한자가 설정 되어 있기 때문에
		//인스턴스를 통하여 배열에 접근 할수없다.
		//sv3.intKor[1]=100;
		sv3.printNo1Score();
	}

}
