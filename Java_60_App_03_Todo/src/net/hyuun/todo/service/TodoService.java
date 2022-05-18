package net.hyuun.todo.service;

import java.io.IOException;
import java.util.List;

import net.hyosun.model.todo.TodoVO;

public interface TodoService {
	
	//TOdo 를 추가하기
	public void todoInsert(String content);
	//전체 TOdoList 조회하기
	public List<TodoVO> todoSelectAll();
	
	//Key 값으로 1개의 TodoList 조회하기
	public void findByKey(String key); 
	
	
	//Todo내용 변경하기
	//할일을 완료했을때 사용할 method
	//public void update(TodoVO tVO);
	
	//2022-05-13설계변경
	//update method 를 변경하기
	//
	public void comTodo(Integer num);
	
	//TodoList 내용을 파일에 저장하기
	public void saveTodo(String fileName) throws IOException;
	

}
