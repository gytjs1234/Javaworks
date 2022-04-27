package net.hyosun.app.controller;

import java.util.List;

import net.hyosun.app.service.ServiceV1;

public class ControllerV1 {
	public static void main(String[] args) {
		ServiceV1 sV1 = new ServiceV1();
		sV1.makeScore();

		// 객체(method> chaining을 사용하여 코드 줄이기
		System.out.println(sV1.getIntList().toString());
		

		List<Integer> result = sV1.getIntList();
		System.out.println(result.toString());

	}

}
