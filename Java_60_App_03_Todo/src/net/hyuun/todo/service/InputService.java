package net.hyuun.todo.service;

/*
 * Scanner 을 이용해서 키보드에서 입력받는 일을 대신 수행할 클래스 정의
 */
public interface InputService {

	public Integer Menu();
	//콘텐트를 입력받을 친구
	public String inputContent();
	public Integer selectTodo();
	
	

}
