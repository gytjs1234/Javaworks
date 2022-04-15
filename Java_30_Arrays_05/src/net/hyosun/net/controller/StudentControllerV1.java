package net.hyosun.net.controller;

import net.hyosun.net.service.StudentServiceV1;

public class StudentControllerV1 {
	public static void main(String[] args) {
		
		//기본생성자를 호출하여 인스턴스 생성
		StudentServiceV1 stv10 = new StudentServiceV1();
		
		//임의생성자를 호출하여 인스턴스 생성
		StudentServiceV1 stv = new StudentServiceV1(3);
		
		stv.inputStudent();
		stv.printStudent();
		
	}

}
