package net.hyuun.todo.controller;

import java.util.List;

import net.hyuun.model.todo.TodoVO;
import net.hyuun.todo.service.TodoService;
import net.hyuun.todo.service.impl.TodoServiceImplV1;

public class TodoController {
	public static void main(String[] args) {
		
		TodoService tService =new TodoServiceImplV1();
		tService.todoInsert("오늘은 행복한 화요일");
		
		List<TodoVO>todoList=tService.todoSelectAll();
		
		for(TodoVO tVO:todoList) {
			System.out.println(tVO.toString());
		}
		
	}

}
