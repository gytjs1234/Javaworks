package net.hyuun.todo.service.impl;

import java.util.List;
import java.util.Scanner;

import com.callor.utils.Line;

import net.hyosun.model.todo.TodoVO;
import net.hyuun.todo.service.InputService;
import net.hyuun.todo.service.TodoService;

public class InputServiceImplV1 implements InputService {

	protected final Scanner scan;

	public InputServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer Menu() {
		System.out.println(Line.dLine(50));
		System.out.println("업무를 선택하세요");
		System.out.println(Line.sLine(50));
		System.out.println("1.TODO 추가하기");
		System.out.println("2.TODO List보기");
		System.out.println("3.TODO 변경하기");
		System.out.println("4.완료처리하기");
		System.out.println("5.파일에 저장하기");
		System.out.println("6.종료하기");
		System.out.println(Line.sLine(50));
		System.out.println("선택>>");

		String strMenu = scan.nextLine();
		Integer intMenu = 0;
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			return null;
		}
		return intMenu;
	}

	@Override
	public String inputContent() {
		System.out.println("할일>>");
		String content = scan.nextLine();

		return content;
	}

	@Override
	public Integer selectTodo() {

		return null;

	}

}
