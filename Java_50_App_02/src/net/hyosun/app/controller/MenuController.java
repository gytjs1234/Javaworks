package net.hyosun.app.controller;

import java.util.Scanner;

import net.hyosun.app.utils.Line;

//6
public class MenuController {

	private final int lineLength;
	private final Scanner scan;

	public MenuController() {
		lineLength = 50;
		scan = new Scanner(System.in);
	}

	public void viewMainMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("고려고교 학사관리 2022");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1. 학생정보 관리");
		System.out.println("2.성적정보 관리");
		System.out.println("QUIT:업무 종료");
		System.out.println(Line.sLine(lineLength));
		System.out.println("업무를 선택하세요(QUIT:종료)>>");

	}

	public void viewStMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("학생정보 관리");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1.학생정보 Loading");
		System.out.println("2.학생정보 전체보기");
		System.out.println("3.학번으로 검색하기");
		System.out.println("4.이름으로 검색하기");
		System.out.println("QUIT:Main MENU 로 가기");
		System.out.println(Line.sLine(lineLength));
		System.out.println("업무 선택>>");

	}

	public void viewSCMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("성적정보 관리");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1.성적파일 Loading");
		System.out.println("2.전체 성적리스트 보기");
		System.out.println("3.학번으로 검색하기");
		System.out.println("4.이름으로 검색하기");
		System.out.println("QUIT:Main MENU 로 가기");
		System.out.println(Line.sLine(lineLength));
		System.out.print("업무 선택>>");

	}

	public Integer selectMenu() {

		String strKey = scan.nextLine();
		if (strKey.equals("QUIT")) {
			return -1;
		}
		Integer intKey = 0;

		try {
			intKey = Integer.valueOf(strKey);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return intKey;
	}

}
