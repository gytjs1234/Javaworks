package net.hyosun.app.controller;

import net.hyosun.app.service.ServiceV2;

public class ControllerV2 {
	/*
	 * Service 클래스에 구구단 3단을 출력하는 guguDan()를 선언하고 guguDan()는 3단 구구단을 출력한다.
	 * ControllerV2에서는 guguDan()호출하아 구구단을 보여준다
	 * 
	 */
	public static void main(String[] args) {

		ServiceV2 serviceV2 =new ServiceV2();
		serviceV2.guguDan();
		System.out.println("================");
		serviceV2.guguDan(5);
	}
}
