package net.hyosun.net.controller;

import net.hyosun.net.service.StudentServiceV2;

public class StudentControllerV2 {
	public static void main(String[] args) {
		StudentServiceV2 stv2 = new StudentServiceV2(3);
		stv2.inputStudent();
		stv2.printStudent();
	}
}
