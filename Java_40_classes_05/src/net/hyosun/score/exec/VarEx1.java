package net.hyosun.score.exec;

import net.hyosun.service.ScoreService;
import net.hyosun.service.Impl.ScoreServiceImplV1;
import net.hyosun.service.domain.StudentVO;

public class VarEx1 {
	public static void main(String[] args) {

		// *primitive(기본)type keyword*
		// primitive type 변수 선언
		int num1 = 100;
		float num2 = 100.3f;
		boolean bYes = true;

		// *class type Keyword*
		// class type 변수 선언
		// 참조형 변수 선언(주소 참조형 변수)

		// 인티저클래스타입 ,인티저형
		Integer inNum1 = 100;
		// Float클래스타입 float타입
		Float fNum2 = 100.3f;
		Boolean byes1 = true;

		// 스트링 클래스타입 또는 문자열형변수
		String str = "Korea";

		// 클래스타입의변수
		StudentVO stVO = new StudentVO();
		// 배열형
		StudentVO[] stList = new StudentVO[10];

		// ScoreService 클래스타입,인터페이스
		ScoreService sv = new ScoreServiceImplV1();

	}

}
