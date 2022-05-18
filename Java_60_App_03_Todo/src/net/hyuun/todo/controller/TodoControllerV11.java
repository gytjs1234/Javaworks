package net.hyuun.todo.controller;

import java.util.List;

import net.hyosun.model.todo.TodoVO;
import net.hyuun.todo.service.InputService;
import net.hyuun.todo.service.TodoService;
import net.hyuun.todo.service.impl.InputServiceImplV1;
import net.hyuun.todo.service.impl.TodoServiceImplV1;

public class TodoControllerV11 {
	public static void main(String[] args) {
		TodoService toService = new TodoServiceImplV1();
		InputService inService = new InputServiceImplV1();

		while (true) {
			Integer menu = inService.Menu();
			if (menu == null) {
				System.out.println("업무번호를 잘 선택해");
				continue;
			}
			if (menu == 5){
				break;
			} else if (menu == 1) {
				String content = inService.inputContent();
				toService.todoInsert(content);
			} else if (menu == 2) {
				List<TodoVO> todoList = toService.todoSelectAll();
				for (TodoVO vo : todoList) {
					System.out.println(vo.toString());
				}
				System.out.println();
			}
		}
	}
}
