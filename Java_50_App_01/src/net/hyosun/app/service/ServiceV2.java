package net.hyosun.app.service;

import java.util.List;

public class ServiceV2 {

	private final List<Integer> intList;

	// ihntLIst를 직접초기화 하지않고
	// ServiceV2를 사용하는 곳에서 주입하기
	public ServiceV2(List<Integer> intList){
		this.intList = intList;
	}
	// length변수를 매개변수받아서
	// 개수만큼의 random수를 저장한
	// intList를 return

	public List<Integer> getScore(int length){
		for (int i = 0; i < length; i++) {
			int rnd = (int)(Math.random() * 100) + 1;
			intList.add(rnd);
		}
		return intList;
	}
}
