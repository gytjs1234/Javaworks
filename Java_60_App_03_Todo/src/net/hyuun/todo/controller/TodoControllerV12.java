package net.hyuun.todo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.callor.utils.Line;

import net.hyosun.model.todo.TodoVO;
import net.hyuun.todo.service.InputService;
import net.hyuun.todo.service.TodoService;
import net.hyuun.todo.service.impl.InputServiceImplV2;
import net.hyuun.todo.service.impl.TodoServiceImplV2;

public class TodoControllerV12 {

	public static void main(String[] args) throws IOException {

		TodoService toService = new TodoServiceImplV2();
		InputService inService = new InputServiceImplV2();

		while (true) {

			Integer mainMenu = inService.Menu();
			if (mainMenu == null) {
				System.out.println("업무선택을 다시 하세요");
				continue;
			}
			if (mainMenu == 1) {
				while (true) {
					String content = inService.inputContent();
					if (content.equals("QUIT")) {
						break;
					}
					toService.todoInsert(content);
				}
			} else if (mainMenu == 2) {
				List<TodoVO> todoList = toService.todoSelectAll();
				printTodo(todoList);
			} else if (mainMenu == 3) {
				while (true) {

					List<TodoVO> todoList = toService.todoSelectAll();
					printTodo(todoList);
					System.out.println(Line.dLine(60));
					System.out.println("내용을 변경할 할일을 선택하세요");
					Integer num = inService.selectTodo();

					// 할일을 입력받고
					System.out.println(Line.dLine(60));
					System.out.println("변견할 내용을 입력하세요");
					System.out.println(Line.dLine(60));
					String content=inService.inputContent();
					// 입력받은 내용을 선택한 TodoList 의 반영하기
					
				}

			} else if (mainMenu == 4) {
				while (true) {

					List<TodoVO> todoList = toService.todoSelectAll();
					printTodo(todoList);
					System.out.println(Line.dLine(50));

					System.out.println("완료할 할일을 선택하세요");
					Integer num = inService.selectTodo();
					if (num == null) {
						System.out.println("숫자로만 선택하세요");
						continue;
					}
					if (num == -1)
						break;
					toService.comTodo(num);

				}
			} else if (mainMenu == 5) {
				toService.saveTodo(null);
			} else if (mainMenu == 6) {
				break;
			}
		} // end while
		System.out.println("업무종료 퇴근하자~~~");
	} // end main

	private static void printTodo(List<TodoVO> toVO) {
		System.out.println(Line.dLine(50));
		System.out.print("No\t");
		System.out.print("시작일자\t");
		System.out.print("시작시간\t");
		System.out.print("할일\t");
		System.out.println("상태");
		System.out.println(Line.sLine(50));
		int size = toVO.size();
		for (int i = 0; i < size; i++) {
			System.out.printf("%d\t", i + 1);
			System.out.print(toVO.get(i).getSdate() + "\t");
			System.out.print(toVO.get(i).getStime() + "\t");
			System.out.print(toVO.get(i).getTContent() + "\t");

			String comp = toVO.get(i).getEdate() == null || toVO.get(i).getEdate().isBlank() ? "진행중~~" : "~~완료됨";
			System.out.println(comp);
		}
	}

}
