package net.hyuun.todo.service.impl;

import java.util.Scanner;

import com.callor.utils.Line;

import net.hyuun.todo.service.InputService;

public class InputServiceImplV1 implements InputService{
	
	private final Scanner scan;
	public InputServiceImplV1() {
		scan=new Scanner(System.in);
	}

	
	
	
	@Override
	public Integer Menu() {
		System.out.println(Line.dLine(50));
		System.out.println("업무를 선택하세요");
		System.out.println(Line.sLine(50));
		System.out.println("1.TODO 추가하기");
		System.out.println("2.TODO List보기");
		System.out.println("3.Key로 검색하기");
		System.out.println("4.완료처리하기");
		System.out.println("5.종료하기");
		System.out.println(Line.sLine(50));
		System.out.println("선택>>");
		String strMenu =scan.nextLine();
		Integer intMenu =0;
		try {
			intMenu=Integer.valueOf(strMenu);
		} catch (Exception e) {
			return null;
		}
		return intMenu;
	}

	@Override
	public String inputContent() {
		System.out.println("할일>>");
		String content =scan.nextLine();
		
		return content;
	}

}