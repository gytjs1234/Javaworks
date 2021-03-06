package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {
	public static void main(String[] args) {
		ScoreService svc =new ScoreServiceImplV1();
		svc.makeScore();
		
		
	}
	

	/*
	 * 생성자 패턴 클래스 영역(필드영역)에서 변수,객체 배열 등을 선언만하고 private 으로 접근제한을 하고 객체와 배열은 final 로
	 * 선언하고 (java 에서는기본, spring 임의)생성자 method에서 선언된 변수를 초기화 (생성,사용할 준비)를 한다
	 * 
	 * 만약 이 클래스를 상속할 수 있도록 하려면 변수를 protected로 변경
	 */
	private final List<ScoreVO> list;

	public ScoreServiceImplV1() {
		list = new ArrayList<>();
	}

	@Override
	public void makeScore() {

		for (int i = 0; i < 10; i++) {
			int intkor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;
			ScoreVO svo = new ScoreVO();
			svo.setKor(intkor);
			svo.setEng(intEng);
			svo.setMath(intMath);
			list.add(svo);
			System.out.println(svo);
		}

	}
	

	@Override
	public void printScore() {

	}

	@Override
	public void sumScore() {

	}

	@Override
	public void avgScore() {

	}

}
